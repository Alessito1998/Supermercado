package conjuntos;

import java.util.*;

public class EjercicioSet {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String> conjuntoB = Set.of("Luis", "Ana", "Inés", "Beto");
		Set <String> conjuntoB2 = Set.of("Beto", "Luis", "Inés", "Ana");
		Set <String> conjuntoN = Set.of("Pedro", "Ana", "Beto");
		
		System.out.println("Conjunto B: " + conjuntoB);
		System.out.println("Conjunto B2: " + conjuntoB2);
		System.out.println("Conjunto N: " + conjuntoN);
		
		System.out.println("Conjunto B contiene Luis? " + conjuntoB.contains("Luis"));
		System.out.println("Conjunto N contiene Luis? " + conjuntoN.contains("Luis"));
		
		System.out.println("Conjunto B es igual a Conjunto B2? " + conjuntoB.equals(conjuntoB2));
		System.out.println("Conjunto B es igual a Conjunto N? " + conjuntoB.equals(conjuntoN));
		
	}

}
