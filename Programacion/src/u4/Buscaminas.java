package u4;

import java.util.Scanner;

public class Buscaminas {

	//ABRIMOS EL ESCANER DE NOMBRE ENTRADA
	
	static Scanner entrada = new Scanner(System.in);
	
	//FUNCIÓN PARA RELLENAR EL ARRAY
	
	public static String[][] rellenar(int filas, int columnas) {

		String [][] matriz = new String [filas][columnas];

		int n = 0;
		int m = 0;
		
		for (n = 0; n < matriz.length; n++) {
			for (m = 0; m < matriz[n].length; m++) {
				
				//SE PIDE QUE SE INSERTE LA INFORMACIÓN EN LA COORDENADA
				
			System.out.println("Introduce información para la coordenada [" + n + ", " + m + " ], '-' para espacios vacíos y '*' para bombas" );
		
				matriz[n][m] = entrada.nextLine();
				
		}
		}
	
		return matriz;

		}
	
	//IMPRIMO LA MATRIZ PARA QUE SEA MÁS SENCILLO COMPROBAR SU BUEN FUNCIONAMIENTO
	
	public static void imprimeMatriz(String [][] matriz) {

		for (int n = 0; n < matriz.length; n++) {

			for (int m = 0; m < matriz[n].length; m++) {

				System.out.print(matriz[n][m] + " ");

		}

		System.out.println();

		}

		}
	
	//MÉTODO PARA BUSCAR LAS BOMBAS
	
