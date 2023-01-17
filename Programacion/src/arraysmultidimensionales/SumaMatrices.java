package arraysmultidimensionales;

import java.util.Scanner;

public class SumaMatrices {
static Scanner sc = new Scanner(System.in);
	
	
public static int[][] rellenar(int nFilas, int nColumnas) {

	int [][] matriz = new int[nFilas][nColumnas];

	for (int n = 0; n < matriz.length; n++) { //recorre filas

		for (int m = 0; m < matriz[n].length; m++) { //columnas

		int random = (int)(Math.random() * 100 );

		matriz[n][m]=random;
		
	}
	}
	
	return matriz;
	
}

public static void imprimeMatriz(int [][]matriz) {

	for (int i = 0; i < matriz.length; i++) { //recorre filas

	for (int j = 0; j < matriz[i].length; j++) { //columnas

	System.out.print(matriz[i][j] + " ");

	}

	System.out.println();

	}
}
	public static void main(String[] args, int random) {
		// TODO Auto-generated method stub

		System.out.println("Introduce elije la cantidad de filas");

		int nFilas = sc.nextInt();
		
		System.out.println("Introduce elije la cantidad de columnas");

		int nColumnas = sc.nextInt();
		
	}
}
