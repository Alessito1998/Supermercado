package extra;

import java.util.Scanner;

public class Excel {

	static Scanner sc = new Scanner(System.in);
	
	public static int[][] rellenar(int filas, int columnas) {

		int [][] matriz = new int[filas][columnas];
		int m = 0;
		int sumafila = 0;
		int sumacolumna = 0;

		for (int n = 0; n < (matriz.length - 1); n++) { //recorre filas
			sumafila = 0;
			sumacolumna = 0;
			for (m = 0; m < (matriz[n].length - 1); m++) { //columnas

			System.out.println("Introduce el elemento [" + n + ", " + m + " ]" );

			matriz[n][m]=sc.nextInt();
			sumafila = matriz[n][m] + sumafila;
			
			
		}
				
			matriz[n][matriz[n].length - 1] = sumafila;
			
		}
		
		for (int n = 0; n < (matriz.length); n++) { //recorre filas
			sumafila = 0;
			sumacolumna = 0;
			for (m = 0; m < (matriz[n].length - 1); m++) { //columnas
				
				sumacolumna = matriz [m][n] + sumacolumna;
					
			}
			
			matriz[4][n] = sumacolumna;
			
		}
				
		return matriz;

		}
	
	public static int[][] excel(int filas, int columnas) {
		
		int matriz [][] = new int [filas][columnas];
		int m = 0;
		
		for (int n = 0; n < matriz.length; n++) {
			
			for (m = 0; m < matriz[n].length; m++) {
		
				if (n == 0) {
				
					matriz [matriz.length][m] = (matriz[n][m]);}
				
				else if (n < 0) {
					
					matriz [filas - 1][m] = (matriz[n - 1][m - 1] + matriz[n][m]);
					
				}
		}
		}
		
		return matriz;
	}
	
	public static void imprimeMatriz(int [][]matriz) {

		for (int n = 0; n < matriz.length; n++) { //recorre filas

			for (int m = 0; m < matriz[n].length; m++) { //columnas

				System.out.print(matriz[n][m] + " ");

		}

		System.out.println();

		}

		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int columnas = 6;

		int filas = 5;
		
		int matriz [][] = rellenar(filas, columnas);
		
	//	int matrizAux [][]= excel(filas, columnas);
		
		imprimeMatriz(matriz);
		System.out.println();
		//imprimeMatriz(matrizAux);
		
	}

}
