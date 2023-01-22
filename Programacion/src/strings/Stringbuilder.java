package strings;

import java.util.Scanner;

//PIDE:

//PIDE UNA FRASE

//IMPRIME NÚMERO DE LETRAS

//DÍGITOS Y ESPACIOS EN BLANCO

public class Stringbuilder {

	static Scanner sc = new Scanner(System.in);
	
	public static void numLetras (StringBuilder frase) {
		
		int contLetras = 0;
		
		for (int n = 0; n < frase.length(); n++) {
			
			char letras = frase.charAt(n);
			
			if (Character.isLetter(letras)) {
		
				contLetras ++;
			}
			
		}
		
		System.out.println("Número de letras " + contLetras);
	}
	
	public static void numEspacios (StringBuilder frase) {
		
		int contEsp = 0;
		
		for (int n = 0; n < frase.length(); n++) {
			
			char letras = frase.charAt(n);
			
			if (Character.isWhitespace(letras)) {
		
				contEsp ++;
			}
			
		}
		
		System.out.println("Número de espacios en blanco " + contEsp);
	}
	
	public static void numNumeros (StringBuilder frase) {
		
		int contNum = 0;
		
		for (int n = 0; n < frase.length(); n++) {
			
			char letras = frase.charAt(n);
			
			if (Character.isDigit(letras)) {
		
				contNum ++;
			}
			
		}
		
		System.out.println("Número de dígitos " + contNum);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Escribe tu frase");
		
		StringBuilder frase = new StringBuilder (sc.nextLine());
	
		numLetras(frase);
		numEspacios(frase);
		numNumeros(frase);
		
	}
	
}
