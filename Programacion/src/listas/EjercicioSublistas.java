package listas;

import java.util.*;

public class EjercicioSublistas {

	public static ArrayList<Integer> rellenaArrayList (ArrayList<Integer> enteros){
		
		for (int n = 0; n < 10; n++) {
			
			enteros.add((int)(Math.random() * 100));
			
		}
		
		return enteros;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> enteros = new ArrayList<>();
		
		enteros = rellenaArrayList(enteros);
		
		System.out.println(enteros);
		
		List<Integer> enteritos = enteros.subList(3, 7);
		
		System.out.println(enteritos);
		
		enteros.removeAll(enteritos);
		
		System.out.println(enteros);
		
	}

}
