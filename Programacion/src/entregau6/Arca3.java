package entregau6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arca3 {


	//ANTES DE NADA ACLARAR QUE TENGO UN FOR BUGUEADO Y QUE PARTE DEL CÓDIGO ESTÁ CONDICIONADO POR ÉL
	
	//DECLARO EL ESCANER ARRIBA PARA PODER USARLO EN TODOS LOS MÉTODOS
	
	static Scanner entrada = new Scanner(System.in);
	
	//ESTE ES EL NÚMERO DE ANIMALES QUE ENTRARÁN EN EL ARCA Y SE PEDIRÁ LA CANTIDAD AL USUARIO (EL EJERCICIO NO LO PIDE PERO ME PARECE MÁS CÓMODO)
	
	//INVOCA DIRECTAMENTE AL MÉTODO Y ES LO PRIMERO QUE PEDIRÁ EL PROGRAMA
	
	static int numAnimales = numAnimales();
	
	//ANIMALES ES DONDE SE GUARDARÁN LOS DATOS INICIALMENTE (EL FOR ESTÁ BUGUEADO Y DEJA LA PRIMERA POSICIÓN SIN RELLENAR PORQUE LE DA IGUAL EL SCANNER)
	
	//SEXOANIMAL GUARDA CADA PALABRA DE LA LISTA INICIAL SIN LA ÚLTIMA LETRA
	
	//SEXOANIMALAUX GUARDA LA ÚLTIMA LETRA CORRESPONDIENTE A LA PALABRA DE LA LISTA INICIAL
	
	static ArrayList <String> animales  = new ArrayList<>();
	static ArrayList <String> sexoAnimal  = new ArrayList<>();
	static ArrayList <String> sexoAnimalAux = new ArrayList<>();
	
	//DECLARO LOS STRINGS EN UNA LÍNEA PARA QUE ESTÉN MÁS ORDENADOS YA QUE TIENEN LOS DOS UN VALOR VACÍO
	
	//SEXO ES LA PALABRA INICIAL INTRODUCIDA EN EL SCANNER SIN SU ÚTIMA LETRA
	
	//SEXOAUX ES LA ÚLTIMA LETRA DE LA PALABRA INICIAL INTRODUCIDA EN EL SCANNER
	
	static String sexo, sexoAux = "";
	
	//DECLARO LOS CONTADORES FUERA PARA PODER UTILIZARLO EN CUALQUIER LUGAR
	
	static int cont, contAux, contSumaPalabra, contRestaPalabra = 0;
	
	//HE HECHO UN STRINGBUILDER PARA PODER DECIR PAREJAS (EN PLURAL) CUANDO HAYA MÁS DE UNA PAREJAS
	
	static StringBuilder parejaS = new StringBuilder(" pareja");
	
	//UNA VARIABLE PARA DISIMULAR LOS ERRORES DEL FOR BUGUEADO
	
	static String alex = "¿Qué animales han entrado?";
	
	//EL MÉTODO QUE INDICA CUÁNTOS ANIMALES ENTRAN EN EL ARCA
	
	public static int numAnimales() {
		
		//SE PIDE EL NÚMERO Y SE LE SUMA 1 YA QUE EL FOR QUE RELLENA LA LISTA ESTÁ BUGUEADO, ASÍ COINCIDIRÁ CON LA CANTIDAD DE DATOS QUE DEJA INTRODUCIR
	
		System.out.println("¿Cuántos animales han entrado en el arca?");
		
		numAnimales = entrada.nextInt() + 1;
		
		return numAnimales;
		
	}
	
	//EL MÉTODO QUE RELLENA EL ARRAYLIST
	
	public static ArrayList<String> rellenaArrayList() {
		
		//PREGUNTA POR EL ANIMAL E INTRODUCE ESE DATO EN LA LISTA (LA PRIMERA POSICIÓN QUEDA VACÍA PORQUE EN LA PRIMERA VUELTA NO LE DA LA GANA DE PEDIR LOS DATOS)
		
		for (int n = 0; n < numAnimales; n++) {
			
			System.out.println(alex);
			
			//SI NO ESTÁ VACÍO PONDRÁ UN SALTO DE LÍNEA
			
			//ESTO DISIMULARÁ EL ERROR QUE PRODUCE EL FOR
			
			if (n > 1) {
				
				System.out.println();
				
			}
			
			//LOS DATOS INTRODUCIDOS SE PONDRÁN EN MINÚSCULAS PARA EVITAR PROBLEMAS
			
			animales.add(entrada.nextLine().toLowerCase());
			
			//CON ESTE IF LO QUE SE PRETENDE ES QUE NO PREGUNTE DOS VECES SEGUIDAS CUANDO FALLE EL FOR
			
			//SI LA PRIMERA POSICIÓN DE LA LISTA ESTÁ VACÍA LA PREGUNTA TAMBIÉN
			
			if (animales.get(n).isEmpty()) {
				
				alex = "";
				
			}
				
			
			else {
				
				//POR ESTÉTICA Y PARA YUDAR A DISIMULAR EL FOR
				
				System.out.println();
				
				alex = "¿Qué animales han entrado?";
				
			}
			
		}
		
		//SE ORDENARÁN LOS ANIMALES ALFABÉTICAMENTE, ES TANTO ESTÉTICO CÓMO FUNCIONAL
		
		Collections.sort(animales);
		
		//SE ELIMINARÁ LA PRIMERA POSICIÓN PORQUE QUEDA VACÍA
		
		animales.remove(0);
		
		return animales;
		
		}
	
	//EL MÉTODO QUE BUSCARÁ LA CANTIDAD DE PAREJAS
	
	public static void buscaParejas() {
		
		//ESTE FOR SEPARARÁ LOS STRINGS EN SUBSTRINGS Y EN DIFERENTES LISTAS, DE MANERA QUE LA ÚLTIMA LETRA DE CADA PALABRA IRÁ A UNA LISTA Y EL RESTO A OTRA
		
		//LA ÚLTIMA LETRA IRÁ A LA LISTA SEXOANIMALAUX Y LO DEMÁS A SEXOANIMAL
		
		for (int n = 0; n < animales.size(); n++) {
			
			//POR CADA VUELTA DEL BUCLE SEXO SE SOBREESCRIBIRÁ Y PASARÁ LA NUEVA INFORMACIÓN A LAS NUEVAS LISTAS
			
			sexo =animales.get(n);
			
			//SEXOAUX SE QUEDARÁ CON LA ÚLTIMA LETRA
			
			sexoAux = sexo.substring(sexo.length() - 1, sexo.length());
					
			//SEXO SE QUEDARÁ CON LO QUE QUEDA DE LA PALABRA
			
			sexo = sexo.substring(0, sexo.length() - 1);
				
			//SEXOANIMALAUX HARÁ UNA LISTA CON LA ÚLTIMA LETRA DE CADA PALABRA
			
			sexoAnimalAux.add(sexoAux);
			
			//SEXOANIMAL HARÁ UNA LISTA CON LO QUE QUEDA DE LA PALABRA
			
			sexoAnimal.add(sexo);
			
		}
		
		//ESTE FOR LEE LAS DOS LISTAS CREADAS EN EL FOR ANTERIOR SIMULTANEAMENTE Y DECIDE SI AUMENTAR DEL CONTADOR O NO
		
		//EL HECHO DE QUE ESTÉN ORDENADOS ALFABÉTICAMENTE PERMITE QUE FUNCIONEN ESTAS CONDICIONES
		
		for (int n = 0; n < sexoAnimal.size(); n++) {
			
			//SOLO ENTRARÁ SIEMPRE QUE EL IF PUEDA LEER LA SIGUIENTE POSICIÓN, ES DECIR, UNA VUELTA ANTES DE LEER LA ÚLTIMA POSICIÓN
			
			if ((n + 1) < sexoAnimal.size()) {
			
				if ((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
						(sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1))) &&
							sexoAnimalAux.get(n).equals("a")) {
							
					contSumaPalabra++;
					
				}
						
				if ((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
						(sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1))) &&
							sexoAnimalAux.get(n).equals("o")) {
							
					contRestaPalabra++;
							
				}
				
				if ((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
						!sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1))) {
				
					cont++;
					
				}
			}
						
			cont += (contSumaPalabra - contRestaPalabra);	
			
		}
	
		//si por un mismo lado coinciden n y n +1 pero no sus homologos y lo mismo con los homologos
		
		System.out.println("Observador 3 de ContAux: " + contAux);
		
		//SE DIVIDE ENTRE DOS PORQUE IF LO LEE 2 VECES
		
		cont = cont / 2;
		
		System.out.println("Observador 4 de ContAux: " + contAux);
		
		System.out.println("Observador 5 de Cont: " + cont);
	
		//IMPRIMIMOS LA LISTA EN ORDEN ALFABÉTICO Y EL NÚMERO DE PAREJAS
		
		System.out.println(animales);
		
		//SI HAY MÁS DE UNA PAREJA DIRÁ PAREJAS, SI HAY UNA DIRÁ PAREJA
		
		if ((cont + contAux) > 1) {
			
			parejaS.append("s");

		}
		
		System.out.println("Hay " + (cont + contAux) + parejaS);
			
	}

	//EL MAIN
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SE INVOCA AL MÉTODO QUE RELLENA EL ARRAY LIST Y SE INDICA QUE ANIMALES ADOPTE ESE VALOR
		
		animales = rellenaArrayList();
		
		//UNA VEZ RELLENADO EL ARRAYLIST SE INVOCA EL MÉTODO DE BUSCAR LAS PAREJAS
		
		buscaParejas();
		
	}

	
}
