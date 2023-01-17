package copiaarray;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CopiaArrayWay {

	public class CopiandoArrays {

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

			}
			System.out.println();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 8;
		
		int cont = 0;
		
		int array [] = rellenar(num);
		
		System.out.println("Hola ¿Cuántas posiciones lo quieres mover?");
		
		cont = sc.nextInt();
		
		System.out.println("Array original");
		
		imprimeMatriz(array);
		
		System.out.println("\n");
		
		
		int arrayAux [] = new int [array.length];
		
		System.arraycopy(array, 0, arrayAux, cont, (array.length - cont));
		
		int arrayCopia [] = new int [array.length];
		
		System.arraycopy(array, cont, arrayCopia, 0, (array.length - cont));
		
		System.arraycopy(arrayAux, (cont + 1), arrayCopia, (cont + 1), arrayCopia.length);

	}

	}
}