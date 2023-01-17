package arrays;

import java.util.Scanner;

public class ArrayDeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		String semanita [] = new String [7];
		
		String semana = "0";
		
		for ( int dia = 0; dia <= (semanita.length - 1); dia++) {
		
		System.out.println("Introduce el día " + (dia +1) + " de la semana");
		
		semana =  entrada.nextLine();
		
		semanita [dia] = semana;}
		
		//for ( int n = 0; n <= (semanita.length - 1) ; n++) //IMPRIME LOS DÍAS DE LA SEMANA EN ORDEN
		
		//System.out.print(semanita[n] + " ");
		
		
		//for ( int n = (semanita.length - 1); n >= 0 ; n--) //IMPRIME LOS DÍAS DE LA SEMANA HACIA ATRÁS
		
		//System.out.print(semanita[n] + " ");
	
		for ( int n = 0; n <= (semanita.length - 1) ; n += 2) //IMPRIME LOS DÍAS DE LA SEMANA PARES
		
		System.out.print(semanita[n] + " ");
		
		entrada.close();
		
	}

}
