
public class StackCircular<E> extends AbstractStack<E> {
	private CircularLinkedList<E> stack;

	/**
	 * Metodo constructor
	 */
	public StackCircular() {
		stack = new CircularLinkedList<E>();
	}

	/**
	 * Metodo que inserta un elemento al stack
	 * 
	 * @param item
	 *            elemento a insertar
	 */
	@Override
	public void push(E item) {
		stack.addFirst(item);
	}

	/**
	 * Metodo que elimina el primer elemento del stack
	 * 
	 * @return Elemento que se encontraba al principio del stack
	 */
	@Override
	public E pop() {
		return stack.removeFirst();
	}

	/**
	 * Metodo que permite ver el top del stack sin eleiminarlo
	 * 
	 * @return Top del stack
	 */
	@Override
	public E peek() {
		return stack.getFirst();
	}

	/**
	 * Metodo que devuelve el tamano del stack
	 * 
	 * @return
	 */
	@Override
	public int size() {
		return stack.size();
	}
}
