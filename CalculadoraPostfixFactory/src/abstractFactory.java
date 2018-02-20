
public abstract class abstractFactory<E> {
	public abstract List<E> getList(String type);
	public abstract Stack<E> getStack(String type);
}
