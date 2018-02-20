
public abstract class AbstractStack<E> implements Stack<E> {
	/**
	 * Metodo que inserta un elemento al stack
	 * 
	 * @param item
	 *            Elemento a insertar
	 */
	@Override
	public abstract void push(E item);

	/**
	 * Metodo que elimina un elemento del stack
	 * 
	 * @return El elemento eliminado
	 */
	@Override
	public abstract E pop();

	/**
	 * Metodo que permite visualizar el primer elemento del stack
	 * 
	 * @return Primer elemento del stack
	 */
	@Override
	public abstract E peek();

	/**
	 * Metodo que regresa el tamano del stack
	 * 
	 * @return Tamano del Stack
	 */
	@Override
	public abstract int size();

	/**
	 * Metodo que devuelve si esta vacio el stack
	 * 
	 * @return Verdadero si esta vacio
	 */
	@Override
	public boolean empty() {
		return size() == 0;
	}
}
