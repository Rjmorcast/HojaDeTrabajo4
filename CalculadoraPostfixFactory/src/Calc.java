/**
 * Esta es la clase que actúa como el controlador. Tiene elementos de
 * StackArrayList y se encarga de implementar sus métodos y los de la interfaz
 * calculadora para calcular una operación de un archivo de texto en formato
 * PostFix.
 *
 * @author Rodrigo Morales
 * @author Javier Anleu
 * @version 1.0
 */
public class Calc implements calculadora {

	/**
	 * ArrayList que se utiliza para calcular las operaciones
	 */
	private List<String> miStack;

	/**
	 * Constructor de la clase
	 */
	public Calc(String type) {
		abstractFactory<String> factory = FactoryProducer.getFactory();
		miStack = factory.getList(type);
	}

	/**
	 * @return the miStack
	 */
	public List<String> getMiStack() {
		return miStack;
	}

	/**
	 * @param miStack
	 *            the miStack to set
	 */
	public void setMiStack(List<String> miStack) {
		this.miStack = miStack;
	}

	/**
	 * Es el método que se encarga de calcular el resultado de la operación en el
	 * archivo de texto por medio de los métodos descritos anteriormente
	 */
	@Override
	public double operar(String expresion) {
		double resultado = 0;
		String subcadena = "";
		boolean execute = true;

		// For que corrobora que la expresión contenga únicamente caracteres válidos
		for (int i = 0; i < expresion.length(); i++) {
			if (expresion.substring(i, i + 1).contains("1") == false
					&& expresion.substring(i, i + 1).contains("2") == false
					&& expresion.substring(i, i + 1).contains("3") == false
					&& expresion.substring(i, i + 1).contains("4") == false
					&& expresion.substring(i, i + 1).contains("5") == false
					&& expresion.substring(i, i + 1).contains("6") == false
					&& expresion.substring(i, i + 1).contains("7") == false
					&& expresion.substring(i, i + 1).contains("8") == false
					&& expresion.substring(i, i + 1).contains("9") == false
					&& expresion.substring(i, i + 1).contains(" ") == false
					&& expresion.substring(i, i + 1).contains("+") == false
					&& expresion.substring(i, i + 1).contains("-") == false
					&& expresion.substring(i, i + 1).contains("*") == false
					&& expresion.substring(i, i + 1).contains("/") == false) {
				execute = false;
			}
		}
		// System.out.println(execute);
		if (execute == true) {// Si los caracteres de la expresión son válidos, ejecuta la operación
			for (int i = 0; i < expresion.length(); i++) {
				subcadena = expresion.substring(i, i + 1);
				// System.out.println(subcadena + "...subcadena");
				if (!" ".equals(subcadena)) {
					// System.out.println("Entro al if");
					switch (subcadena) {
					case "+":
						// System.out.println("Entro a suma");
						// System.out.println(miStack.peek());
						// System.out.println("Sí pasa el peek");
						sumar();
						continue;
					case "-":
						restar();
						continue;
					case "*":
						multiplicar();
						continue;
					case "/":
						dividir();
						continue;
					default:
						miStack.push(subcadena);
						// System.out.println("holi");
						// System.out.println(miStack.peek());
						// System.out.println("bye");
						continue;
					}
				}
				// System.out.println(miStack.peek());

			}
			resultado = Double.parseDouble(miStack.pop());
		} else {
			resultado = Double.NaN;
		}

		return resultado;
	}

	/**
	 * Método para sumar en la lista
	 */
	private void sumar() {
		double suma;
		// System.out.println("Entro al método de suma");
		double a = Double.parseDouble(miStack.pop());
		// System.out.println(a);
		double b = Double.parseDouble(miStack.pop());
		// System.out.println(b);
		suma = a + b;
		miStack.push(String.valueOf(suma));
	}

	/**
	 * Método para restar en la lista
	 */
	private void restar() {
		double resta;
		double a = Double.parseDouble(miStack.pop());
		double b = Double.parseDouble(miStack.pop());
		resta = b - a;
		miStack.push(String.valueOf(resta));
	}

	/**
	 * Método para multiplicar en la lista
	 */
	private void multiplicar() {
		double multiplicacion;
		double a = Double.parseDouble(miStack.pop());
		double b = Double.parseDouble(miStack.pop());
		multiplicacion = b * a;
		miStack.push(String.valueOf(multiplicacion));
	}

	/**
	 * Método para dividir en la lista
	 */
	private void dividir() {
		double division;
		double a = Double.parseDouble(miStack.pop());
		double b = Double.parseDouble(miStack.pop());

		// Try para prevenir la división dentro de 0.
		try {
			division = b / a;
		} catch (Exception e) {
			miStack.push(String.valueOf(Double.NaN));
		}
		division = b / a;

		miStack.push(String.valueOf(division));
	}

}
