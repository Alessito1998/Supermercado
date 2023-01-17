package funciones;

import java.util.Scanner;

public class Calculadora {
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static String menu() {
		
		System.out.println("Sumar");
		System.out.println("Restar");
		System.out.println("Contar");
		System.out.println("Multiplicar");
		System.out.println("Escoge una opción");
		
		String opcion = entrada.nextLine();
		
		if (opcion.isEmpty())
			
			opcion = entrada.nextLine();
			
		return opcion;
}
	
	public static int [] rellenaArray(int num) {
		
		int array [] = new int [num];
		
		for (int n = 0; n < array.length; n++) {
			
			array [n] = (int)(Math.random() * 100);
			
		}
		
		return array;
}
	
	public static int calculadora(int [] a, String operacion) {
		
		int resultado = 0;
		
		switch(operacion.toLowerCase()) {

		case "sumar":
			
			for (int n = 0; n < a.length; n++) {
				
				resultado = resultado + a [n];
				
			}
			
			break;
		
		case "restar":
			
			for (int n = 0; n < a.length; n++) {
				
				resultado = resultado - a [n];
				
			}	
			
			break;
	
		case "contar":
			
			for (int n = 0; n < a.length; n++) {
				
				if (a [n] % 2 == 0)
					
					resultado++;
				
			}	
			
			break;
			
		case "multiplicar":
			
			resultado = 1;
			
			for (int n = 0; n < a.length; n++) {
				
				
				resultado = resultado * a [n];
				
			}
			
			break;
			
		default:
			
			System.out.println("Eres tonto");
			
		}
		
		return resultado;
		
}
	
	public static void main(String[] args) {
		
		
		System.out.println("¿Cuántos elementos quieres que tenga tu array?");
		int num = entrada.nextInt();
		
		int array [] = rellenaArray(num);
		
		String menu = menu()
;		
		int resultado = calculadora(array, menu);
		
		System.out.println(resultado);
		
	}
	
}
