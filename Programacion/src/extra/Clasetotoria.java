package extra;

import java.util.*;

public class Clasetotoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String frase = "\nAlex no se entera de la clase String";
		
		for (int n = 0; n < frase.length(); n++) {
			
			if (frase.charAt(n) == 'a' || frase.charAt(n)== 'A') {
				
				frase = frase.replace(frase.charAt(n), 'u');
				
			}
			
			if (frase.charAt(n) == 'e') {
				
				System.out.print(frase.indexOf('e', n) + " ");
				
			}
			
		}
		
		System.out.println(frase);
		
		StringBuilder frase2 = new StringBuilder("Alex no se entera de la clase String");
		
		frase2.append(" este año");
		
		System.out.println(frase2);
		
		System.out.println(frase2.reverse());
		
		String frase3 = "Alex no. se entera. de. la. clase. String";
		
		frase3 = frase3.replace(" ", "");
		
		StringTokenizer frase3_2 = new StringTokenizer(frase3, ".");
		
		while(frase3_2.hasMoreTokens()) {
			
			System.out.print(frase3_2.nextToken());
			
		}
		
	}
	
	

}
