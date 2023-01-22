package entregau6;

import java.util.*;

public class Tortitas {

	//HE DADO POR HECHO QUE LOS EJEMPLOS DEL EJERCICIO DEL POWER POINT ESTÁN MAL Y HE HECHO LO QUE PEDÍA EL ENUNCIADO
	
	//DECLARO EL ESCANER ARRIBA PARA PODER USARLO EN TODOS LOS MÉTODOS
	
	static Scanner entrada = new Scanner(System.in);
	
	//DELCARO LA PILA FUERA PARA PODER USARLA EN TODOS LOS MÉTODOS
	
	static Stack <Integer> tortitas = new Stack<>();
	
	//ESTA ES UNA PILA AUXILIAR DONDE VOLVER LOS DATOS TEMPORALMENTE
	
	static Stack <Integer> tortitasAux = new Stack<>();
	
	//ES LA CONSTANTE DE 10 TORTITAS QUE NUNCA CAMBIARÁ Y QUE L USUARIO NO VA A INTRODUCIR
	
	static final int numTortitas = 10;
	
	//FUNCIÓN PARA RELLENAR LA PILA "DE TORTITAS"
	
	public static Stack <Integer> rellenaPilas() {
		
		//EMPEZANDO DESDE ABAJO RELLENARÁ LA TORTITA 1, 2, 3... HASTA LA TORTITA 10
		
		for (int n = 0; n < numTortitas; n++) {
			
			tortitas.push((n + 1));
			
		}
		
		return tortitas;
		
	}
	
	//FUNCIÓN QUE VOLTEARÁ "LAS TORTITAS"
	
	public static Stack <Integer>  volteaTortitas() {
		
		//EN EL EJERCICIO NO QUEDABA CLARO ASÍ QUE HE HECHO QUE DE 4 VUELTAS CÓMO EL EJEMPLO MÁS EXTENSO
		
		for (int n = 0; n < 4 ; n++) {
		
			//numTortita ES EL NÚMERO DE LA POSICIÓN QUE LE DIRÁS AL COCINERO QUE VOLTEE
			
			int numTortita = 0;
			
			//SI SE INTRODUCE UNA POSICIÓN QUE EN LA VIDA REAL NO EXISTE DIRÁ QUE NO EXISTE
			
			while (numTortita <= 0 || numTortita > 10) {
			
				System.out.println("Dile al cocinero qué tortita debe voltear");
				
				//(10 + 1) - N, PARA QUE SI SE PIDE LA 9 SEA LA 9 LA QUE SE QUEDE ARRIBA EN VEZ DE LA 10
				
				numTortita = ((numTortitas + 1) - entrada.nextInt());
				
				if (numTortita <= 0 || numTortita > 10) {
					
					System.out.println("\nEsa tortita no existe\n");
					
				}
				
			}
			
			//SE MOVERÁN LAS TORTITAS DESDE LA POSICIÓN ASIGNADA HACIA ARRIBA A LA PILA AUXILIAR
			
			//LAS TORTITAS DE LA PILA AUXILIAR ENTRAN EN ORDEN DESCENDENTE DE 10, 9, 8...
			
			for (int m = 0; m < numTortita; m++) {
			
				tortitasAux.push(tortitas.pop());
			
			}
			
			//SE VOLTEAN LAS TORTITAS DE LA PILA AUXILIAR PARA QUE VUELVAN A ESTAR EN ORDEN ASCENDENTE
			
			Collections.reverse(tortitasAux);
		
			//SE PASAN LAS TORTITAS DE LA PILA AUXILIAR DE NUEVO A LA PILA ORIGINAL Y LO HARÁN EN ORDEN DESCENDENTE (10, 9, 8 ...)
			
			for (int m = 0; m < numTortita; m++) {
			
				tortitas.push(tortitasAux.pop());
			
			}
			
			//SE IMPRIME LA TORTITA QUE ESTÉ EN LA PARTE SUPERIOR
			
			//CÓMO EN EL EJERCICIO SE IMPRIMIA AL FINAL DEL PROCEDIMIENTO PERO CADA EJEMPLO TENÍA UNA CANTIDAD DE VUELTAS DIFERENTES HE DECIDIDO IMPRIMIRLO CADA VUELTA
			
			System.out.println(tortitas.peek());
			
		}
			
		return tortitasAux;
		
	}
	
	//EL MAIN
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PEDIMOS QUE SE COCINEN LAS TORTITAS (QUE SE RELLENE LA PILA)
		
		rellenaPilas();
		
		//LLAMAMOS A LA FUNCIÓN QUE VOLTEA "LAS TORTITAS"
		
		volteaTortitas();
			
	}

}
