package arrays;

import java.util.Scanner;

public class MayorMenordeVerdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
Scanner entrada = new Scanner(System.in);
		
		
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		int n = 0;
		
		System.out.println("¿Cuantas posiciones quieres que tenga tu array?");
		
		int num =  entrada.nextInt();
		
		int array [] = new int [num];
		
		for (n = 0; n < num; n++) {
			
		array [n] = (int)(Math.random() * 10000);}
		
		for (int m = 0; m < num; m++) {
			
		if (mayor < array[m]) {
			
			mayor = array[m];
			
		}
			
		else if (menor > array[m]) {
			
			menor = array[m];
			
		}
		
		}
		
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
		
		entrada.close();
		
		
		
	}

}
