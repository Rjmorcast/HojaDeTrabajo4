
public class StackDoubly<E> extends AbstractStack<E> {
	private DoublyLinkedList<E> stack;

	/**
	 * Constructor: crea una instancia de una DoublyLinkedList.
	 */
	public StackDoubly() {
		stack = new DoublyLinkedList<>();
	}

	/**
	 * push: anade un elemento a la lista doblemente encadenada.
	 */
	@Override
	public void push(E item) {
		stack.addFirst(item);
	}

	/**
	 * pop: devuelve el primer elemento en la lista doblemente encadenada y lo
	 * elimina de la lista.
	 */
	@Override
	public E pop() {
		return stack.removeFirst();
	}

	/**
	 * peek: devuelve el primer elemeto de la lista doblemente encadenada.
	 */
	@Override
	public E peek() {
		return stack.getFirst();
	}

	/**
	 * size: devuelve el tamano de la lista doblemente encadenada.
	 */
	@Override
	public int size() {
		return stack.size();
	}
}
