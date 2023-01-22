package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NombreDePersona {

	//PEDIR NOMBRE
	
	//LA PRIMERA LETRA MAYUSCULAS EL RESTO MINUSCULAS
	
	//PUEDE HABER NOMBRE COMPUESTO
	
	//OPCIONAL = ?;
	
	static Scanner entrada = new Scanner(System.in);
	
	public static boolean validarNombre (String nombre) {
		
		return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escribe tu nombre");
		
		String nombre = entrada.nextLine();
		
		System.out.println(validarNombre(nombre));
		
	}

}
