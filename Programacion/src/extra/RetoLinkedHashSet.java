package extra;

import java.util.*;

public class RetoLinkedHashSet {

	static Scanner sc = new Scanner(System.in);
	
	public static LinkedHashSet<Integer> pedirDatos(LinkedHashSet <Integer> x) {
		
		System.out.println("Introduce números del 1 al 5");
		
		int numeros;
		
		while (x.size() < 5) {
		
			numeros = 0;
			
			while (numeros < 1 || numeros > 5) {
		
				numeros = sc.nextInt();
			
				if (numeros >= 1 && numeros <= 5) {
				
					x.add(numeros);
				
				}
			
			}	
		}
		
		return x;
		
	}
	
	public static void imprimeConjunto(LinkedHashSet <Integer> x) {
		
		for(Integer elemento:x)
			System.out.print(elemento);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet <Integer> conjunto = new LinkedHashSet <>();
		
		conjunto = pedirDatos(conjunto);
		
		imprimeConjunto(conjunto);
		
	}

}
