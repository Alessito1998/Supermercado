package arraysmultidimensionales;

import java.util.Arrays;

public class Introduccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int ventas [] = {1200, 3450, 800, 1450, 2300};
		
		//int ventas [][] = new int[10][5];
		
		//int ventas [][][] = new int[10][5][20]; //CIUDADOS, COMERCIALES, AÑOS
		
	
		//ventas [2][4][19] = 3500;
		//ventas [1][4][19] = 5000;
		
		int marray2 [][] = new int [4][3];
		
		marray2 [0][0] = 15;
		marray2 [0][1] = 10;
		marray2 [0][2] = 13;
		
		marray2 [1][0] = 14;
		marray2 [1][1] = 19;
		marray2 [1][2] = 20;
		
		marray2 [2][0] = 23;
		marray2 [2][1] = 24;
		marray2 [2][2] = 34;
		
		marray2 [3][0] = 98;
		marray2 [3][1] = 5;
		marray2 [3][2] = 4;
		
		int matriz2 [][] = {
				
				{1, 2, 3, 8},
				{8, 7, 5, 4},
				{3, 87, 98, 72},
				
		};
		
		int matriz3 [][] = new int [4][];
		
		matriz3 [0] = new int [4];
		matriz3 [1] = new int [2];
		matriz3 [2] = new int [3];
		matriz3 [3] = new int [1];
		
		int matriz4 [][] = {
				
				{1, 2, 3, 4},
				{5, 6},
				{10, 11, 12},
				{3}
				
		};
		
		int [][] matrizDeEnteros = {{1, 3, 5, 7}, {5, 4, 1, 16}, {7, 9, 61, 13}};
		int [][] matrizDeEnteros2 = {{1, 5, 7}, {3, 4, 4}, {5, 1, 61}, {7, 16, 13}};
		
		for (int n = 0; n < matrizDeEnteros.length; n++) {
		
		System.out.println(Arrays.toString(matrizDeEnteros[n]));}
		
	}

}
