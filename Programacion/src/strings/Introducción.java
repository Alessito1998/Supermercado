package strings;

import java.util.Scanner;

public class Introducción {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//%20 --> " "
		//%3A --> ?
		//%3O --> .
		
		System.out.println("Escribe lo que quieras, si escribes '%20', '%3A' o '%3O' se cambiarán estos valores.");
		
		String nuevo = sc.nextLine();
		
		System.out.println("Viejo: " + nuevo);
		
		if (nuevo.contains("20%") || nuevo.contains("%3A") || nuevo.contains("%3O")) {
		
		nuevo = nuevo.replace ("%20", " ");
		nuevo = nuevo.replace ("%3A", "?");
		nuevo = nuevo.replace("%3O", ".");
		
		System.out.println("Nuevo: " + nuevo);
		
		}
		
	}

}
