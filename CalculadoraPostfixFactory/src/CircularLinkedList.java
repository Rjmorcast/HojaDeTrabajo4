import java.util.Iterator;

/**
 * Es una clase para listas encadenadas circulares. Está basada en lo descrito
 * por Java Structures de Duane Bailey
 * 
 * @author Javier Anleu - 17149
 *
 * @param <E>
 *            tipo genérico
 */
public class CircularLinkedList<E> extends AbstractList<E> {
	protected Node<E> tail;
	protected int count;

	/**
	 * Inserta un elemento a la lista.
	 * 
	 * @param value
	 *            Elemento a insertar.
	 */
	@Override
	public void addFirst(E value) {
		Node<E> temp = new Node<E>(value);
		if (tail == null) {
			tail = temp;
		} else {
			temp.setNext(tail.next());
			tail.setNext(temp);
		}
		count++;
	}

	/**
	 * Elimina el primer elemento de la lista
	 * 
	 * @return Elemento que se elimina
	 */
	@Override
	public E removeFirst() {

		E valor = null;
		if (size() > 0) {
			Node<E> head = tail.next();
			if (head != null) {
				tail.setNext(head.next());
				valor = head.data;
			} else {
				valor = tail.data;
				tail = null;
			}
		} else
			return null;
		count--;
		return valor;
	}

	/**
	 * @see List
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
	public void addLast(E value) {

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
