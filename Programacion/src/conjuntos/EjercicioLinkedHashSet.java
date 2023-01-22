package conjuntos;

import java.util.*;

//ARRAY DE STRINGS CON 4 NOMBRES

//IMPRIMIMOS EL ARRAY

//CREAMOS UN LINKED HASH SET

//AÑADIMOS 2 NULLOS

//IMPRIMIMOS EL LINKED HASH SET

//BORRAMOS LOS NULOS

//AÑADIMOS EL ARRAY AL LINKED HASH SET

//COMPROBAMOS SI HAY 2 DE LOS NOMBRES INTRODUCIDOS A LA VEZ

//CREAMOS UN TREE SET

//AÑADIMOS EL LINKED HASH SET AL TREE SET

//IMPRIMIMOS EN ORDEN ALFABÉTICO

public class EjercicioLinkedHashSet {

	static Scanner sc = new Scanner(System.in);
	
	public static String [] rellenaArray(String x []) {
		
		x [0] = "Alex";
		x [1] = "Luis";
		x [2] = "Alejandro";
		x [3] = "Taylor"; 
		
		return x;
		
	}
	
	public static void imprimeArray(String x []) {
		
		for (int n = 0; n < x.length; n++) {
			
			System.out.print(x[n] + ", ");
			
		}
		
		System.out.println();
		
	}
	
	public static LinkedHashSet <String> rellenaConjunto(LinkedHashSet <String> x) {
		
		x.add(null);
		x.add(null);
		
		return x;
		
	}
	
	public static void imprimeConjunto(LinkedHashSet <String> x) {
		
		System.out.println(x);
		
	}
	
	public static void borraNulos(LinkedHashSet <String> x) {
		
		x.remove(null);
		
	}
	
	public static void ayadeArray(String x [] ,LinkedHashSet <String> y) {
		
		y.addAll(Arrays.asList(x));
		
	}
	
	public static void compruebaConjunto(LinkedHashSet <String> x) {
		
		System.out.println("Introduce los dos nombres que quieres buscar separados por un espacio");
		
		String [] nombres = sc.nextLine().split(" ");
		
		System.out.println(x.containsAll(Arrays.asList(nombres[0], nombres[1])));
		
	}
	
	public static TreeSet<String> rellenaArboles(TreeSet <String> x, LinkedHashSet <String> y) {
		
		x.addAll(y);
		
		return x;
		
	}
	
	public static void imprimeArbol(TreeSet <String> x) {
		
		System.out.println("Árbol: " + x);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array [] = new String [4];
		
		LinkedHashSet <String> conjunto = new LinkedHashSet <>();
		
		TreeSet <String> conjunto2 = new TreeSet<>();
		
		array = rellenaArray(array);
		
		imprimeArray(array);
		
		conjunto = rellenaConjunto(conjunto);
		
		imprimeConjunto(conjunto);
		
		borraNulos(conjunto);
		
		ayadeArray(array, conjunto);
		
		compruebaConjunto(conjunto);
		
		conjunto2 = rellenaArboles(conjunto2, conjunto);
		
		imprimeArbol(conjunto2);
		
	}

}
