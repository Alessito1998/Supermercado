package extra;

import java.util.*;

public class ConSet {

	static Scanner sc = new Scanner(System.in);
	
	public static void pedirDatos() {
		
		List <Integer> numeros = new ArrayList <Integer>();
		
		int aux = 0;
		
		while (numeros.contains(aux)) {
		
			System.out.println("Introduce números");
			
			aux = sc.nextInt();
			numeros.add(aux);

		}
		
		imprimir(numeros);
		
	}
	
	public static void imprimir (List <Integer> list) {
		
		System.out.println(list);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pedirDatos();
		
	}

}
