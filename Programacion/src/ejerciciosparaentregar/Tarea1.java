package ejerciciosparaentregar;

import java.util.Scanner;

public class Tarea1 {

	public static void main(String[] args) {
		
//EJERCICIO 1: SALUDO		
		
System.out.println("");		
System.out.println("EJERCICIO 1: SALUDO");
System.out.println("");
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Hola " + nombre);
		
//EJERCICIO 2: SUMA

System.out.println("");
System.out.println("EJERCICIO 2: SUMA");
System.out.println("");

		System.out.println("La operación es 2 + 2 y su resultado debe ser 4, es decir, 2 + 2 = 4");
		System.out.println("Resultado de la ejecución: " + (2 + 2));
		
//EJERCICIO 3: INTERCAMBIO		

System.out.println("");
System.out.println("EJERCICIO 3: INTERCAMBIO");		
System.out.println("");

		int num1, num2, mequieromorir;
		
		
		num1 = 1;
		num2 = 2;
		
		System.out.println("num1 = " + num1 + " y num2 = " + num2);
		
		mequieromorir = num1;
		num1 = num2;
		num2 = mequieromorir;
		
		System.out.println("num1 = " + num1 + " y num2 = " + num2);	
		
//EJERCICIO 4: MULTIPLICA CONSTANTE
		
System.out.println("");
System.out.println("EJERCICIO 4: MULTIPLICA CONSTANTE");		
System.out.println("");

		double Num1 = 6.5;
		double Num2 = 7.8;
		double MultNums = Num1 * Num2;
		
		System.out.println("Variables:\n\nNum1 = 6.5\nNum2 = 7.8 \n");

		System.out.printf("Resultado de la ejecución:\n\n%.2f \n\n", MultNums);
		
		System.out.println("La multiplicación se realiza en la variable llamada MultNums.\nNum1 y Num2 \"solo tinenen un decimal\" (realmente son infinitos, pero son 0 a la derecha).\nPor lo tanto al pedirle que muestre dos decimales el segundo es un cero.");
		
		/*La multiplicación se realiza en la variable llamada MultNums.
		 * Num1 y Num2 "solo tinenen un decimal" (realmente son infinitos, pero son 0 a la derecha).
		 * Por lo tanto al pedirle que muestre dos decimales el segundo es un cero.
		 */
		
//EJERCICIO 5: DIVISIÓN CON DECIMALES
		
System.out.println("");
System.out.println("EJERCICIO 5: DIVISIÓN CON DECIMALES");		
System.out.println("");

		int n1 = 5;
		int n2 = 2;
		double divn = (double)(n1) / (double)(n2);
		
		System.out.println("Variables:\n\nn1 = 5\nn2 = 2 \n");
		System.out.printf("Resultado de ejecución:\n\nn1 / n2 = %.1f \n", divn);
		
//EJERCICIO 6: ENVOLTORIO INTEGER
		
System.out.println("");
System.out.println("EJERCICIO 6: ENVOLTORIO INTEGER");		
System.out.println("");

		String numeroTexto = "100";
		int masUno = Integer.parseInt(numeroTexto) + 1;
		
		System.out.println("Al texto '100' se le sumará 1 en formato int: \n");
		System.out.println(masUno);
		
//EJERCICIO 7: OPERADORES ARITMÉTICOS
		
System.out.println("");
System.out.println("EJERCICIO 7: OPERADORES ARITMÉTICOS");		
System.out.println("");

		byte N1 = 2;
		byte N2 = 1;
		
		
		System.out.println("Variables:\n\nN1 = 5\nN2 = 2 \n");
		System.out.printf("Resultado de ejecución:\n\n");
				
		System.out.println(N1 + N2);
		System.out.println(N1 - N2);
		System.out.println(N1 * N2);
		System.out.println(N1 / N2);

		
//EJERCICIO 8: DIVISIÓN Y MÓDULO
		
System.out.println("");
System.out.println("EJERCICIO 8: DIVISIÓN Y MÓDULO");		
System.out.println("");

		double dividendo = 45;
		double divisor = 10;
		double division = dividendo / divisor;
		double resto = dividendo % divisor;
		
		System.out.println("Variables:\n\ndividendo = 45\ndivisor = 10 \n");
		System.out.printf("Resultado de ejecución:\n\n");
		
		System.out.printf("La división entre %.0f y %.0f es: %.1f[%.0f \n\n", dividendo, divisor, division, resto);
		
		// / Opera la división (en este caso con un decimal) y % muestra el resto (lo he representado con un corchete).
		
//EJERCICIO 9: EDAD Y PESO
		
System.out.println("");
System.out.println("EJERCICIO 9: EDAD Y PESO");		
System.out.println("");

		System.out.println("Introduce tu edad: ");

		int edad = entrada.nextInt();
		int edadSolicitada = (edad + 1);

		
		System.out.println("Introduce tu peso: ");
		
		double peso = entrada.nextDouble();
		double pesoSolicitado = (peso * 2);

		System.out.print("Edad " + edadSolicitada + " años " + "Peso " + pesoSolicitado + "Kg");

		entrada.close();
		
//ALEX GAGGERO
		
	}

}
