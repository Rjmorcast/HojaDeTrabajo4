
public class StackSingle<E> implements Stack<E> {
	/*--Lista simplemente encadenada. */
    private LinkedList<E> stack;

    /**
     * Constructor: crea una instancia de una Lista Simplemente Encadenada
     */
    public StackSingle(){
        stack = new LinkedList<>();
    }

    /**
     * push: anade un elemento a la lista simplemente encadenada.
     */
    @Override
    public void push(E item) {
        stack.addFirst(item);
    }

    /**
     * pop: devuelve el primer elemento de la lista simplemente encadenada y lo remueve.
     */
    @Override
    public E pop() {
        return stack.removeFirst();
    }

    /**
     * peek: devuelve el primer elemento de la lista simplemente encadenada.
     */
    @Override
    public E peek() {
        return stack.getFirst();
    }

    /**
     * size: devuelve el tamano de la lista simplemente encadenada.
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
