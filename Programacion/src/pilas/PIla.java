package pilas;

import java.util.*;

//CREAR UNA PILA, METER 5 STRINGS E IMPRIMIR

public class PIla {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack <String> cositas = new Stack<>();
		
		System.out.println("Mete valores:");
		
		for (int n = 0; n < 5; n++) {
			
			System.out.println("Mete valor " + (n + 1) + ":");
			
			cositas.push(sc.next());
			
		}
			 				
			System.out.println(cositas.peek()); //SIRVE PARA VER EL PRIMER ELEMENTO

			System.out.println("\n");
			
			for (int n = 0; n < cositas.size(); n++) { //SIRVE PARA MIRAR SIN VACIAR
				
				System.out.println(cositas.get(n));
			
			}
			
			System.out.println("\n");
		
			while (!cositas.isEmpty()) { //IMPRIME VACIANDO LA PILA
			
				System.out.println(cositas.pop());
			
		}
		
}
}