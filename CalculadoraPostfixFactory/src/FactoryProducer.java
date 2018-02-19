
public class FactoryProducer {

	public static <E> abstractFactory<E> getFactory() {
		return new ListFactory<E>();
	}
}
