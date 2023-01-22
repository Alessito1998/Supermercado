package ejercicios7noviembre;

import java.util.Scanner;

import java.util.Arrays;

public class LaPiezaPerdida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// MEQUIEROMORIR

		Scanner entrada = new Scanner(System.in);
		
		int array [] = new int [5];
		int n = 0;
		
		System.out.println("Enséñame del 1 al 5 qué piezas tienes para saber cúal se ha perdido");
		
		// HACEMOS QUE EL FOR SOLO DE 4 VUELTAS EN VEZ DE 5 PARA NO RRELLENAR UNO DE LOS ESPACIOS
		
		for (n = 0; n < (array.length -1); n++) {
			
			// PEDIMOS LAS PIEZAS QUE QUE TIENE AL USUARIO
			
			System.out.println("Introduce la pieza " + (n + 1) + " de " + (array.length -1 )+ " necesarias.");
			
		int pieza = entrada.nextInt();
			
			array [pieza -1] = pieza;
				
			// SI ME DA UNA PIEZA NO VÁLIDA SE LO DIGO Y RESTO UN COPNTADOR A LA N (ME GUSTA MAS NO SUMARLO PERO SE HABÍA BUGUEADO Y LO HECHO AL ESTILO MARCOS)
			
			if (pieza < 0 && pieza > 6) {
				
				System.out.println("Dime una pieza válida");
				
				n--;
				
			}
			
			
		}
		
		// INICIAMOS UN SEGUNDO FOR PARA QUE LEA TODO EL ARRAY Y QUE CUANDO ENCUENTRE UN VALOR IGUAL A 0 LO IMPRIMA + 1
	
		for (n = 0; n < array.length; n++) {

			if (array[n] == 0) {
				
				//IMPRIME LA PIEZA QUE FALTA
				
				System.out.println("Falta la pieza " + (n + 1));
				
			}
			
		}
		
		entrada.close();
		
	}

}
