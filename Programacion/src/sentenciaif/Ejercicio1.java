package sentenciaif;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
		String si = "";
		
		System.out.println("Introduzca cuanto dinero le queda en la cuenta");
		
		double queda = entrada.nextDouble();
		
		System.out.println("¿Cúanto dinero quiere retirar?");
		
		
		double quiere = entrada.nextDouble();
		
		if (quiere > queda) {
				System.out.println("Su saldo será negativo, ¿Quiere continuar?");
				
					si = entrada.nextLine();
					if(si.isEmpty())
						si = entrada.nextLine();
			}
			
		
		else
			
			System.out.println("Imprimiendo ...");
			
		
		if (si.equalsIgnoreCase("si")) {System.out.println("Imprimiendo ...");}
		
		else
			
			System.out.println("Operación cancelada, buen día");
			
				entrada.close();
		
	}

}
