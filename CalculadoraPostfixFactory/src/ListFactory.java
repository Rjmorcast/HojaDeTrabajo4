/**
 * Factory para las listas. A partir de ella se obtienen las instancias de las
 * listas simples, dobles y circulares. Basada en lo descrito en Design Patterns
 * de James Cooper.
 * 
 * @author Javier Anleu - 17149
 *
 * @param <E>
 *            tipo genérico
 */
public class ListFactory<E> extends abstractFactory<E> {

	public static final String LINKED = "LINKED";
	public static final String DOUBLYLINKED = "DOUBLYLINKED";
	public static final String CIRCULARLINKED = "CIRCULARLINKED";

	/**
	 * Devuelve un stack implementado con listas
	 * 
	 * @param stackType
	 *            Tipo de Stack que se desea
	 * @param <E>
	 *            Tipo de dato
	 * @return Instancia de un stack implementado con listas
	 */
	@Override
	public <E> Stack<E> getStack(String stackType) {
		if (stackType.equalsIgnoreCase(LINKED))
			return new StackSingle<E>();
		if (stackType.equalsIgnoreCase(DOUBLYLINKED))
			return new StackDoubly<E>();
		if (stackType.equalsIgnoreCase(CIRCULARLINKED))
			return new StackCircular<E>();
		return null;
	}

	@Override
	public <E> List<E> getList(String listType) {
		// TODO Auto-generated method stub
		return null;
	}

}
