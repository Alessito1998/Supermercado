package sentenciasderepeticion;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int	num = 0;
		int contador = 0;
		
		System.out.println("Introduce un número entero");
		
		num = entrada.nextInt();
		
		int numMax = num;
		
		while (contador <= num) 
		{
			
			System.out.print((numMax - contador) + " ");
		
			contador++;
		
		}
		
		entrada.close();
		
		
	}

}
