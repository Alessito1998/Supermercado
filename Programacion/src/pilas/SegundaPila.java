package pilas;

import java.util.ArrayDeque;
import java.util.Scanner;

//CREAMOS UNA PILA ARRAYDEQUE

//AGREGAMOS 5 ELEMENTOS

//SACAR EL PRIMER ELEMENTO (2 VECES)

//ELIMINAR EL PRIMER ELEMENTO (2 VECES)

//SACAR PRIMER ELEMENTO

public class SegundaPila {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<String> cositas = new ArrayDeque<>();

		System.out.println("Mete valores:");

		for (int n = 0; n < 5; n++) {

			System.out.println("Mete valor " + (n + 1) + ":");

			cositas.push(sc.next());

		}

		String accion = "";

		while (!accion.equals("+")) {

			System.out.println("Para sacar la información de la pila pulsa +");

			accion = sc.nextLine();
			if(accion.isEmpty())
				accion = sc.nextLine();
			
			if (accion.equals("+")) {

				for (int n = 0; n < 1; n++) {

					System.out.println(cositas.pop());

				}
			}
		}

		System.out.println("Para sacar la información de la pila pulsa +, otra vez");

		String accion2 = "";

		while (!accion2.equals("+")) {

			accion2 = sc.nextLine();
			
			if (accion2.equals("+")) {

				for (int n = 0; n < 1; n++) {

					System.out.println(cositas.pop());
					
				}
			}
		}

		System.out.println("Para eliminar la información de la pila pulsa -");

		String accion3 = "";

		while (!accion3.equals("-")) {

			accion3 = sc.nextLine();
			
			if (accion3.equals("-")) {
			
				for (int n = 0; n < 1; n++) {

					cositas.remove();
					
				}

			}
		}

		System.out.println("Para eliminar la información de la pila pulsa -, otra vez");

		String accion4 = "";

		while (!accion4.equals("-")) {

			accion4 = sc.nextLine();
			
			if (accion4.equals("-")) {

				for (int n = 0; n < 1; n++) {

					cositas.remove();
					
				}

			}
		}

		System.out.println("Para sacar la información de la pila pulsa +, otra vez");

		String accion5 = "";

		while (!accion5.equals("+")) {

			accion5 = sc.nextLine();
			
			if (accion5.equals("+")) {
			
				for (int n = 0; n < 1; n++) {

					System.out.println(cositas.pop());
					
				}

			}

		}
	}
}
