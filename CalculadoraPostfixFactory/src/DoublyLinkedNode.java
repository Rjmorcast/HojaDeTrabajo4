/**
 * Clase para nodos dobles. Basada en lo descrito en Java Structures por Duane
 * Bailey
 * 
 * @author Javier Anleu - 17149
 *
 * @param <E>
 *            tipo genérico
 */
public class DoublyLinkedNode<E> {
	protected E data;
	protected DoublyLinkedNode<E> nextElement;
	protected DoublyLinkedNode<E> previousElement;

	/**
	 * Constructor de la clase
	 * 
	 * @param v
	 * @param next
	 * @param previous
	 */
	public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous) {
		data = v;
		nextElement = next;
		if (nextElement != null)
			nextElement.previousElement = this;
		previousElement = previous;
		if (previousElement != null)
			previousElement.nextElement = this;
	}

	public DoublyLinkedNode(E v)
	// post: constructs a single element
	{
		this(v, null, null);
	}

	public DoublyLinkedNode<E> previous() {
		return previousElement;
	}

	public DoublyLinkedNode<E> next() {
		return nextElement;
	}

	public void setNext(DoublyLinkedNode<E> element) {
		nextElement = element;
	}

	public void setPrevious(DoublyLinkedNode<E> element) {
		previousElement = element;
	}

	public E value() {
		return data;
	}

}