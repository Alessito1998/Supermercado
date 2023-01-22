package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosMedia {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		while (num > 0) {
			
			System.out.println("Introduce un número");
			
			num = sc.nextInt();
			
			numeros.add(sc.nextInt());
			
		}
		
		for (int n = 0; n < numeros.size(); n++) {
			
			
			
		}
		
	}

}
