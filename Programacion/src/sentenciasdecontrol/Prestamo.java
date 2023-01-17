package sentenciasdecontrol;

import java.util.Scanner;

public class Prestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 
		 Realizar un programa que pida la cantidad del préstamo que solicitamos a
		 una entidad bancaria. A partir de ese momento, se irán introduciendo valores
		 que serán las distintas aportaciones que se hacen paradevolver el préstamo.
		 Por cada aportación el programa mostrará el importe pendiente. El programa termina
		 cuando la suma de las aportaciones sea igual o superior al préstamo solicitado.
		 Todos los valores pueden ser número reales (con decimales).
		 
		 Resultado de la ejecución:
		 
		 Importe del préstamo: 2000
		 Aportación: 500Deuda: 1500.0
		 Aportación: 1000Deuda: 500.0
		 Aportación: 500 
		 
		 Ejemplo de ejecución 2:
		 
		 Importe del préstamo: 1000
		 Aportación: 200Deuda: 800.0
		 Aportación: 345Deuda: 455.0
		 Aportación: 500
		 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		double aportacion = 0; //SERÁ LO QUE DEVUELVA
		
		double deuda = 0; //SERÁ EL VALOR A PAGAR.
		
		System.out.println("Introduce el importe a solicitar");
		
		double num = entrada.nextDouble();
		
		while (num < 0) { //HASTA QUE NO INTRODUZCA UN IMPORTE EN NÚMEROS ENTEROS LE PEDIRÁ QUE REPITA LA OPERACIÓN.
			
			System.out.println("Introduce un importe válido\nIntroduce el importe a solicitar");
		
			num = entrada.nextInt();
			
	}
		deuda = num; //IGUALO DEUDA A NUM PARA TENER UN VALOR FIJO, EL DE NUM.
		
		System.out.printf("Importe del préstamo: %.2f€\n\n", deuda);
		
		for (int n = 0; aportacion < num; n++) {
		
			if (aportacion < num) {
			
					System.out.println("Introduce el importe a devolver"); //VOY A PERMITIR QUE APORTACIÓN SEA NEGATIVA, SI LO ES DEBERÁ MÁS DINERO.
		
					aportacion = entrada.nextDouble();
		
					deuda = (deuda - aportacion);
		
					System.out.printf("\nAportación: %.2f€ Valor a deber: %.2f€\n", aportacion, deuda);
		
			}
		
		}
				
		System.out.println("\nSe ha devuelto todo el dinero.");
		
		entrada.close();
		
	}

}
