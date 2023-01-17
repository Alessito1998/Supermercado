/**
 * 
 */
package ejerciciosBásicos;

import java.util.Scanner;

/**
 * @author alex
 *
 */
public class EntradaDeDatos2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		String name;
		
		
		System.out.println("¿Cómo te llamas?");
		
		name = teclado.nextLine();
		
		System.out.println("Hola " + name);
		
		
		teclado.close();
		
		
	}

}
