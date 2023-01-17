package sentenciaif;

import java.util.Scanner;

public class DimeQueSi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
	System.out.println("¿Estamos en octubre?");
		
	String si = entrada.nextLine();
	if (si.equalsIgnoreCase("si")) {System.out.println("Muy bien");}
		
	else
		
		System.out.println("Eres tonto");
		
		System.out.println("Adiós");
		
			entrada.close();
		
		
	}

}
