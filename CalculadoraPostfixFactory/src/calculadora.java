/**
 * Esta interfaz es la que tiene el método operar para obtener el resultado del
 * archivo de texto.
 * 
 * @author Javier Anleu
 * @version 1.0 fecha=26-1-18
 */
public interface calculadora {
	/**
	 * Este es el método para operar
	 * 
	 * @param expresion
	 *            un String con el formato para operar
	 * @return un entero con el resultado de la operacion
	 */
	public double operar(String expresion);

}