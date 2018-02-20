/**
 * Es la clase abstracta que se utiliza para los factories. Está basada en lo
 * presentado en el diseño de The Design Patterns, por James Cooper
 * 
 * @author Javier Anleu - 17149
 *
 * @param <E>
 *            es genérico
 */
public abstract class abstractFactory<E> {
	/**
	 * Devuelve una instancia del factory para stacks
	 * 
	 * @param stackType
	 *            Tipo de factory que se desea usar
	 * @param <E>
	 *            Tipo de datos
	 * @return Instancia de un Stack
	 */
	public abstract <E> Stack<E> getStack(String stackType);

	/**
	 * Devuelve una instancia del factory para listas
	 * 
	 * @param listType
	 *            tipo de lista que se desea usar
	 * @param <E>
	 *            tipo de datos
	 * @return instancia de lista
	 */
	public abstract <E> List<E> getList(String listType);
}
