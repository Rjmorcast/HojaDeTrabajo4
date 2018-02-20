
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Es el principal del programa.

 * @author Javier Anleu
 * @version 1.0
 * @since January 26, 2018
 */
public class MainCalc {

	private static Scanner teclado;

	public static void main(String[] arg) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		teclado = new Scanner(System.in);

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(
					"C:\\Users\\javia\\Desktop\\OneDrive para la Empresa\\UVG\\2do Año\\Primer Semestre 2018\\Algoritmos y Estructuras de Datos\\Hoja de Trabajo 2\\CC2003-HT2\\datos.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			System.out.println("Seleccione el tipo de lista que desea usar presionando el número de la que desea:");
			System.out.println("1. Single \n2. Double \n3.Circular");
			String choice = teclado.nextLine();
			String type = "";
			if (choice.equals("1")) {
				type = "SINGLE";
			} else if (choice.equals("2")) {
				type = "DOUBLE";
			} else if (choice.equals("3")) {
				type = "CIRCLE";
			}
			Calc calculadora = SingleObject.getInstance(type);
			// Lectura del ficheroSi
			String linea;
			String lineaOperacion = "";
			while ((linea = br.readLine()) != null)
				lineaOperacion = lineaOperacion + linea;
			// System.out.println(lineaOperacion);
			// System.out.println(calculadora.getMiStack());
			double result = calculadora.operar(lineaOperacion);
			if (Double.isNaN(result)) {
				System.out.println("La operación no devuelve un resultado válido o no puede llevarse a cabo.");
			} else {
				System.out.println("Resultado: " + calculadora.operar(lineaOperacion));
			}

		} catch (IOException e) {
		} /*
			 * finally { // En el finally cerramos el fichero, para asegurarnos // que se
			 * cierra tanto si todo va bien como si salta // una excepcion. try { if (null
			 * != fr) { fr.close(); } } catch (IOException e2) { } }
			 */
	}

}
