package ejercicios7noviembre;

import java.util.Scanner;

public class LaPiezaPerdidaFunciones {
	
	// SE ABRE LA FUNCIÓN SCANNER
	
	public static Scanner entrada = new Scanner(System.in);
	
	// ESTA ES LA FUNCION PARA RRELLENAR EL ARRAY
	
	public static int [] rellenaArray(int num) {
		
		int array [] = new int [num];
		int n = 0;
		
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
	
		return array;
	}
		
	// AL MAIN LE AÑADO LA VARIABLE int n PARA PODER UTILIZARLA
	
	public static void main(String[] args, int n) {
		// TODO Auto-generated method stub
		
		// INVOCO LAS FUNCIONES
		// LE DIGO AL ARRAY CUANTAS PIEZAS (POSICIONES) VA A TENER, EN ESTE CASO 5 (LO GUARDA EN LA VARIABLE num)
		
		final int piezas = 5;
		
		int array [] = rellenaArray(piezas);
		
		// ESTE FOR LEE EL ARRAY E IMPRIME LA PIEZA QUE FALTA
		
		for (n = 0; n < array.length; n++) {

			if (array[n] == 0) {
				
				//IMPRIME LA PIEZA QUE FALTA
				
				System.out.println("Falta la pieza " + (n + 1));
				
			}
		
	}

}
	
}
