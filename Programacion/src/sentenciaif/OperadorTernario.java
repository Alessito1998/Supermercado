package sentenciaif;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		
		int num1 = entrada.nextInt();
		
		System.out.println("Ahora introduce otro número entero");
		
		int num2 = entrada.nextInt();
		
		Integer a = num1 > num2 ?  num1 : num2;
		
		String b = num1 == num2 ? "Ninguno" : a.toString();
				
				System.out.println(b + " es el número mayor");
				
				entrada.close();

				// EL ? ES COMO IF Y ELSE PERO TODO JUNTO
				
	}

}
