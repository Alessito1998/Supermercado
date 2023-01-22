package ejercicios7noviembre;

import java.util.Scanner;

public class MayorDiferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//ARRAY DE 5 POSICIONES YA QUE NO SE PREGUNTA CÚANTOS ALUMNOS SON
		
		int array [] = new int [5];
		
		//MAYOR MENOR PARA CONOCER LA MAYOR Y LA MENOR NOTA Y RESTARLAS
		
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		System.out.println("Introduce las notas de 5 alumnos");
		
		//NO TENGO LA TERCERA PARTE DEL for PORQUE ESTÁ EN EL else if
		
		for (int n = 0; n < array.length;) {

			//n + 1 PARA QUE DIGA ALUMNO 1
			
			System.out.println("Introduce la nota del alumno " + (n + 1));
			
			int nota = entrada.nextInt();
			
			if (nota < 0 || nota > 10) {
				
				System.out.println("Nota no válida");
				
			}
			
			else if (nota > 0 || nota < 10) {
				
				array [n] = nota;
				
				n++;

			}
		}
		
			for (int m = 0; m < array.length; m++) {
				
				if (mayor < array [m]) {
					
					mayor = array [m];
					
				}
			}
			
			for (int j = 0; j < array.length; j++) {
					
				if (menor > array [j]) {
						
					menor = array [j];
						
				}
				
			}
			
		System.out.println("Diferencia: " + (mayor - menor));
		
		entrada.close();
		
	}

}
