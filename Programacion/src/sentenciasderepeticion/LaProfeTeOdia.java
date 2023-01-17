package sentenciasderepeticion;

import java.util.Scanner;

public class LaProfeTeOdia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada = new Scanner(System.in);
		
		int	num = 0;
		int contador = 0;
		
		System.out.println("Introduce un número entero");
		
		num = entrada.nextInt();
		
		int numMax = num;
		int numMin = 0;
		
		while (numMin <= num) 
		{
			
			System.out.print((numMax + num) + " ");
		
			num--;
		
		}
		
		entrada.close();

	}

}
