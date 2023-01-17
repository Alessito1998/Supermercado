package sentenciaif;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe tu edad");
		
		int edad = entrada.nextInt();
		
		/*if (edad < 18) 
			{System.out.println("Eres Joven");}
		
		else if (edad <= 40) {System.out.println("Eres adulto");}
		
			else if (edad <= 60) {System.out.println("Eres Madruo");}
		
				else  if (edad <= 65) {System.out.println("Eres Mayor");}
				
					else
		
						System.out.println("tienes que cuidarte");*/
		
		
		
		if (edad > 0 && edad < 18) {System.out.println("Eres Joven");}
			
			else if (edad >= 18 && edad < 40) {System.out.println("Eres adulto");}
		
				else if (edad >=40 && edad < 60) {System.out.println("Eres Madruo");}
		
					else  System.out.println("tienes que cuidarte");
		
		entrada.close();
		
			
	}

}
