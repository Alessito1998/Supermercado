package conjuntos;

import java.util.*;

public class Humanos {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet <String> conjuntoA = new HashSet();
		HashSet <String> conjuntoB = new HashSet();
		
		System.out.println("Escribe nombres");
		
		String nombres = sc.nextLine();
		
		conjuntoA.addAll(Arrays.asList(nombres.split(" ")));
		
		/*String [] arrayNombres = nombres.split(nombres);
		
		List <String> listaNombres = Arrays.asList(arrayNombres);
		
		conjuntoA.addAll(listaNombres);*/
		
		System.out.println("Escribe más nombres");
		
		String nombres2 = sc.nextLine();
		
		/*String [] arrayNombres2 = nombres2.split(nombres2);
		
		List <String> listaNombres2 = Arrays.asList(arrayNombres2);
		
		conjuntoB.addAll(listaNombres2);*/
		
		conjuntoB.addAll(Arrays.asList(nombres2.split(" ")));
		
		System.out.println(conjuntoA);
		System.out.println(conjuntoB);
		
	}
	
}
