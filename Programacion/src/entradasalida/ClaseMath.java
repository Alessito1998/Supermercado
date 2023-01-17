package entradasalida;

import java.util.Scanner;

public class ClaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Área del cono.
		
		final double valor = (3);
		
		System.out.println("El área del cono es un tercio por Pi por la altura");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el rádio");
		
		double radio = entrada.nextDouble();
		
		System.out.println("Introduce la antura");
		
		double altura = entrada.nextDouble();
		
		double area = ((Math.PI * Math.pow(radio, 2) * altura) / valor);
		
		System.out.printf("%.3f \n", area);
		
		
	}

}
