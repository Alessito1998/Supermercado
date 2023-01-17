package sentenciasdecontrol;

import java.util.Scanner;

public class FechaYHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		/*
		
		UTILIZANDO LA INSTRUCCIÓN IF, REALIZA UN PROGRAMA QUE PIDA UNA HORA POR TECLADO Y QUE MUESTRE “BUENOS DÍAS”, 
		“BUENAS TARDES” O “BUENAS NOCHES” SEGÚN LA HORA. SE UTILIZARÁN LOS TRAMOS DE 6 A 12, DE 13 A 20 Y DE 21 A 5 
		RESPECTIVAMENTE. SI EL NÚMERO NO ESTÁ EN EL RANGO (0-23) SE INDICARÁ QUE NO ES CORRECTO. SÓLO SE TIENEN EN CUENTA 
		LAS HORAS, LOS MINUTOS NO SE DEBEN INTRODUCIR POR TECLADO

		EJEMPLO DE EJECUCIÓN: POR FAVOR, INTRODUZCA UNA HORA DEL DÍA (0 - 23): 4BUENAS NOCHES

		EN EL EJEMPLO ANTERIOR EL TEXTO EN COLOR VERDE HA SIDO ESCRITO POR EL USUARIO, MIENTRAS QUE EL RESTO LO HA ESCRITO 
		EL PROPIO PROGRAMA.

		*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Qué hora es?");
		
		int hora = entrada.nextInt();
			
			while (hora < 0 || hora > 24) 
				
				/*
				
				SÉ QUE NO PEDIAS EL WHILE, PERO ME PARECÍA QUE EL PROGRAMA QUEDA FEO SI NO VOLVÍA A PREGUNTAR POR UNA HORA.
				
				*/
				
			{
				
			System.out.println("Introduce una hora válida\n¿Qué hora es?");
			hora = entrada.nextInt();}
			
			/*
			
			NO HE PUESTO LOS TRAMOS COMO DECIAS EN EL ENUNCIADO PORQUE SINO NÚMEROS COMO EL 12 NO LOS IBA A PODER IDENTIFICAR
			NUNCA EL PROGRAMA, ESPERO QUE ASÍ TE SIRVA.
			
			*/
			
			if (hora > 0 && hora < 6) {
				
				System.out.println("Son las " + hora + ", Buenas noches");}
			
			else if (hora >= 6 && hora < 13) { 
		
				System.out.println("Son las " + hora + ", Buenos días");}
		
			else if (hora >= 13 && hora < 21) {
				
				System.out.println("Son las " + hora + ", Buenas tardes");}
			
			else if (hora >= 21 && hora < 25) {
				
				System.out.println("Son las " + hora + ", Buenas noches");}
				
		entrada.close();
		
		}
		

}
