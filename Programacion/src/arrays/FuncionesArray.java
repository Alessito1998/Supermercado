package arrays;

import java.util.Arrays;

public class FuncionesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numeros [] = new int [5];
		
		numeros [0] = 1;
		numeros [1] = 2;
		numeros [2] = 3;
		numeros [3] = 4;
		numeros [4] = 5;
		
		//IMPRIMIR SIN FOR
		
		System.out.println("Ordenado" + Arrays.toString(numeros));
		
		//ORDENAR EL ARRAY
		
		System.out.println(Arrays.binarySearch(numeros, 3));
		
		
	}

}
