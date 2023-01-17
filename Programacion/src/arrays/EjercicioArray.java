package arrays;

import java.util.Scanner;

public class EjercicioArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		
		int posiciones;
		

		do{
			
		System.out.println("¿Cúantos elementos quieres que tenga tu array? (Mínimo necesita 5)");
		
		posiciones =  entrada.nextInt();
		
		System.out.println("Introduce un número válido");
		
		}
		while (posiciones < 5);
		int array [] = new int [posiciones];
		
		array [1] = 2;
		array [2] = array [1];
		array [0] = (array [1] + array [2]);
		array [0] ++;
		array [3] = (posiciones + 10);
		array [array.length - 1] = array [0];
	
	for ( int n = 0; n <= array.length - 1; n++)
	
		System.out.println(array [n]);
		
		entrada.close();
		
	}

}
