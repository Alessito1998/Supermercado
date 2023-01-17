package ejercicios7noviembre;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Anagrama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VOY INFORMANDO DE QUE NO ME VA A DAR TIEMPO A TERMINARLO PORQUE LLEVO LITERAL DOS DIAS CON EL 2
		
		Scanner entrada = new Scanner(System.in);
		
		 String palabra= "";
		 
		 System.out.println("Introduce una palabra");
		 
         palabra = entrada.nextLine();
         
         int n = 0;
         int m = (n + 1);
         
         for (n = 0; n < palabra.length(); n++) {
        	 
             System.out.println("Letra (i+1)" + ":" + palabra.substring(n, n +1));

             StringTokenizer st = new StringTokenizer (palabra);

             System.out.println (st.countTokens());
             
         }   
         
         System.out.println (m  + " letras");
		
		System.out.println("Buscando Anagramas");
		
	
		
		entrada.close();
		
	}

}
