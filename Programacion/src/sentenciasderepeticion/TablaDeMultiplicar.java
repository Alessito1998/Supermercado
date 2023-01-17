package sentenciasderepeticion;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número del 0 al 10");
		
		int n;

		int num = entrada.nextInt();
		
		for(n = 0; n <= 10; n++)
			
		{
			
			
			System.out.println(num + " X " + n + " = " + (num * n));
		
		}
		
		entrada.close();

	}

}
