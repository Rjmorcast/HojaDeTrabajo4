import java.util.Vector;

public class StackVector<E> implements Stack<E> {
	protected Vector<E> arreglo;
	public int sp;

	/**
	 * post: constructs a new empty stack
	 */
	public StackVector()

	{
		arreglo = new Vector<E>();
	}

	/**
	 * post: the value is added to the stack; will be popped next if no intervening
	 * push
	 */
	public void push(E item)

	{
		arreglo.add(item);
	}

	/**
	 * pre: stack is not empty post: most recently pushed item is removed and
	 * returned
	 */
	public E pop()

	{
		return arreglo.remove(size() - 1);
	}

	/**
	 * pre: stack is not empty post: top value (next to be popped) is returned
	 */
	public E peek()

	{
		return arreglo.get(size() - 1);
	}

	/**
	 * post: returns the number of elements in the stack
	 */
	public int size()

	{
		return arreglo.size();
	}

	/**
	 * post: returns true if and only if the stack is empty
	 */
	public boolean empty() {
		return size() == 0;
	}
}
