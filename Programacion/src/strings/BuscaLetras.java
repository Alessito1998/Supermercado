package strings;

import java.util.Scanner;

public class BuscaLetras {

//PROGRAMA QUE LEA UNA FRASE Y TE DIGA CÚANTOS CARÁCTERES DE LOS QUE SE PIDAN HAY	
	
	static Scanner sc = new Scanner(System.in);
	
	public static void numLetras (String letra, StringBuilder frase) {
		
		int contLetras = 0;
		
		for (int n = 0; n < frase.length(); n++) {
			
			char leer = frase.charAt(n);
			
			if ((Character.isLetter(n))) {
		
				frase.toString();
				
				contLetras ++;
			}
			
		}
		
		System.out.println("Número de letras " + contLetras);
	}
	
	public static void main(String[] args) {
		
		System.out.println("¿Qué letra quieres buscar?");

		String letra = sc.nextLine();
		
		StringBuilder frase = new StringBuilder ("hbdsiucbds dubcidsbc hbdcaa");
		
		numLetras(letra, frase);
		
	}

}
