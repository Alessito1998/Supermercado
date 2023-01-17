package entregau6;

import java.util.*;

public class Arca2 {

		//ANTES DE NADA ACLARAR QUE TENGO UN FOR BUGUEADO Y QUE PARTE DEL CÓDIGO ESTÁ CONDICIONADO POR ÉL
	
		//DECLARO EL ESCANER ARRIBA PARA PODER USARLO EN TODOS LOS MÉTODOS
		
		static Scanner entrada = new Scanner(System.in);
		
		//ESTE ES EL NÚMERO DE ANIMALES QUE ENTRARÁN EN EL ARCA Y SE PEDIRÁ LA CANTIDAD AL USUARIO (EL EJERCICIO NO LO PIDE PERO ME PARECE MÁS CÓMODO)
		
		//INVOCA DIRECTAMENTE AL MÉTODO Y ES LO PRIMERO QUE PEDIRÁ EL PROGRAMA
		
		static int numAnimales = numAnimales();
		
		//ANIMALES GUARDARÁ QUÉ ANIMAL ENTRA AL ARCA
		
		static String animales;
		
		//LISTAANIMALES ES LA LISTA DONDE ESTARÁN TODOS LOS ANIMALES INTRODUCIDOS
		
		//SEXOANIMAL GUARDA CADA PALABRA DE LA LISTA INICIAL SIN LA ÚLTIMA LETRA
		
		//SEXOANIMALAUX GUARDA LA ÚLTIMA LETRA CORRESPONDIENTE A LA PALABRA DE LA LISTA INICIAL
		
		static ArrayList <String> listaAnimales  = new ArrayList<>();
		static ArrayList <String> sexoAnimal  = new ArrayList<>();
		static ArrayList <String> sexoAnimalAux = new ArrayList<>();
		
		//DECLARO LOS STRINGS EN UNA LÍNEA PARA QUE ESTÉN MÁS ORDENADOS YA QUE TIENEN LOS DOS UN VALOR VACÍO
		
		//SEXO ES LA PALABRA INICIAL INTRODUCIDA EN EL SCANNER SIN SU ÚTIMA LETRA
		
		//SEXOAUX ES LA ÚLTIMA LETRA DE LA PALABRA INICIAL INTRODUCIDA EN EL SCANNER
		
		static String sexo, sexoAux = "";
		
		//DECLARO EL CONTADOR FUERA PARA PODER UTILIZARLO EN CUALQUIER LUGAR
		
		static int cont = 0;
		
		//YA QUE EL FOR ESTÁ BUGUEADO, GUARDO ESTA FRASE EN UNA VARIABLE, SI EL FOR FALLA NO LO IMPRIMIRÁ DOS VECES
		
		static String alessitoGana = "¿Qué animales han entrado?";
		
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
				
				System.out.println(alessitoGana);
				
				//LOS DATOS INTRODUCIDOS SE PONDRÁN EN MINÚSCULAS PARA EVITAR PROBLEMAS
				
				animales = entrada.nextLine().toLowerCase();
				
				//SI EL FOR NO PIDE LOS DATOS LA VARIABLE TENDRÁ VALOR NULO POR LO QUE NO PREGUNTARÁ 2 VECES LO MISMO
				
				//QUEDARÁ UN SALTO DE LÍNEA, PERO PREFIERO ESO A QUÉ PREGUNTE DOS VECES
				
				if (animales.isEmpty()) {
					
					alessitoGana = "";
					
				}
				
				//CÓMO EL FOR ESTÁ BUGUEADO SOLO ENTRARÁ EN EL IF A PARTIR DE LA SEGUNDA VUELTA
				
				//CON CADA VUELTA SE SEPARÁ LA PALABRA INTRODUCIDA EN DOS PARTES, UN PARTE SE LLEVARÁ LA ÚLTIMA LETRA Y LA OTRA EL RESTO
				
