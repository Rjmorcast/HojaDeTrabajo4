import java.util.Iterator;

/**
 * Interfaz para las listas. Basada en lo descrito por Java Structures de Duane
 * Bailey
 * 
 * @author Javier Anleu - 17149
 *
 * @param <E>
 *            tipo genérico
 */
public interface List<E> {

	/**
	 * @return post: returns number of elements in list
	 */
	public int size();

	/**
	 * @return post: returns true iff list has no elements
	 */
	public boolean isEmpty();

	/**
	 * post: empties list
	 */
	public void clear();

	/**
	 * @param value
	 *            post: value is added to beginning of list
	 */
	public void addFirst(E value);

	/**
	 * @param value
	 *            post: value is added to end of list
	 */
	public void addLast(E value);

	/**
	 * pre: list is not empty post: returns first value in list
	 * 
	 * @return first value in list
	 */
	public E getFirst();

	/**
	 * pre: list is not empty post: returns last value in list
	 * 
	 * @return last value in list
	 */
	public E getLast();

	/**
	 * pre: list is not empty post: removes first value from list
	 * 
	 * @return first value from list
	 */
	public E removeFirst();

	/**
	 * pre: list is not empty post: removes last value from list
	 * 
	 * @return last value from list
	 */
	public E removeLast();

	/**
	 * post: removes and returns element equal to value
	 * 
	 * @param value
	 *            Element
	 * @return element equal to value
	 */
	public E remove(E value);

	/**
	 * value is added to tail of list
	 * 
	 * @param value
	 *            element
	 */
	public void add(E value);

	/**
	 * pre: list has at least one element post: removes last value found in list
	 * 
	 * @return last value found in list
	 */
	public E remove();

	/**
	 * pre: list has at least one element post: returns last value found in list
	 * 
	 * @return last value found in list
	 */
	public E get();

	/**
	 * pre: value is not null post: returns true iff list contains an object equal
	 * to value
	 * 
	 * @param value
	 *            Element
	 * @return True if list contains object equal to value
	 */
	public boolean contains(E value);

	/**
	 * pre: value is not null post: returns (0-origin) index of value,
	 * 
	 * @param value
	 *            value is not null
	 * @return (0-origin) index of value,
	 */
	public int indexOf(E value);

	/**
	 * pre: value is not null post: returns (0-origin) index of value, or -1 if
	 * value is not found
	 * 
	 * @param value
	 *            Value
	 * @return (0-origin) index of value, or -1 if value is not found
	 */
	public int lastIndexOf(E value);

	/**
	 * pre: 0 <= i < size() post: returns object found at that location
	 * 
	 * @param i
	 * @return
	 */
	public E get(int i);

	/**
	 * pre: 0 <= i < size() post: sets ith entry of list to value o; returns old
	 * value
	 * 
	 * @param i
	 *            Index
	 * @param o
	 *            Element
	 * @return old value
	 */
	public E set(int i, E o);

	/**
	 * Add ith entry to list
	 * 
	 * @param i
	 *            Index
	 * @param o
	 *            Element
	 */
	public void add(int i, E o);

	/**
	 * Removes and returns object found at index
	 * 
	 * @param i
	 *            index
	 * @return Element
	 */
	public E remove(int i);

	/**
	 * Returns an interator allowing ordered traversal of elements of list
	 * 
	 * @return Iterator
	 */
	public Iterator<E> iterator();

}