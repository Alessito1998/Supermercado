package sentenciasdecontrol;

import java.util.Scanner;

public class Mayorde5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 
		Utilizando la instrucción for, realiza un programa que lea por teclado
		5 números enterosy determine cuál es el mayor▪ Resultado de la ejecución:
		
		Introduce el numero 1: 3
		Introduce el numero 2: 8
		Introduce el numero 3: 5
		Introduce el numero 4: 7
		Introduce el numero 5: 2
		
		El mayor es: 8
		 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
				
		int mayor = Integer.MIN_VALUE; //HE USADO INTEGER.MIN_VALUE PARA PODER COMPARAR LOS NÚMEROS.
		
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0; // NO PUEDO UTILIZAR ARRAYS EN ESTA UNIDAD SINO NUNCA HARIA ESTO
		
		for (int n = 0; n < 5;) { //LO HE METIDO TODO EN UN MISMO FOR Y EL N++ LO HE PUESTO DENTRO DEL ELSE PARA QUE NO SUME EN CASO DE FALLO.
			
			System.out.println("Introduce 5 números, llevas " + n); //LA N SOLO AUMENTA SI INTRODUCES UN NÚMERO VÁLIDO.
			
			num = entrada.nextInt();
			
			if (num < 0) {
				
				System.out.println("Error. Introduce un número entero"); //SI INTRODUCES UN NÚMERO MENOR QUE 0 SALTA UN ERROR Y TE HACE REPETIRLO
				
			}
			
			else { //DENTRO DE ESTE ELSE ES DÓNDE OCURREN LOS DEMÁS IF.
				
				n++; //VOY A APROVECHAR LA N PARA USARLA COMO SI FUERA UNA POSICIÓN EN UN ARRAY.
			
				if (n == 1) { // NO SE ME HA OCURRIDO UNA FORMA MEJOR DE HACERLO, YA SE QUE CON UN MILLÓN "MEQUERRÍAMORIR" PERO SIN LOS ARRAYS O SIN LAS FUNCIONES NO HE VISTO OTRA OPCIÓN.
				
					num1 = num;
				
				}
		
				else if (n == 2) {
				
					num2 = num;
				
				}
			
				else if (n == 3) {
				
					num3 = num;
				
				}
			
				else if (n == 4) {
				
					num4 = num;
				
				}
			
				else if (n == 5) {
				
					num5 = num;
				
				}
			
				if (mayor < num1) { //INSISTO EN QUE NO SE ME HA OCURRIDO NADA MEJOR SIN ARRAYS Y SIN FUNCIONES.
				
					mayor = num1;
				
				}
				
				if (mayor < num2) {
				
					mayor = num2;
				
				}
			
				if (mayor < num3) {
				
					mayor = num3;
				
				}
			
				if (mayor < num4) {
				
					mayor = num4;
				
				}
			
				if (mayor < num5) {
				
					mayor = num5;
				
				}
			
			}
			
		}
		
		System.out.println("\nNúmero 1: " + num1 +"\nNúmero 2: " + num2 + "\nNúmero 3: " + num3 + "\nNúmero 4: " + num4 + "\nNúmero 5: " + num5);
		
		System.out.println("\nEl número mayor es: " + mayor);
		
		entrada.close();
	}

}
