package ejercicios7noviembre;

import java.util.Scanner;

public class MayorDiferenciaFunciones {

	//VOY A HACER EL EJERCICIO MEDIANTE FUNCIONES
	
	//EL main ESTÁ DEBAJO DE LAS FUNCIONES
	
	//HE PUESTO AQUÍ EL SCANNER POR SI TENGO QUE UTILIZARLO EN MÁS DE UN SITIOS.
	
	public static Scanner entrada = new Scanner(System.in); 
	
	//ESTA ES LA FUNCIÓN QUE RELLENA EL ARRAY DE LOS ALUMNOS
	
	//SOLO RELLENA SI LA NOTA ES UN ENTERO ENTRE 0 Y 10
	
	public static int [] rellenaArray(int num) {
	
		int array [] = new int [num];
		
	//EL FOR NO TIENE LA TERCERA PARTE PORQUE SOLO SE EJECUTA EN EL ELSE IF	*
		
		for (int n = 0; n < array.length;) {

			//n + 1 PARA QUE DIGA ALUMNO 1
			
			System.out.println("Introduce la nota del alumno " + (n + 1));
			
			int nota = entrada.nextInt();
			
			if (nota < 0 || nota > 10) {
				
				System.out.println("Nota no válida");
				
			}
			
			else if (nota > 0 || nota < 10) {
				
				array [n] = nota;
				
	//* AQUÍ ESTÁ EL n++
				
				n++;

			}
		}
		
		return array;
		
	}
	
	//ESTA ES LA FUNCIÓN DE LA DIFERENCIA ENTRE LAS NOTAS
	
	//EL PLANTEAMIENTO QUE HE HECHO HA SIDO SACAR LA NOTA MAYOR Y LA NOTA MENOR DEL ARRAY Y RESTARLAS
	
	// MI ARRAY SE LLAMA array
	
	//CREO QUE SE PODRÍA HACER CON UN ÚNICO FOR Y QUE SEA MÁS EFICIENTE, PERO ME PARECE QUE ASÍ SE ENTIENDE MÁS FÁCILMENTE EL PROCESO
	
	public static int diferencia(int array []) {
		
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
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
		
		int diferencia = (mayor - menor);
		
		return diferencia;
		
	}
	
	//EL main
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce las notas de 5 alumnos");
		
		// VOY A DECLARAR alumnos COMO CONSTANTE, YA QUE AUNQUE EN UN FUTURO PUDIERAN VARIAR LO CONSIDERO UNA CONSTANTE, NO SE CÓMO EXPLICARME
		
		final int alumnos = 5;
		
		//AQUÍ LA VARIABLE num DE LA FUNCIÓN ES EL NÚMERO 5 Y SU FUNCIÓN SE LLAMA alumnos
		
		//INVOCO LAS FUNCIONES E IMPRIMO
		
		int array [] = rellenaArray(alumnos);
		
		int diferencia = diferencia(array);
		
		System.out.println("Diferencia: " + diferencia);
		
	}

}
