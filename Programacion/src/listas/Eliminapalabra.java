package listas;

import java.util.*;

public class Eliminapalabra {

	static Scanner sc = new Scanner(System.in);
			
	public static LinkedList<String> rellenaLinkedList (LinkedList<String> linked) {
			
		for ( int n = 0; n < 5; n++) {
			
			System.out.println("Escribe palabra");
			
			linked.add(sc.nextLine());
		
		}
		
		return linked;
		
		}
	
	public static void eliminar (char letra, LinkedList<String> linked) {
		
		for (int n = 0; n < linked.size(); n++) {
		
			if (((linked.ne).charAt(0)).equals(letra.charAt(0)) {
			
			linked.remove(linked.indexOf(n));
			
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> linked = new LinkedList<>();
		
		System.out.println("Introduce una letra");
		
		char letra = sc.next().charAt(0);
		
		linked = rellenaLinkedList(linked);
		
		System.out.println("\n" + linked + "\n");
		
		eliminar(letra, linked);
		
		System.out.println("\n" + linked + "\n");
		
	}

}
