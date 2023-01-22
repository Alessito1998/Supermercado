package entregau6;

import java.util.*;

public class NumerosAfortunados {

	//DECLARO EL ESCANER ARRIBA PARA PODER USARLO EN TODOS LOS MÉTODOS
	
	static Scanner entrada = new Scanner(System.in);
	
	//DECLARO LA VARIABLE N FUERA PARA PODER USARLA EN TODOS LOS MÉTODOS Y DIRECTAMENTE INVOCO A LA FUNCIÓN QUE LE DA UN VALOR
	
	//SÉ QUE ES UNA VARIABLE, PERO LA HE LLAMADO N EN MAYÚSCULAS PARA QUE QUEDE CLARO QUE ES LA VARIABLE N DEL ENUNCIADO
	
	static int N = pedirDatos();
	
	//DELCARO LA LISTA FUERA PARA PODER USARLA EN TODOS LOS MÉTODOS
	
	//HE OPTADO POR USAR UNA LINKEDLIST EN VEZ DE UN ARRAYLIST PARA QUE SEA MÁS EFICIENTE
	
	static LinkedList<Integer> numeros = new LinkedList<>();
	
	//FUNCIÓN PARA DARLE VALOR A N
	
	public static int pedirDatos() {
	
		//INICIALIZO N CON VALOR IGUAL A 0 PARA QUE ENTRE EN EL WHILE
		
		N = 0;
		
		//EL ENUNCIADO PIDE QUE N SEA IGUAL O MAYOR QUE N PERO MENOR QUE 100.000 ASÍ QUE SERÁN LOS PARÁMETROS EN LOS QUE TRABAJE EL WHILE
		
		while (N < 2 || N > 100000) {
		
			//SE PIDE UNA CIFRA DENTRO DE ESOS PARÁMETROS AL USUARIO Y N COGERÁ ESE VALOR
			
			System.out.println("Introduce un número mayor o igual a 2 y menor que 100.000");
		
			N = entrada.nextInt();
			
			//SI SE INTRODUCE UN NÚMERO FUERA DE LOS PARÁMETROS DIRÁ QUE NO ES VÁLIDO Y VOLVERÁ A PEDIR UN NÚMERO AL USUARIO
			
			if (N < 2 || N > 100000) {
				
				System.out.println("\nIntroduce un número válido\n");
				
			}
		
		}
			
		return N;
		 
	}
	
	//FUNCIÓN PARA RELLENAR LA LINKEDLIST
	
	public static LinkedList<Integer> rellenaLinkedList() {
		
		//LA LISTA SE LLENARÁ EN ORDEN NÚMERICO ASCENDENTE DEL 1 HASTA N
		
		for ( int n = 0; n < N; n++) {
			
			numeros.add(n + 1);
		
		}
		
		return numeros;
		
		}
	
	//FUNCIÓN PARA REMOVER LOS NÚMEROS DE LA LISTA
	
	//SIEMPRE ELIMINARÁ EL PRIMER VALOR DE LA LISTA, LUEGO LOS ELIMINARÁ A CADA 2, LUEGO A CADA 3, ETC.
	
	public static LinkedList<Integer> remueveNumeros() {
		
		//LA VARIABLE M ESTÁ EN MAYÚSCULAS PARA QUE SE VEA CLARAMENTE QUE ES LA QUE PIDE EL ENUNCIADO
		
		//ES UN DOBLE FOR, EL FOR DE DENTRO CAMBIARÁ TODOS LOS NÚMEROS POR UN 0 CADA M POSICIONES, DONDE M EMPEZARÁ SIENDO 2
		
		//CADA VEZ QUE EL FOR DE DENTRO HAYA CAMBIADO LOS NÚMEROS POR UN 0 EL FOR DE FUERA SE ENCARGARÁ DE ELIMINAR TODOS LOS 0 DE LA LISTA Y AUMENTAR M UNA VEZ
		
		for (int M = 2; M < numeros.size(); M++) {
		
			//n AUMENTARÁ EN n + M CADA VUELTA PARA REALIZAR LOS CAMBIOS SOLO CADA M POSICIONES
			
			for (int n = 0; n < numeros.size();  n += M) {
				
				//LA POSICIÓN n SE CAMBIA POR UN 0
				
				numeros.set(n, 0);

			}
			
			//ESTE MÉTODO ELIMINA TODOS LOS 0 DE LA LISTA
			
			numeros.removeAll(Arrays.asList(0));
		
		}

		//ESTE MÉTODO REVIERTE EL ORDEN DE LA LISTA
		
		Collections.reverse(numeros);
		
		//SE IMPRIME LA LISTA CON UN SALTO DE LÍNEA ANTES PARA QUE SEA MÁS ESTÉTICO
		
		System.out.println("\n" + N + ": " + numeros);
		
		return numeros;
		
	}
	
	//EL MAIN
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//INVOCAMOS EL MÉTODO DE RELLENAR LA LISTA
		
		numeros = rellenaLinkedList();
		
		//INVOCAMOS EL MÉTODO QUE SACA LOS NÚMEROS AFORTUNADOS
		
		numeros = remueveNumeros();
		
	}

}
