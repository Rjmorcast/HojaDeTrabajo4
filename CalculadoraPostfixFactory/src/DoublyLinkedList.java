import java.util.Iterator;

/**
 * Es la clase que se utiliza para listas de nodos dobles. Está basada en lo
 * descrito en Java Structures de Duane Bailey
 * 
 * @author Javier Anleu - 17149
 *
 * @param <E>
 *            tipo genérico
 */
public class DoublyLinkedList<E> extends AbstractList<E> {
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;

	/**
	 * Constructor --
	 */
	public DoublyLinkedList()
	// post: constructs an empty list
	{
		head = null;
		tail = null;
		count = 0;
	}

	/**
	 * @see List
	 */
	public void addFirst(E value)
	// pre: value is not null
	// post: adds element to head of list
	{
		// construct a new element, making it head
		head = new DoublyLinkedNode<E>(value, head, null);
		// fix tail, if necessary
		if (tail == null)
			tail = head;
		count++;
	}

	/**
	 * @see List
	 */
	public void addLast(E value)
	// pre: value is not null
	// post: adds new value to tail of list
	{
		// construct new element
		tail = new DoublyLinkedNode<E>(value, null, tail);
		// fix up head
		if (head == null)
			head = tail;
		count++;
	}

	/**
	 * @see List
	 */
	public E removeLast() {
		DoublyLinkedNode<E> temp = tail;
		tail = tail.previous();
		if (tail == null) {
			head = null;
		} else {
			tail.setNext(null);
		}
		count--;
		return temp.value();
	}

	/**
	 * @see List
	 */
	@Override
	public E removeFirst() {
		DoublyLinkedNode<E> temp = head;
		head = head.next();
		if (head == null) {
			tail = null;
		} else {
			head.setPrevious(null);
		}
		count--;
		return temp.value();
	}

	/**
	 * Método que devuelve el tamaño de la lista
	 * 
	 * @return Tamaño de la lista
	 */
	@Override
	public int size() {
		return count;
	}

	/**
	 * @see List
	 */
	@Override
	public void clear() {

	}

	/**
	 * @see List
	 */
	@Override
	public E getFirst() {
		return null;
	}

	/**
	 * @see List
	 */
	@Override
	public E getLast() {
		return null;
	}

	/**
	 * @see List
	 */
	@Override
	public E remove(E value) {
		return null;
	}

	/**
	 * @see List
	 */
	@Override
	public void add(E value) {

	}

	/**
	 * @see List
	 */
	@Override
	public E remove() {
		return null;
	}

	/**
	 * @see List
	 */
	@Override
	public E get() {
		return null;
	}

	/**
	 * @see List
	 */
	@Override
	public int indexOf(E value) {
		return 0;
	}

	/**
	 * @see List
	 */
	@Override
	public int lastIndexOf(E value) {
		return 0;
	}

	/**
	 * @see List
	 */
	@Override
	public E get(int i) {
		return null;
	}

	/**
	 * @see List
	 */
	@Override
	public E set(int i, E o) {
		return null;
	}

	/**
	 * @see List
	 */
	@Override
	public void add(int i, E o) {

	}

	/**
	 * @see List
	 */
	@Override
	public E remove(int i) {
		return null;
	}

	/**
	 * @see List
	 */
	@Override
	public Iterator<E> iterator() {
		return null;
	}
}