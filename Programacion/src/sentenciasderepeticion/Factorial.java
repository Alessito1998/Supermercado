package sentenciasderepeticion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		int num;
		int resultado=1;
  final int uno = 1; //LO DECLARO COMO VARIABLE NUMÉRICA POR SI HUBIERA QUE HACER OPERACIONES MÁS ADELANTE CON ESTE 1.
		
do {System.out.println("Introduce un número entero mayor que 0 para conocer su factorial.");
		
		num = entrada.nextInt();
		
		if (num < 0) {
		 System.out.println("Introduce un número válido.");}}

		while (num < 0); //NADIE SABE QUE HACE ESTE WHILE PERO SI LO QUITAS EL CÓDIGO NO FUNCIONA
		
		System.out.print(num + "!" + " = "); 
		
		for(n = 0; n <= num - 2; n++)
			
		{
				
			System.out.print((num - n) + " X ");
			resultado = resultado * (num-n);
			
			}
		
		System.out.println(uno + " = " + resultado + "\n");
		
		entrada.close();

	}


}
