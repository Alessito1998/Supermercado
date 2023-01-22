package conjuntos;

import java.util.HashSet;
import java.util.Scanner;

public class Alex {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet <String> conjuntoA = new HashSet();
		
		for (int n = 0; n < 4; n++) {
			
			conjuntoA.add(sc.nextLine());
			
		}
		
		System.out.println(conjuntoA);
	}

}
