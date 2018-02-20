
public class StackFactory<E> extends abstractFactory<E> {

	/*--TIPOS DE STACK */
	public static final String ARRAYLIST = "ARRAYLIST";
	public static final String VECTOR = "VECTOR";

	/**
	 * getStack: devuelve una Stack<E> entre dos posibles implementaciones,
	 * StackArrayList o StackVector.
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
