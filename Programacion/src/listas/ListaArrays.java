package listas;

import java.util.*;

public class ListaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1º FORMA
		
		
		List<String> diasSemana = Arrays.asList("lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo");
		
		ArrayList<String> primerArraylist = new ArrayList<>(diasSemana);
		
		// 2º (VACÍO)
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		// AÑADIR ELEMENTOS
	
		numeros.add(2);
		numeros.add(4);
		
		// AÑADIR UNA LISTA DE ELEMENTOS A AL ARRAYLIST
		
		numeros.addAll(Arrays.asList(7,88,85,43,21));
		
		// INTRODUCIR NÚMEROS INTERCALADOS
		
		int posicion = numeros.indexOf(88);
		numeros.add(posicion + 1, 500);
		
		// SUSTITUIR ELEMENTOS
		
		numeros.set(numeros.indexOf(500), 1000);
		
		// ELIMINAR ELEMENTOS
		
		numeros.remove(numeros.indexOf(1000));
		
	}

}
