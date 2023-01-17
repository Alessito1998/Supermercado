package funciones;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce el primer número");
		int num1 = entrada.nextInt();
		System.out.println("introduce el segundo número");
		int num2 = entrada.nextInt();
		
		int suma = suma(num1, num2);
		double resta = resta(num1, num2);
		
		System.out.println("La suma es " + suma);
		System.out.println("La resta es " + resta);
		
		entrada.close();
		
	}

	
	public static int suma(int a, int b) {
		
		int resultado = a + b;
		return resultado;}
		
	public static double resta(double a, double b) {
			
			return a - b;
		
	}
	
}
