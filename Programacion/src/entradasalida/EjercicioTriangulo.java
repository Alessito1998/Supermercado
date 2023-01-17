package entradasalida;

import java.util.Scanner;

public class EjercicioTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Pedirle al usuario la base y la altura del triángulo y el sistema saca el área.
		
		Resultado con 3 decimales.*/

		
		Scanner entrada = new Scanner(System.in);
		
		final int partido = 2;
		
		System.out.println("Introduce la base");
		
		double base = entrada.nextDouble();
		
		System.out.println("Introduce la antura");
		
		double altura = entrada.nextDouble();
		
		double area = ((base * altura) / partido);
		
		System.out.printf("%.3f \n", area);
		
	}

}
