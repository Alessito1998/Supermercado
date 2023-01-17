package listas;

import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> array = new ArrayList<>();
		LinkedList<String> linked = new LinkedList<>();
		
		long tiempo;
	
		for(int n = 0; n < 10000; n++) {
		
			array.add("Palabra" + n);
			linked.add("Palabra" + n);
		
		}
	
		System.out.println("TIEMPO INVERTIDO: \n");
	
		tiempo = System.nanoTime();
	
		array.add("Palabra nueba");
		
		System.out.println("Array " + (System.nanoTime() - tiempo + "ns"));
	
		System.out.println("\nTIEMPO INVERTIDO: \n");
		
		tiempo = System.nanoTime();
	
		linked.add("Palabra nueba");
		
		System.out.println("Linked " + (System.nanoTime() - tiempo + "ns"));

		tiempo = System.nanoTime();
		
	}
}
