package listas;

import java.util.*;

//PEDIR LOS NOMBRES

//USAR SPLIT PARA METER EL STRING EN EL ARRAY

//SOLICITA EL NOMBRE PARA BUSCARLOS

//BUSCAR EL NOMBRE EN LA LISTA CON INDEXOF

	public class Reto {

	static Scanner sc = new Scanner(System.in);
	
	public static void pedirDatos () {
		
	System.out.println("Introduce los nombres para tu lista");
	
	String nombre = sc.nextLine();
		
	}
	
	public static String [] arrayar (String nombre) {
		
		String nombres [] = nombre.split("");
		
		List<String> listaNombres = Arrays.asList(nombres);
		
		return nombres;
		
	}
	
	public static void buscarDatos () {
		
		System.out.println("Introduce el nombre a buscar");
		String nombre = sc.nextLine();	
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pedirDatos();
		arrayar();
		
	}

}
