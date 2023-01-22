package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ExpresionRelugar {

	static Scanner entrada = new Scanner(System.in);
	
	public static boolean validarDNI (String dni) {
		
		return dni.matches("^[0-9]{8}[A-Z]$");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escribe tu DNI");
		
		String dni = entrada.nextLine();
		
		System.out.println(validarDNI(dni));
		
	}

}
