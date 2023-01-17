package sentenciasdecontrol;

import java.util.Scanner;

public class Cantidadde5 {

	public static void main(String[] args) {
		
		
		
		/*
		 
		 Utilizando la instrucción while, realiza un programa
		 que solicite un número entre 1 y 1.000.000 y muestre
		 la cantidad de dígitos 5 que contiene
		 
		 Resultado de la ejecución:
		 
		 Introduce un número (1-1.000.000): 3565742
		 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número entre 1 y 1.000.000");
		
		int num = entrada.nextInt();
		
		int contador = 0; //HE CREADO UN CONTADOR PARA PODER PARAR EL WHILE CUANDO LLEGUE A 6 CIFRAS.
		int cincos = 0; //CINCO ES UN CONTADOR QUE CUENTA LOS 5.
			
		while (num < 1 || num > 1000000) //SI PONES UN NÚMERO FUERA DE LOS PARÁMETROS TE HACE REPETIR EL PROCESO
		
			{
				
			System.out.println("Introduce una número válido\nIntroduce un número entre 1 y 1.000.000"); //COMO TENGO EL "System.out.println("Introduce un número entre 1 y 1.000.000"" FUERA DEL WHILE LO HE REPETIDO DENTRO.
			num = entrada.nextInt();
			
			}
			
		final int mun = num; //HE CREADO MUN PARA PODER IMPRIMIR EN PANTALLA ESTE NÚMERO Y QUE SEA FIJO. NO ES NECESARIO EL FINAL, PERO POR SI ACASO.
		
		while (contador >= 0 && contador < 7) //CONTADOR SIEMPRE AUMENTA Y SEA CUAL SEA EL MÓDULO DIVIDE EL NÚMERO ENTRE 10 PARA QUE LEA LA SIGUIENTE CIFRA.
		
			{
			
			contador++;
			
			if (num % 10 == 5) {
				
			cincos++;
			
			num = num / 10;
				
				}
			
			else {
				
				num = num / 10;
				
				}
				
			}
		if (cincos > 1 || cincos == 0) { //QUIERO QUE SI HAY MÁS DE 1 CINCOS ME ESCRIBA CINCOS (EN PLURAL).
		
			System.out.println("El número " + mun + " tiene " + cincos + " cincos"); //COMO NUM CAMBIABA CON CADA VUELTA IMPRIMO MUN.
		
		}
		
		else if (cincos == 1) {
			
			System.out.println("El número " + mun + " tiene un cinco");
			
		}
		
		entrada.close();	
	}
}