package listas;

import java.util.*;

// PEDIR DOSM NÚMEROS PARA GENERAL UN RANGO DE VALORES

//SOLICITA NÚMERO CLAVE

//CREAR ARRAYLIST 

//EL PROGRAMA CAMBIA LOS NÚMERO NO MÚLTIPLOS POR 0

public class RetoMultiplos {

	static Scanner sc = new Scanner(System.in);
	
	static int rango0 = 0;
	static int rango1 = 0;
	static int clave = 0;
	
	public static void pedirDatos () {
		
		System.out.println("Introduce el rango de valores");
		
		System.out.println("Desde: ");
		
		rango0 = sc.nextInt();
		
		System.out.println("Hasta: ");
		
		rango1 = sc.nextInt();
		
		System.out.println("Introduce el número a analizar: ");
		
		clave = sc.nextInt();
			
		}
	
	public static ArrayList<Integer> rellenaArrayList (ArrayList<Integer> numeros, int rango0, int rango1){
		
		for (int n = rango0; n <= rango1; n++) {
			
			numeros.add(rango0);
			
			rango0++;
			
		}
		
		return numeros;
		
	}
	
	public static void sustituir (ArrayList<Integer> numeros, int rango0, int rango1, int clave) {
		
		
		for (int n = 0; n < numeros.size(); n++) {
			
			if (numeros.get(n) % clave != 0) {
			
				numeros.set(n, 0);
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pedirDatos();
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros = rellenaArrayList(numeros, rango0, rango1);
		
		sustituir(numeros, rango0, rango1, clave);
		
		System.out.println("Los múltiplos son: " + numeros);
		
	}

}
