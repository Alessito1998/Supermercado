package pilas;

// ((1+2)+3*5)

import java.util.Scanner;
import java.util.Stack;

public class Reto {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> cositas = new Stack<>();

		System.out.println("Introduce una expresión matemática");

		String expresion = (sc.nextLine()).toString();

		char cosits[] = expresion.toCharArray();

		for (int n = 0; n < cosits.length; n++) {

			if (expresion.equals("(")) {

				cositas.push(expresion);

			if (expresion.equals(")")) {

				cositas.remove(n);
				
			}

			}

		}
		
		if (cositas.isEmpty()) {
			
			System.out.println("Todo bien");
			
		}
		
		else if (!cositas.isEmpty()) {
			
			System.out.println("Error");
			
		}

	}

}