				if (!animales.isEmpty()) {
				
					//SEXOAUX SE QUEDARÁ CON LA ÚLTIMA LETRA DE LA PALABRA
					
					sexoAux = animales.substring(animales.length() - 1, animales.length());
						
					//SEXO SE QUEDARÁ CON LO QUE QUEDA DE LA PALABRA
				
					sexo = animales.substring(0, animales.length() - 1);
					
					//SEXOANIMALAUX HARÁ UNA LISTA CON LA ÚLTIMA LETRA DE CADA PALABRA
				
					sexoAnimalAux.add(sexoAux);
				
					//SEXOANIMAL HARÁ UNA LISTA CON LO QUE QUEDA DE LA PALABRA
				
					sexoAnimal.add(sexo);
					
					//SE LLENARÁ LA LISTA DE ANIMALES CON LOS ANIMALES INTRODUCIDOS
					
					listaAnimales.add(animales);
					
					alessitoGana= "¿Qué animales han entrado?";
					
				}
				
			}
			
			//SE ORDENARÁN LOS ANIMALES ALFABÉTICAMENTE, ES TANTO ESTÉTICO CÓMO FUNCIONAL
			
			Collections.sort(sexoAnimal);
			Collections.sort(sexoAnimal);
			
			return sexoAnimal;
			
			}
		
		//EL MÉTODO QUE BUSCARÁ LA CANTIDAD DE PAREJAS
		
		public static void buscaParejas() {
			
			for (int n = 0; n < sexoAnimal.size() - 1; n++) {
				
				/*
				  
				  ESTE IF SUMARÁ 1 EN EL CONTADOR SIEMPRE QUE EL VALOR SIN LA ÚLTIMA LETRA SEA IGUAL A LA DE SU SIGUIENTE POSICIÓN
				
				  Y QUE A SU VEZ LA ÚLTIMA LETRA (PREVIAMENTE SEPARADA) SEA DIFERENTE A LA DEL VALOR SIGUIENTE
				
				*/
				
				if ((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
						(!sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1)))) {
				
						cont++;
		
				}	
				
				/*
				  
				  -ESTE IF SUMARÁ 1 EN EL CONTADOR SIEMPRE QUE EL VALOR SIN LA ÚLTIMA LETRA SEA IGUAL A LA DE SU SIGUIENTE (n + cont) POSICIÓN
				
				  Y QUE A SU VEZ SEA IGUAL A LA ÚLTIMA LETRA (PREVIAMENTE SEPARADA) A LA DEL SIGUIENTE (n + cont) VALOR,
				  
				  ADEMÁS EL PRIMER VALOR (ANIMAL SIN ÚLTIMA LETRA) TENDRÁ QUE SER IGUAL AL SEGUNDO PARA PODER SUMAR Y
				  
				  NO APLICARÁ CUANDO SE ESTÉN ANALIZANDO LOS VALORES "O" PARA EVITAR QUE SE DUPLIQUEN LAS ENTRADAS AL IF
				  
				  -SOLO ENTRARÁ SI HAY SUFICIENTES POSICIONES DENTRO DE LA LISTA PARA PODER SER ANALIZADAS, YA QUE EL SEGUNDO IF OBSERVA 
				  
				  LAS POSICIONES A CADA INCREMENTO DE n + cont
				
				*/
				
				if ((sexoAnimal.size() - n) > cont) {
				
					if ((sexoAnimal.get(n).equals(sexoAnimal.get(n + cont))) &&
							(sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + cont))) &&
								(sexoAnimal.get(0).equals(sexoAnimal.get(1))) &&
									(!sexoAnimalAux.get(n).equals("o"))) {
					
						cont++;
					
						}
				}
				
			}
		
			//IMPRIMIMOS LA LISTA EN ORDEN ALFABÉTICO Y EL NÚMERO DE PAREJAS
			
			System.out.println(listaAnimales);
			
			System.out.println("Hay " + cont + " parejas");
				
		}

		//EL MAIN
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//SE INVOCA AL MÉTODO QUE RELLENA EL ARRAY LIST Y SE INDICA QUE ANIMALES ADOPTE ESE VALOR
			
			rellenaArrayList();
			
			//UNA VEZ RELLENADO EL ARRAYLIST SE INVOCA EL MÉTODO DE BUSCAR LAS PAREJAS
			
			buscaParejas();
			
		}
	
}
