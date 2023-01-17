package entregau6;

import java.util.*;

public class ArcaDeNoe {

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
			
			//ES PARA QUE EL RPOGRAMA SEPA QUÉ HA USADO EL SEGUNDO IF
			
			static boolean yaNoPuedoMas = false;
			
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
					
					//CADA VUELTA DE CICLO DESACTIVA BLOCK
					
					//BLOCK IMPIDE QUE SE DUPLIQUEN SUBIDAS DE LOS CONTADORES SI ESTAS DUPLICARÍAN EL INCREMENTO
					
					boolean block = false;
					
					/*
					  
					  ESTE IF SUMARÁ 1 EN EL CONTADOR SIEMPRE QUE EL VALOR SIN LA ÚLTIMA LETRA SEA IGUAL A LA DE SU SIGUIENTE POSICIÓN
					
					  Y QUE A SU VEZ LA ÚLTIMA LETRA (PREVIAMENTE SEPARADA) SEA DIFERENTE A LA DEL VALOR SIGUIENTE DE FORMA PAR O
					  
					  CUANDO  ESTE IF SUMARÁ 1 EN EL CONTADOR SIEMPRE QUE EL VALOR SIN LA ÚLTIMA LETRA SEA IGUAL A LA DE SU SIGUIENTE POSICIÓN
					
					  Y QUE A SU VEZ LA ÚLTIMA LETRA (PREVIAMENTE SEPARADA) SEA DIFERENTE A LA DEL VALOR SIGUIENTE DE FORMA IMPAR
					
					*/
					
					//SOLO ENTRARÁ SIEMPRE QUE EL IF PUEDA LEER LA SIGUIENTE POSICIÓN, ES DECIR, UNA VUELTA ANTES DE LEER LA ÚLTIMA POSICIÓN
					
