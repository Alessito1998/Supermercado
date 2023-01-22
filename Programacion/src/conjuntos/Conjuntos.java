package conjuntos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Conjuntos {

	static int cont = 0;
	static int cont2 = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String array [] = new String [4];

		array [0] = "Luis";
		array [1] = "Ana";
		array [2] = "Beto";
		array [3] = "Inés";
		
		String array2 [] = new String [3];
		
		array2 [0] = "Ana";
		array2 [1] = "Beto";
		array2 [2] = "Pedro";
		
		Arrays.sort(array);
		
		Arrays.sort(array2);
		
		List <String> lista =  Arrays.asList(array);
		List <String> lista2 = Arrays.asList(array2);
		ArrayList <String> lista3 = new ArrayList <String> ();
		
		for (int n = 0; n < array.length; n++) {
			
			for (int m = 0; m < array2.length; m++) {
			
				if (array[n].equals(array2[m])) {
				
					System.out.println(array[n]);
				
				}
			}
		}
		
		Collections.sort(lista);
		
		Collections.sort(lista2);
		
		for (int n = 0; n < lista2.size(); n++) {
			
			if (lista.contains(lista2.get(n))) {
					
				lista3.add(lista2.get(n));
					
			}
		}
		
		System.out.println(lista3);
		
	}

}
