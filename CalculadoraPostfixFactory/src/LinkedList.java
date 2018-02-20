import java.util.Iterator;

/**
 * Clase para listas de un nodo. Basada en lo descrito en Java Structures por
 * Duane Bailey
 * 
 * @author Javier Anleu - 17149
 *
 * @param <E>
 *            tipo genérico
 */
public class LinkedList<E> extends AbstractList<E> {

	protected int count; // list size
	protected Node<E> head; // ref. to first element

	public LinkedList()
	// post: generates an empty list
	{
		head = null;
		count = 0;
	}

	/**
	 * @see List
	 */
	public int size()
	// post: returns number of elements in list
	{
		return count;
	}

	/**
	 * @see List
	 */
	public void addFirst(E value)
	// post: value is added to beginning of list
	{
		// note order that things happen:
		// head is parameter, then assigned
		head = new Node<E>(value, head);
		count++;
	}

	/**
	 * @see List
	 */
	public E removeFirst()
	// pre: list is not empty
	// post: removes and returns value from beginning of list
	{
		Node<E> temp = head;
		head = head.next(); // move head down list
		count--;
		return temp.value();
	}

	/**
	 * @see List
	 */
	public E getFirst()
	// pre: list is not empty
	// post: returns first value in list
	{
		return head.value();
	}

	/**
	 * @see List
	 */
	public void addLast(E value)
	// post: adds value to end of list
	{
		// location for new value
		Node<E> temp = new Node<E>(value, null);
		if (head != null) {
			// pointer to possible tail
			Node<E> finger = head;
			while (finger.next() != null) {
				finger = finger.next();
			}

			finger.setNext(temp);
		} else
			head = temp;

		count++;

	}

	/**
	 * @see List
	 */
	public boolean contains(E value)
	// pre: value is not null
	// post: returns true iff value is found in list
	{
		Node<E> finger = head;

		while (finger != null && !finger.value().equals(value)) {
			finger = finger.next();
		}
		return finger != null;
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
	public E getLast() {
		return null;
	}

	/**
	 * @see List
	 */
	@Override
	public E removeLast() {
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
