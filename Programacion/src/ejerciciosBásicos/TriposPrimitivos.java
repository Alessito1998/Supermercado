package ejerciciosBásicos;

public class TriposPrimitivos {

	
	
	
	
	
	public static void main(String[] args) {
		
		
		boolean esCorrecto;
			esCorrecto = true;
		
		boolean esIncorrecto;
			esIncorrecto = false;
			
		
			System.out.println("Mi clave es correcta? " + esCorrecto);
			
		int cantidadManzanas = 20;
		
		
		System.out.println("Inicialmente tengo " + cantidadManzanas + ".");
		
		cantidadManzanas = cantidadManzanas - 5;
		
		System.out.println("Y después tengo " + cantidadManzanas + ".");
			
		final double fpulgada = 2.54;
		double centimetros = 6.87654;
				
		
		System.out.println(centimetros / fpulgada);
		
		double conversion = centimetros / fpulgada;
		
		System.out.println(conversion);
			
		System.out.printf(fpulgada + " pulgadas, son %.2fcm. \n", conversion);
		
		double conver = conversion * fpulgada / centimetros;
		
		System.out.printf("%.2f centimetros, son %.3f pulgadas. \n", centimetros, conversion);
		
		
		
		
	
}
}
