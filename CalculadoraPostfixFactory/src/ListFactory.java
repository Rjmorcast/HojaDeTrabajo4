
public class ListFactory<E> extends abstractFactory<E> {

	@Override
	public List<E> getList(String type) {
		if (type.equals(null)){
			return null;
		}
		if (type.equals("SINGLE")) {
			return new SinglyLinkedList<E>();
		} else if (type.equals("DOUBLE")) {
			return new DoublyLinkedList<E>();
		} else if (type.endsWith("CIRCLE")) {
			return new CircularList<E>();
		}
		return null;
	}

}
