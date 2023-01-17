package sentenciaif;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("EIntroduce un número entero");
		
		int numero = entrada.nextInt();
		
		if (numero > 9 && numero < 10) {System.out.println("Tiene dos cifras");}
		
			else if (numero > 10 && numero < 100) {System.out.println("Tiene tres cifras");}
		
				else if (numero > 100 && numero < 1000) {System.out.println("Tiene cuatro cifras");}
		
					else if (numero > 1000 && numero < 10000) {System.out.println("Tiene cinco cifras");}
		
						else if (numero > 10000 && numero < 100000) {System.out.println("Tiene seis cifras");}
		
							else if (numero > 100000 && numero < 1000000) {System.out.println("Tiene siete cifras");}
		
								else System.out.println("Tiene más de siete cifras");
		
		entrada.close();
		
		
	}

}
