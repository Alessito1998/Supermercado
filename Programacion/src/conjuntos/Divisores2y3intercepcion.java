package conjuntos;

import java.util.*;


//Crea 2 hashset de números aleatorios

// Ordena los elementos de los conjuntos

//Muestra por pantalla los conjuntos

//Muestra la intercepción de ambos conjuntos

//Devuelve los divisores de 2 y 3 que hay en la intercepción

public class Divisores2y3intercepcion {

	static Scanner sc = new Scanner(System.in);
	
	static HashSet <Integer> conjuntoA = new HashSet();
	static HashSet <Integer> conjuntoB = new HashSet();
	
	static List <Integer> satanicList3 = new ArrayList();
	
	public static HashSet <Integer> rellenaConjuntos(HashSet <Integer> conjuntos) {
		
		int tamayo = 0;
		
		while (tamayo < 30 || tamayo > 100) {
		
			tamayo = (int)(Math.random() * 100);
		
		}
		
		for (int n = 0; n < tamayo; n++) {
			
			conjuntos.add((int)(Math.random() * 100));
			
		}
		
		return conjuntos;
		
	}
	
	public static void interceccion() {
		
		conjuntoA.retainAll(conjuntoB);
		
		satanicList3.addAll(conjuntoA);
		
		List <Integer> satanicList4 = new ArrayList(conjuntoA);
		
		System.out.println("Intersección: " + satanicList4);
		
		System.out.print("Divisores de 2 y 3: [");
		
		for (int n = 0; n < satanicList3.size(); n++) {
		
			if (n == satanicList3.size() - 1) {
				
				System.out.print(satanicList3.get(n));
				
			}
			
			if (satanicList3.get(n) % 2 == 0 && satanicList3.get(n) % 3 == 0 && satanicList3.get(n) != 0) {
			
				System.out.print(satanicList3.get(n) + ", ");
		
				
				
			}
			
		} 
		
		System.out.print("]");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		conjuntoA = rellenaConjuntos(conjuntoA);
		conjuntoB = rellenaConjuntos(conjuntoB);

		List <Integer> satanicList = new ArrayList(conjuntoA);
		List <Integer> satanicList2 = new ArrayList(conjuntoB);
		
		Collections.sort(satanicList);
		Collections.sort(satanicList2);
		
		System.out.println("conjuntoA ordenado: " + satanicList);
		System.out.println("conjuntoB ordenado: " + satanicList2);
		
		interceccion();
		
	}

}
