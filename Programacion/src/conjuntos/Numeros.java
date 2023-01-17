package conjuntos;

import java.util.*;

//PEDIMOS UN NÚMERO ENTRE EL 1 Y EL 100

//CREAMOS UN ARRAY DE ESE TAMAÑO

//RELLENAMOS EL ARRAY CON NÚMEROS ALEATORIOS

//IMPRIMIR ARRAY

//MOSTRAMOS NÚMEROS NO REPETIDOS

public class Numeros {

	static Scanner sc = new Scanner(System.in);
	
	static int num = pedirDatos();
	
	static Integer [] array = rellenar();
	
	static List<Integer> lista =  Arrays.asList(array);
	
	static List <Integer> repetidos;
	
	public static int pedirDatos() {
		
		num = 0;
		
		while (num < 1 || num > 100) {
		
			System.out.println("Introduce un número entre el 1 y el 100");
			
			num = sc.nextInt();
			
		}
		
		return num;
		
	}
	
	public static Integer [] rellenar() {
		
		array = new Integer [num];
		
		for (int n = 0; n < num; n++) {

			array[n] = (int)(Math.random() * 10);
			
		}

		return array;

		}
	
	public static void imprimeArray() {

		for (int n = 0; n < array.length; n++) {

			System.out.print(array[n] + " ");

		}

		System.out.println();
		
		imprimeArray();
		
		imprimeSueltos();
		
	}
	
	public static void imprimeSueltos() {
		
		for (int n = 0; n < lista.size(); n++) {
			
			for (int m = n + 1; m <lista.size(); m++) {
				
				if (lista.get(n) == lista.get(m)) {
					
					repetidos.add(lista.get(n));
					
				}
				
			}
			
		}
		
		lista.removeAll(repetidos);
		
		System.out.println(lista);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
