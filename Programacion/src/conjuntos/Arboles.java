package conjuntos;

import java.util.TreeSet;

public class Arboles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet <String> conjunto = new TreeSet<>();
		
		conjunto.add("Alex");
		conjunto.add("Alex2");
		conjunto.add("Alex3");
		conjunto.add("Alex4");
		conjunto.add("Alex5");
		conjunto.add("Alex6");
		conjunto.add("Alex7");
		
		System.out.println("Nombres: " + conjunto);
		
		String primero = conjunto.first();
		
		System.out.println("Primero: " + primero);
		
		String ultimo = conjunto.last();
		
		System.out.println("Ültimo: " + ultimo);
		
	}

}
