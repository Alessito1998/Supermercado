package sentenciaif;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner entrada = new Scanner(System.in);
	
	System.out.println("Introduce un número entero");
	
	int num1 = entrada.nextInt();
	if (num1 % 2 == 0) {System.out.println("El número es par");}
	if (num1 % 2 != 0) {System.out.println("El número es impar");}
	
	System.out.println("Adiós");
	
		entrada.close();
	
	}


}
