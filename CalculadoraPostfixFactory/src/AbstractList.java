/**
 * Clase abstracta para la formación de listas. Basada en el diseño de factory
 * presentado en Design Patterns de James Cooper
 * 
 * @author Javier Anleu - 17149
 *
 * @param <E>
 *            de tipo genérico
 */
public abstract class AbstractList<E> implements List<E> {

	/**
	 * Does nothing.
	 */
	public AbstractList() {

	}

	/**
	 * @return post: returns true if list has no elements
	 */
	public boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * @param value
	 *            value is not null
	 * @return returns true iff list contains an object equal to value
	 */
	public boolean contains(E value) {
		return -1 != indexOf(value);
	}
}