/**
 * 
 */
package ejerciciosBásicos;

/**
 * @author alex
 *
 */
public class AppMain2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int edad = 23;
		int year = 2022;
		String name = "Nuria";
		float height = 1.68F;
		
		//print es para escribir en general.
		//ln es para hacer un salto de linea.
		//\n es para hacer un salto de linea pero va dentro de la función y entre comillas.
		//f es para reducir el gasto de memoria y puedes configurarle cosillas (con el otro creo que también pero es mas eficiente así).
		//las variable mejor ponerlas arriba y cosas como String, qué es una clase, van en mayúsculas, el resto todo minúsculas. (System es en mayúsculas).
		// en los float hay que poner la F porque sino se buguea.
		
		System.out.println("Hello clase de DAW. " + "Me llamo Alex y tengo " + edad + " años.");
		System.out.print("Cositas nuevas." + "Todavía mas cositas, pero seguidas.\n");
		System.out.println("Cositas con salto de linea con la n.");
		System.out.printf("Cosotas\n");
		System.out.println(1 + 2 + 3);
		System.out.print(1);
		System.out.print(2 + 3 + "\n");
		System.out.printf("Me llamo Alex y tengo  %d años, pero con printf. Es el año %d y cada 'porcentaged' va por orden de lo que le pongas detrás de la frase. Ah, y me caes mal %s aunque midas %.2f", edad, year, name, height);
	}

}
