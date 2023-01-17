package entradasalida;

import java.util.Scanner;

public class PeticionDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
		int añoactual = 2022;
		
		System.out.println("Introduce tu nombre");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Hola " + nombre);
		
		System.out.println("¿Cuántos años tienes?");
		
		int edad = entrada.nextInt();
		
		System.out.println("Entonces naciste en " + (añoactual - edad));
		
	}

}