	public static void buscaBombas(String [][] matriz) {

		//PEDIMOS LAS COORDENADAS SEPARADAS POR FILAS Y COLUMNAS Y SE GUARDAN CADA UNA EN UNA VARIABLE
		//LAS GUARDO COMO FINAL PARA EVITAR QUE CAMBIEN SUS VALORES POR ERROR
		
		System.out.println("\nIntroduce las coordenadas y A JUGAR\n");
		
		System.out.println("Fila\n");
		
		final int fila = entrada.nextInt();
		
		System.out.println("Columna\n");
		
		final int columna = entrada.nextInt();
		
		//INICIALIZAMOS UN CONTADOR A 0 QUE SERÁ QUIÉN NOS DIGA CUANTAS BOMBAS HAY
		
		int cont = 0;
		
		//SI HACEMOS EXPLOTAR LA BOMBA NOS DIRÁ QUE HEMOS PERDIDO Y EL PROGRAMA FINALIZARÁ
		
		if (matriz[fila][columna].equals("*")) {
			
			System.out.println("\nOh, no. Has perdido, una bomba.\n");}
			
		//SI NO HACEMOS EXPLOTAR BOMBA NOS DIRÁ CUANTAS BOMBAS HAY EN LAS CASILLAS ADYACENTES
		
		else if (matriz[fila][columna].equals("-")) {
			
			System.out.println("\nHas tenido suerte, coordenada libre\n");
			
			//ESTE SERIA EL GENÉRICO (PARA FILAS Y COLUMNAS INTERIORES)
			
		if ((fila -1 != -1) && (fila + 1 != matriz.length) && (columna - 1 != -1) && (columna + 1 != matriz.length))  {
			
			//RECORRE FILAS Y COLUMNAS BUSCANDO BOMBAS
			
			//EL SISTEMA BUSCARÁ EN LAS FILAS ANTERIOR, POSTERIOR Y EN LA MISMA EN UN CUADRADO DE 9X9
			
			for (int n = fila - 1; n < fila + 2; n++) { //TIENE QUE SER UN 2 PORQUE HE PUESTO MENOR

				for (int m = columna - 1; m < columna + 2; m++) { //NUNCA VA A SUMAR LA BOMBA DE LA COORDENADA SELECCIONADA PORQUE TIENE QUE SER UN ESPACIO VACÍO
					
					//SOLO AUMENTARÁ EL CONTADOR SI LA MATRIZ TIENE UN *
					
					if (matriz[n][m].equals("*")) {
						
						cont ++;

					}
				}
			}
		}
		
		//CUANDO NO EXISTEN NI LA FILA DE ARRIBA NI LA COLUMNA DE LA IZQUIERDA
		
		else if ((fila -1 == -1) && (columna - 1 == -1)) {
			
			for (int n = fila; n < fila + 2; n++) {

				for (int m = columna; m < columna + 2; m++) {
					if (matriz[n][m].equals("*")) {
						
						cont ++;

					}
				}
			}
			
		}
		
		//CUANDO NO EXISTEN NI LA FILA DE ARRIBA NI LA COLUMNA DE LA DERECHA
		
		else if ((fila -1 == -1) && (columna + 1 == matriz.length)) {
			
			for (int n = fila; n < fila + 2; n++) {

				for (int m = columna - 1; m < matriz[n].length; m++) {
					if (matriz[n][m].equals("*")) {
						
						cont ++;

					}
				}
			}
			
		}
		
		//CUANDO NO EXISTEN NI LA FILA DE ABAJO NI LA COLUMNA DE LA IZQUIERDA
		
		else if ((fila + 1 == matriz.length) && (columna - 1 == -1)) {
			
			for (int n = fila - 1; n < matriz.length; n++) {

				for (int m = columna; m < columna + 2; m++) {
					if (matriz[n][m].equals("*")) {
						
						cont ++;

					}
				}
			}
			
		}
		
		//CUANDO NO EXISTEN NI LA FILA DE ABAJO NI LA COLUMNA DE LA DERECHA
		
	else if ((fila + 1 == matriz.length) && (columna + 1 == matriz.length)) {
			
			for (int n = fila - 1; n < matriz.length; n++) {

				for (int m = columna - 1; m < matriz[n].length; m++) {
					if (matriz[n][m].equals("*")) {
						
						cont ++;

					}
				}
			}
			
		}
		
		//CUANDO LA FILA DE ARRIBA NO EXISTE
		
		else if (fila -1 == -1) {
			
			for (int n = fila; n < fila + 2; n++) {

				for (int m = columna - 1; m < columna + 2; m++) {
					if (matriz[n][m].equals("*")) {
						
						cont ++;

					}
				}
			}
			
		}
		
		//CUANDO LA FILA DE ABAJO NO EXISTE
		
		else if (fila + 1 == matriz.length) {
			
			for (int n = fila - 1; n < matriz.length; n++) {

				for (int m = columna - 1; m < columna + 2; m++) {
					if (matriz[n][m].equals("*")) {
						
						cont ++;

					}
				}
			}
			
		}
		
		//CUANDO LA COLUMNA DE LA IZQUIERDA NO EXISTE
		
		else if (columna - 1 == -1) {
			
			for (int n = fila - 1; n < fila + 2; n++) {

				for (int m = columna; m < columna + 2; m++) {
					if (matriz[n][m].equals("*")) {
						
						cont ++;

					}
				}
			}
			
		}
		
		//CUANDO LA COLUMNA DE LA DERECHA NO EXISTE
		
		else if (columna + 1 == matriz.length) {
			
			for (int n = fila - 1; n < fila + 2; n++) {

				for (int m = columna - 1; m < matriz[n].length; m++) {
					if (matriz[n][m].equals("*")) {
						
						cont ++;

					}
				}
			}
			
		}
		
		//NOS IMPRIME LA CANTIDAD DE BOMBAS ADYACENTES
		
			System.out.println("\nHay " + cont + " bombas en las coordenadas adyacentes.");
			
		}
		
		}
	
	//EL MAIN
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//INICIALIZAMOS LAS FINALS Y LAS COLUMNAS (EL EJERCICIO PIDE QUE SEAN 5 Y 5)
		
		int filas = 5;
		int columnas = 5;
		
		//INVOCAMOS A LA FUNCIÓN QUE RELLENA EL ARRAY DE STRINGS QUE SERÍA EL TABLERO
		
		String matriz [][] = rellenar(filas, columnas);
		
		//INVOCAMOS LOS MÉTODOS PARA IMPRIMIR LA MATRÍZ Y EL BUSCADOR DE BOMBAS
		
		imprimeMatriz(matriz);
		
		buscaBombas(matriz);
		
	}

}
