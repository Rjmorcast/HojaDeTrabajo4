/**
 * Es el factory para los Stacks. Está basada en lo descrito en Design Patterns
 * por James Cooper para patrones de factory.
 * 
 * @author Javier Anleu - 17149
 *
 * @param <E>
 *            tipo genérico
 */
public class StackFactory<E> extends abstractFactory<E> {

	public static final String ARRAYLIST = "ARRAYLIST";
	public static final String VECTOR = "VECTOR";

	/**
	 * getStack: devuelve un tipo de Stack<E>, StackArrayList o StackVector.
	 */
	@Override
	public <E> Stack<E> getStack(String stackType) {
		if (stackType.equalsIgnoreCase(ARRAYLIST))
			return new StackArrayList<>();
		if (stackType.equalsIgnoreCase(VECTOR))
			return new StackVector<>();
		return null;
	}

	@Override
	public <E> List<E> getList(String listType) {
		// TODO Auto-generated method stub
		return null;
	}
}
