package arraysmultidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class MeterValores {

	public static void main(String[] args) {



		Scanner entrada = new Scanner(System.in);



		int [][] rellena = {

		{60, 9, 8},

		{3, 4},

		{1},

		{5, 4, 3, 7}

		};



		int m = 0;


		for (int n = 0; n < rellena[m].length && m < rellena.length; n++) {

		System.out.println("Introduce el valor fila " + m + ", columna " + n);

		int valor = entrada.nextInt();

		rellena [m][n] = valor;

		if ((n == rellena[m].length-1) && (m != rellena.length-1)) 

		{

		m++;

		n = -1;

		}
		
		}
		
		for (int n = 0; n < rellena.length; n++) {
			
			for (m = 0; m < rellena[n].length; m++) {
				
				System.out.print(rellena[n][m] + " ");
				
			}
			
			System.out.println();
			
		}

		
		entrada.close();

		}
}
