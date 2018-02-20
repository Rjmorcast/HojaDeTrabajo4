/**
 * Clase abstracta para los stacks. Basada en el diseño de factory de Design
 * Patterns de James Cooper
 * 
 * @author Javier Anleu - 17149
 * 
 *
 * @param <E>
 *            de tipo genérico
 */
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
	 * Método que elimina un elemento del stack
	 * 
	 * @return El elemento eliminado
	 */
	@Override
	public abstract E pop();

	/**
	 * Método que permite visualizar el primer elemento del stack
	 * 
	 * @return Primer elemento del stack
	 */
	@Override
	public abstract E peek();

	/**
	 * Método que regresa el tamano del stack
	 * 
	 * @return Tamano del Stack
	 */
	@Override
	public abstract int size();

	/**
	 * Método que devuelve si esta vacio el stack
	 * 
	 * @return Verdadero si esta vacio
	 */
	@Override
	public boolean empty() {
		return size() == 0;
	}
}