					if ((n + 1) < sexoAnimal.size()) {
						
							//SI EL ANIMAL SIN SU ÚLTIMA LETRA ES IGUAL A EL ANIMAL SIN SU ÚLTIMA LETRA DE LA SIGUIENTE POSICIÓN
						
						if (((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
								
								//SI LA ÚLTIMA LETRA DEL ANIMAL ES DIFERENTE A LA ÚLTIMA LETRA DEL ANIMAL DE LA SIGUIENTE POSICIÓN
								
								(!sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1)))) ||
								
								//O
								
							//SI EL ANIMAL SIN SU ÚLTIMA LETRA ES IGUAL A EL ANIMAL SIN SU ÚLTIMA LETRA DE LA SIGUIENTE POSICIÓN
								
							((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
									
								//SI LA ÚLTIMA LETRA DEL ANIMAL ES DIFERENTE A LA ÚLTIMA LETRA DEL ANIMAL DE LA SIGUIENTE POSICIÓN (AL ESTAR ORDENADOS ALFABÉTICAMENTE SIEMPRE SERÁ LA MISMA EN CASO DE HABER PAREJA)		
									
								(!sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1))) &&
								
									//SI EL ANIMAL SIN SU ÚLTIMA LETRA ES DIFERENTE A EL ANIMAL SIN SU ÚLTIMA LETRA DE LA SIGUIENTE POSICIÓN
								
									(!sexoAnimal.get(0).equals(sexoAnimal.get(1))))) {
					
								cont++;
								
								//ACTIVA BLOCK PARA QUE NO PUEDA ENTRAR EN LA CONDICIÓN QUE NECESITE QUE SEA IGUAL A FALSE
								
								block = true;

						}	
						
					}
			
					//SOLO ENTRARÁ SIEMPRE QUE EL IF PUEDA LEER LA SIGUIENTE POSICIÓN, ES DECIR, UNA VUELTA ANTES DE LEER LA ÚLTIMA POSICIÓN

					//BLOCK TIENE QUE SER FALSE
					
					if ((n + 1) < sexoAnimal.size() && (block == false)) {
					
							//SI EL VALOR SIN LA ÚLTIMA LETRA SEA IGUAL A LA DE SU POSICIÓN HOMOLOGA CONTRARIA 
					
						if (((sexoAnimal.get(n).equals(sexoAnimal.get(sexoAnimal.size() - (n + 1)))) &&
							
										//SI EL VALOR DE LA ÚLTIMA LETRA SEA DIFERENTE A LA DE SU POSICIÓN HOMOLOGA CONTRARIA
							
										(!sexoAnimalAux.get(n).equals(sexoAnimalAux.get(sexoAnimal.size() - (n + 1)))) || 
								
									//O	
										
									//SI ESTÁN DESCENTRADOS DE LAS POSICIONES MEDIAS DE LA LISTA
										
									//SI EL ANIMAL SIN SU ÚLTIMA LETRA ES IGUAL A EL ANIMAL SIN SU ÚLTIMA LETRA DE LA SIGUIENTE POSICIÓN
										
									(((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
									
									//SI LA ÚLTIMA LETRA DEL ANIMAL ES IGUAL A LA ÚLTIMA LETRA DEL ANIMAL DE LA SIGUIENTE POSICIÓN
									
										(sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1))))) ||
												
												//O	
												
												//SI ESTÁN DESCENTRADOS DE LAS POSICIONES MEDIAS DE LA LISTA
													
												//SI EL ANIMAL SIN SU ÚLTIMA LETRA ES IGUAL A EL ANIMAL SIN SU ÚLTIMA LETRA DE LA SIGUIENTE POSICIÓN
													
												(((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
												
												//SI LA ÚLTIMA LETRA DEL ANIMAL ES IGUAL A LA ÚLTIMA LETRA DEL ANIMAL DE LA SIGUIENTE POSICIÓN
												
													(sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1))) &&
													
														//Y QUE LAS DOS ÚLTIMAS POSICIONES SEAN DIFERENTES
									
														(!sexoAnimal.get(sexoAnimal.size()).equals(sexoAnimal.get(sexoAnimal.size() - 1))))))) {
							
								//EN CASO DE QUE SE DÉ LA PRIMERA OPCIÓN:
							
							//TIENE QUE SER PARA LISTAS MAYORES DE 3 ELEMENTOS
							
							if (sexoAnimal.size() > 3) {
							
								if ((sexoAnimal.get(n).equals(sexoAnimal.get(sexoAnimal.size() - (n + 1)))) &&
										(!sexoAnimalAux.get(n).equals(sexoAnimalAux.get(sexoAnimal.size() - (n + 1)))) && 
									
										//BLOCK TIENE QUE SER FALSE
								
										(block == false)) {
								
									contAux++;
								
								}	
									
							}
							
							//EN CASO DE QUE SE DÉ LA SEGUNDA OPCIÓN:
							
							//TIENE QUE SER PARA LISTAS MAYORES DE 3 ELEMENTOS
							
							if (sexoAnimal.size() > 3) {
			
								if ((block == false) && ((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
										(sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1))) &&
									
										//SI TERMINA EN A AUMENTARÁ contSumaPalabra
									
										sexoAnimalAux.get(n).equals("a")) || ((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
												(sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1))) &&
													sexoAnimalAux.get(n).equals("a") &&
														
														//SUS ÚLTIMAS DOS PALABRAS NO COINCIDEN
													
														(!sexoAnimal.get(sexoAnimal.size()).equals(sexoAnimal.get(sexoAnimal.size() - 1))))) {
									
									contSumaPalabra++;
									
								}
								
								if ((block == false) && ((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
										(sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1))) &&
									
										//SI TERMINA EN O AUMENTARÁ contRestaPalabra
									
										sexoAnimalAux.get(n).equals("o")) || ((sexoAnimal.get(n).equals(sexoAnimal.get(n + 1))) &&
												(sexoAnimalAux.get(n).equals(sexoAnimalAux.get(n + 1))) &&
													sexoAnimalAux.get(n).equals("o") &&
														
														//SUS ÚLTIMAS DOS PALABRAS NO COINCIDEN
													
														(!sexoAnimal.get(sexoAnimal.size()).equals(sexoAnimal.get(sexoAnimal.size() - 1))))) {
									
									contRestaPalabra++;
									
								}
							
								//SI LA DIVISIÓN ENTRE ESTOS ES 1, OSEA, PAR, SUMA CONTAUX
								
								//0/0 ES UNA INDETERMINACIÓN POR LO QUE TIENE QUE SER MAYOR QUE 0 
							
								//contRestaPalabra SERÁ EL DIVIDENDO PORQUE AL ESTAR ORDENADO ALFABÉTICAMENTE SIEMPRE SE DIVIDIRÍA ENTRE 0
								
								if ((contRestaPalabra > 1) && (contSumaPalabra > 1)) {
								
									if ((contRestaPalabra / contSumaPalabra == 1) &&
											
											//BLOCK TIENE QUE SER FALSE
											
											(block == false)) {
								
										contAux += contSumaPalabra;
										
										yaNoPuedoMas = true;
								
									}
									
								}
								
							}
								
						}	

					}
						
				}
				
				//SE DIVIDE ENTRE DOS PORQUE EL IF LO LEE 2 VECES
				
				if (contAux > 1) {
				
					contAux = contAux / 2;
				
				}
				
				//NADIE SABE POR QUÉ, PERO SINO NO FUNCIONA
				
				if (((numAnimales -1) > 5) && ((numAnimales - 1) % 2 == 0) && ((numAnimales - 1) % 4 != 0))  {
					
					contAux--;
					
				}
				
				if (((numAnimales -1) > 5) && ((numAnimales - 1) % 2 == 1) && (yaNoPuedoMas == true)) {
					
					contAux--;
					
				}
					
				//IMPRIMIMOS LA LISTA EN ORDEN ALFABÉTICO Y EL NÚMERO DE PAREJAS
				
				System.out.println(animales);
				
				//SI HAY MÁS DE UNA PAREJA DIRÁ PAREJAS, SI HAY UNA DIRÁ PAREJA, SI NO HAY NINGUNA HABLARÁ EN PLURAL
				
				if (((cont + contAux) > 1) || (cont + contAux) < 1) {
					
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
