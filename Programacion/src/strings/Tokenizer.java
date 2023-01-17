package strings;

import java.util.*;

public class Tokenizer {

	static Scanner entrada = new Scanner(System.in);
	
	public static void tokenizar(StringTokenizer frases) {
		
		System.out.println("Hay " + frases.countTokens() + " tokens");
		
		while (frases.hasMoreTokens()) {
			 
	         System.out.println(frases.nextToken());
	     }
		
	}
	
	public static void separar (StringTokenizer frases2) {
		
		System.out.println("\nHay " + frases2.countTokens() + " tokens");
		
		while (frases2.hasMoreTokens()) {
			System.out.println(frases2.nextToken().trim());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escribe tu frase");
		
		String frase = entrada.nextLine();
		
		StringTokenizer frases = new StringTokenizer(frase);
		StringTokenizer frases2 = new StringTokenizer(frase, "a");
		
		
		tokenizar(frases);
		separar(frases2); 
		
	}

}
