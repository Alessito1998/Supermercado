package arraysmultidimensionales;

import java.util.Scanner;

public class MeterValoresBien {

// CÓDIGO DE SILVIA
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

	System.out.println("Introduce las columnas");

	int columnas = sc.nextInt();

	System.out.println("Introduce las filas");

	int filas = sc.nextInt();

	int [][] miMatriz = rellenar(filas, columnas);

	imprimeMatriz(miMatriz);

	}

	public static int[][] rellenar(int filas, int columnas) {

	int [][] matriz = new int[filas][columnas];

	for (int i = 0; i < matriz.length; i++) { //recorre filas

		for (int j = 0; j < matriz[i].length; j++) { //columnas

		System.out.println("Introduce el elemento [" + i + ", " + j + " ]" );

		matriz[i][j]=sc.nextInt();

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

	
}
