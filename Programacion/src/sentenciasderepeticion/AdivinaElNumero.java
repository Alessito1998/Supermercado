package sentenciasderepeticion;

import java.util.Scanner;

public class AdivinaElNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.out.println("Adivina el número");
		
		 double numA = Math.random() * 100;
		 
		 int numa = (int)(numA);
		 
		 Scanner entrada = new Scanner(System.in);

		 
		 int num = -3;
		
		while (num != numa) 
			
		{
			
			System.out.println("Introduce un número entero entero");
			num = entrada.nextInt();
			 
			if (num > numa)	{
				
			System.out.println("Incorrecto, es más pequeño. Inténtalo de nuevo.");
			
			}
			
			else if (num < numa) {
				
				System.out.println("Incorrecto, es más grande. Inténtalo de nuevo.");	
			}
			
			else 
				
				System.out.println("Correcto.");
 			
			
			
					}
	
		 
		 
		entrada.close();
		
		
	}


}
