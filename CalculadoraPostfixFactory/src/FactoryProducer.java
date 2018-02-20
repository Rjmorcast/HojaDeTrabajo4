
/**
 * Clase que se encarga de devolver los factories según sea solicitado. Basado
 * en lo descrito en Design Patterns de James Cooper
 * 
 * @author Javier Anleu - 17149
 *
 */
public class FactoryProducer {
	public static final String STACK = "STACK";
	public static final String LIST = "LIST";

	/**
	 * Devuelve una instancia de cualquiera de las dos factories.
	 * 
	 * @param factoryType
	 *            Parametro para escoger la factory
	 * @return Instancia de la factory.
	 */
	public static abstractFactory getFactory(String factoryType) {
		if (factoryType.equalsIgnoreCase(STACK)) {
			return new StackFactory();
		}
		if (factoryType.equalsIgnoreCase(LIST)) {
			return new ListFactory();
		}
		return null;
	}
}
