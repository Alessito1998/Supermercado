package extra;

import java.util.*;

public class EspionajeEnNAvidad {

	static Scanner entrada = new Scanner(System.in);
	
	static String carta = pideDatos();
	
	static String frase;
	
	static boolean terminar = false;
	
	public static boolean validarCarta() {
		
		return carta.matches("^([A-N][O-Z]){100}$");
		
	}
	
	public static String pideDatos() {
		
		carta = entrada.nextLine().toUpperCase();
		
		System.out.println(carta);
		
		frase = carta.replace(" ", "");
		
		return carta;
		
	}
	
	public static void main(String[] args) {

		System.out.println(frase);
		
	}

}
