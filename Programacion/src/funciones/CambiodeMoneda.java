package funciones;

import java.util.Scanner;

public class CambiodeMoneda {

	public static void main(String[] args) {

//ES EL CÓDIGO DE SILVIA

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la cantidad de euros a convertir");

		double euros = sc.nextDouble();

		System.out.println("A qué moneda quieres convertir (dolares, libras o yenes)");

		String moneda = sc.next();

		//invocamos al procedimiento

		convertirMoneda(euros, moneda);

		sc.close();
		
		}



		public static void convertirMoneda(double cantidad, String moneda) {



		final double aLibras = 0.86;
		final double aDolares = 1.28511;
		final double aYenes = 129852;

		double resultado = 0;

		switch(moneda.toLowerCase()) {

			case "libras":

				resultado = cantidad * aLibras;

			break;

			case "dolares":

				resultado = cantidad * aDolares;

			break;

			case "yenes":

				resultado = cantidad * aYenes;

				break;

			default:

				System.out.println("Moneda incorrecta");

			}

		System.out.println(cantidad + " euros en " + moneda + " son " + resultado + " " + moneda);

		}

		}
