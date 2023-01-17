package copiaarray;

import java.util.Arrays;

public class Clonacion {

	public static void main(String[] args) {
		
		//1. EN COPIA COPIAMOS EL ARRAY PRIMOS
		//2. EN CLONADO CLONAMOS EL ARRAY PRIMOS
		//3. MOSTRAMOS LOS ARRAYS POR CONSOLA
		//4. CAMBIAMOS UN ELEMENTO CLONADO
		//5. CAMBIAMOS EL ELEMENTO COPIA
		//6. VOLVEMOS A MOSTRAR POR POANTALLALOS ARRAYS
		
		int primos [] = {1, 3, 7, 11, 13, 17, 19, 23};
	
		int copia [] = new int [8];
		
		int clon [] = new int [8];
		
		System.arraycopy(primos, 0, copia, 0, primos.length);
		
		System.out.println("Array original: " + Arrays.toString(primos));
		
		System.out.println("Array copia: " + Arrays.toString(copia));
		
		System.out.println("Array clon: " + Arrays.toString(primos.clone()));
		
		clon [3] = 100;
		
		System.out.println("\nArray clon cambiado: " + Arrays.toString(primos.clone()));
		
		copia [3] = 300;
		
		System.out.println("Array copia cambiado " + Arrays.toString(copia));
		
		System.out.println("\nArray original: " + Arrays.toString(primos));
		
	}

}
