package conjuntos;

import java.util.*;

//CREAMOS TREESET

//ELIMINAMOS TODOS LOS ELEMENTOS

//COMPROBÁMOS QUE ESTÉ VACÍO TRUE O FALSE

//AÑADIMOS UN 100

//AÑADIMOS UN 10

//AÑADIMOS UN 50

//AÑADIMOS UN 1

//AÑADIMOS UN 13

//IMPRIMIMOS

//COMPROBAMOS SI TIENE UN 50 TRUE O FALSE

//NOS SITUAMOS EN EL ELEMENTO 50 E IMPRIMIMOS LOS ELEMENTOS QUE TIENE DEBAJO

//NOS SITUAMOS EN EL ELEMENTO 50 E IMPRIMIMOS LOS ELEMENTOS QUE TIENE ENCIMA INCLUIDO EL 50

//MOSTRAMOS TODOS LOS ELEMENTOS DEL ARBOL CON UN ITERADOR

public class EjercicioTreeSet {

	public static void borrarConjunto(TreeSet <Integer> x) {
		
		x.clear();
		
		System.out.println(x.isEmpty());
		
		if (x.isEmpty()) {
			
			x = rellenaArbol(x);
			
		}
		
	}
	
	public static TreeSet <Integer> rellenaArbol(TreeSet <Integer> x) {
		
		x.add(100);
		x.add(10);
		x.add(50);
		x.add(1);
		x.add(13);
		
		System.out.println(x);
		
		return x;
		
	}
	
	public static void comprobar(TreeSet <Integer> x) {
		
		System.out.println(x.contains(50));
		
	}
	
	public static void imprimeAbajo(TreeSet <Integer> x) {
		
		System.out.println("Números por debajo del 50: " + x.tailSet(50));
		
	}
	
	public static void imprimeArriba(TreeSet <Integer> x) {
		
		System.out.println("Números por arriba del 50: " + x.headSet(50, true));
		
	}
	
	public static void imprimeArbol(Iterator <Integer> x) {
		
		System.out.println("Árbol:");
		
		while (x.hasNext()) {
			
			System.out.println(x.next());
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet <Integer> conjunto = new TreeSet<>();
		
		conjunto.add(10); //NO ERA NECESARIO PERO POR SI ACASO
		
		borrarConjunto(conjunto);
		
		comprobar(conjunto);
		
		imprimeAbajo(conjunto);
		
		imprimeArriba(conjunto);
		
		Iterator <Integer> arbol = conjunto.iterator();
		
		imprimeArbol(arbol);
		
	}

}
