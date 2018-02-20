/**
 * Es la clase de tipo Singleton para la controladora. Está basada en lo
 * descrito en Design Patterns por James Cooper
 * 
 * @author Javier Anleu - 17149
 *
 */
public class SingleObject {
	private static Calc instance;

	private SingleObject(String type) {
		instance = new Calc(type);
	}

	public static Calc getInstance(String type) {
		return instance;
	}

}
