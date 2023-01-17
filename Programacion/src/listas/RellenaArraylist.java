package listas;

//SOLICITA 10 NÚMEROS

//GUARDA LOS NÚMEROS

//SUMA SUS ELEMENTOS

import java.util.*;

public class RellenaArraylist {

	static Scanner sc = new Scanner(System.in);
		
	public static ArrayList<Integer> rellenaArraylist (ArrayList<Integer> numeros) {
		
	System.out.println("Introduce los nombres para tu lista");
	
	for ( int n = 0; n < 10; n++) {
		
		System.out.println("Introduce el número " + (n + 1));
		
		numeros.add(sc.nextInt());
	
	}
	
	return numeros;
	
	}
	
	public static int sumaArrayList(ArrayList<Integer> numeros) {
	
	int suma = 0;
	
	for ( int n = 0; n < 10; n++) {
		
		suma += numeros.get(n);
		
	}
	
	return suma;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numeros = new ArrayList<>();
		
		rellenaArraylist(numeros);
		
		System.out.println("La suma es: " + sumaArrayList(numeros));
		
	}

}
