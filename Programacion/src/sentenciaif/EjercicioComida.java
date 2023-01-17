package sentenciaif;

import java.util.Scanner;

public class EjercicioComida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner entrada = new Scanner(System.in);

final double precioTortilla = 6.65;
double precioLentejas = 10;
double precioCerveza = 3;
double precioAgua = 1;
double precioHelado = 4;
double precioFlan = 3;
double precioPrincipal = 0;
double precioBebida = 0;
double precioPostre = 0;


		System.out.printf("%25s\n\n%s\n\n%-20s%20s€\n%-20s%20s€\n\n%s\n\n%-20s%20s€\n%-20s%20s€\n\n%s\n\n%-20s%20s€\n%-20s%20s€\n\n", "Menú", "Principales:", "Tortilla", precioTortilla, "Lentejas", precioLentejas, "Bebidas:", "Cerveza", precioCerveza, "Agua", precioAgua, "Postres:", "Helado", precioHelado, "Flan", precioFlan);
		
		System.out.println("Elige tu menú");
		System.out.println("Principal:");
	
		String primero = entrada.nextLine().toLowerCase();
		
		
		switch (primero.toLowerCase()) {
		
		case "tortilla" : 
		
			precioPrincipal = precioTortilla;
			
			System.out.println("Cuesta " + precioPrincipal);
			
		break ;
			
		case "lentejas" : 
			
			precioPrincipal = precioLentejas;
			
			System.out.println("Cuestae " + precioPrincipal);
			
		break ;
		
		default :
			
			System.out.println("Eres tonto");
			
		}
		

		
		System.out.println("bebida:");
		
		String bebida = entrada.nextLine().toLowerCase();
		
switch (bebida.toLowerCase()) {
		
		case "cerveza" : 
			
			precioBebida = precioCerveza;
		
			System.out.println("Cuesta " + precioBebida);
			
		break ;
			
		case "agua" : 
			
			precioBebida = precioAgua;
			
			System.out.println("Cuesta " + precioBebida);
			
		break ;
		
		default :
			
			System.out.println("Eres tonto");
			
		}

	System.out.println("postre:");

	String postre = entrada.nextLine().toLowerCase();

	switch (postre.toLowerCase()) {

	case "helado" : 
	
		precioPostre = precioHelado;

		System.out.println("Cuesta " + precioPostre);
	
		break ;
	
	case "flan" : 
	
		precioPostre = precioFlan;
	
		System.out.println("Cuesta " + precioPostre);
	
	break ;

	default :
	
		System.out.println("Eres tonto");
	
}

double precioFinal = precioPrincipal + precioBebida + precioPostre;

if (precioFinal >= 15) {precioFinal = precioFinal - (precioFinal * 0.03);

	System.out.println("Su cuenta final es de " + precioFinal + " ¿Puede pagarlo?");}

else {

System.out.println("Su cuenta final es de " + precioFinal + " ¿Puede pagarlo?");}

System.out.println("Si puede pagarlo di Si, sino di No");

String decision = entrada.nextLine().toLowerCase();

if (decision.equalsIgnoreCase("si")) {System.out.println("Perfecto ahora le preparamos su pedido");}

else
	
System.out.println("Larguese de aquí");
		
entrada.close();
	}

}
