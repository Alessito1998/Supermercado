package copiaarray;

import java.util.Scanner;

public class Introducción {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int [] rellenar(int num) {

		int [] matriz = new int[num];

		for (int n = 0; n < matriz.length; n++) {

			int random = (int)(Math.random() * 100 );

			matriz[n]=random;
			
		}
		
		return matriz;

	}
	
	public static void imprimeMatriz(int []matriz) {

		for (int i = 0; i < matriz.length; i++) {
		System.out.print(matriz[i] + " ");


		System.out.println();

		}
	}
	
	public static void main(String[] args, int num) {
		// TODO Auto-generated method stub

		System.out.println("Define la canbtidad de posiciones de tu array");
		
		num = sc.nextInt();
		
		int array [] = rellenar(num);
		
		imprimeMatriz(array);
		
		System.out.println();
		
		int arrayCopia [] = new int [num];
		
		System.arraycopy(array, 1, arrayCopia, 2, 4);

		imprimeMatriz(arrayCopia);
		
		System.out.println();
		
	}

}
