package arrays;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int n;
		
		double array [] = new double [5];
		
		double media = 0;
		
		for (n = 0; n < 5;) {
		
		System.out.println("Escribe la tona de tus últimos 5 exámenes, llevas " + n + " notas");
		
		double num =  entrada.nextDouble();
		
		if (num > 0) {
		
		array [n] = num;
		
		n++;
		
		media = ((array[0] + array[1] + array[2] + array[3] + array[4]) / array.length); //NO ME MATES, ES QUE QUERÍA CONSEGUIR SACARLO CON DECIMALES
		
		}
		
		else
			
			System.out.println("Escribe un número válido");}
		
		System.out.println("La media de tus últimos 5 exámenes es de " + media);
		
		entrada.close();
		
	}

}
