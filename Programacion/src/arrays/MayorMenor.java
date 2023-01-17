package arrays;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
		int array [] = new int [100];
		
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		int n = 0;
		
		for (n = 0; n < 10; n++) {
			
		System.out.println("Rellena 10 posiciones, llevas " + n + " posiciones rellenadas");
		
		int num =  entrada.nextInt();
		
		array [n] = num;}
		
		System.out.println("¿Cual de tus números quieres comparar?");
		
		int comparar =  entrada.nextInt();
		
		if (array[comparar] < menor) {
		
		System.out.println("Es menor");}
		
		else if (array[comparar] < mayor) {
			
			System.out.println("Es mayor");}
		
		else
			
			System.out.println("Es igual");
		
		entrada.close();
		
	}

}
