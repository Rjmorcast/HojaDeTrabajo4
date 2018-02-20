/**
 * Es la clase para Stacks simples. Basada en lo descrito en Java Structures por
 * Duane Bailey
 * 
 * @author Javier Anleu - 17149
 *
 * @param <E>
 */
public class StackSingle<E> implements Stack<E> {
	private LinkedList<E> stack;

	/**
	 * Constructor: crea una instancia de una lista simple
	 */
	public StackSingle() {
		stack = new LinkedList<>();
	}

	/**
	 * push: añade un elemento a la lista.
	 */
	@Override
	public void push(E item) {
		stack.addFirst(item);
	}

	/**
	 * pop: devuelve el primer elemento de la lista y lo elimina
	 */
	@Override
	public E pop() {
		return stack.removeFirst();
	}

	/**
	 * peek: devuelve el primer elemento de la lista
	 */
	@Override
	public E peek() {
		return stack.getFirst();
	}

	/**
	 * size: devuelve el tamaño de la lista
	 */
	@Override
	public int size() {
		return stack.size();
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}
}
