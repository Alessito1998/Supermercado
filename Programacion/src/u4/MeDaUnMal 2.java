package u4;

import java.util.*;

public class MeDaUnMal {

			//ABRIMOS EL ESCANER DE NOMBRE ENTRADA Y LO DECLARAMOS AQUÍ PARA PODER USARLO SIEMPRE
	
			static Scanner entrada = new Scanner(System.in);
			
			//INICIALIZAMOS LAS FILAS Y LAS COLUMNAS (EL EJERCICIO PIDE QUE SEAN 5 Y 5 RESPECTIVAMENTE)
			
			static int filas = 5;
			static int columnas = 5;
				
			// EL JUEGO SE BASARÁ EN LAS SIGUIENTES DOS MATRICES QUE FUNCIONARÁN DE FORMA PARALELA
			
			//MATRIZ TIENE LOS DATOS DEL JUEGO
			
			//TABLERO ES LO QUE SE MUESTRA POR PANTALLA
			
			static String matriz [][] = rellenar();
			static String tablero [][] = rellenaTablero();
				
			//UN ARRAY DE BOOLEANS, SI LAS POSICIONES DE ESTE ARRAY NO ESTÁN ACTIVAS EL JUEGO NO ACABRÁ
			
			//EL OBJETIVO DE ESTE ARRAY ES QUE NO SE PUEDAN HACER TRAMPAS
			
			//PARA GANAR EN ESTE CÓDIGO ES NECESARIO IGUALAR UN CONTADOR AL NÚMERO DE BOMBAS EN EL TABLERO
			
			//ESTE ARRAY IMPIDE QUE ESE CONTADOR AUMENTE SI LA POSICIÓN YA HA SIDO ACTIVADA PREVIAMENTE
			
			static boolean [][] activar = rellenaActivado();
			
			//SI AL FINALIZAR EL PROGRAMA PERDER ES = TRUE ENTONCES SE HA PERDIDO LA PARTIDA, DE LO CONTRARIO SE HA GANADO
			
			static boolean perder = false;
			
			//FUNCIÓN PARA RELLENAR EL ARRAY CON BOMBAS Y ESPACIOS ALEATORIOS
			
			public static String [][] rellenar() {

				String [][] matriz = new String [filas][columnas];

				int n = 0;
				int m = 0;
				int random = 0;
				String dato = "";
				
				for (n = 0; n < matriz.length; n++) {
					
					for (m = 0; m < matriz[n].length; m++) {
						
						//BUSCAMOS UN NÚMERO RANDOM ENTRE 0 Y 10
						//SI SALE PAR SERÁ * SI ES IMPAR -
						
						random = (int)(Math.random() * 100);
						
						if ((random  % 2) == 0) {
							
							dato = "*";
							
						}
						
						else if ((random  % 2) != 0) {
							
							dato = "-";
							
						}
						
						//SE PIDE QUE SE INSERTE LA INFORMACIÓN EN LA COORDENADA
						
						matriz[n][m] = dato;
						
					}
					
				}
			
				return matriz;

				}
			
			//ESTA FUNCIÓN VA A RELLENAR UNA MATRÍZ QUE ESTARÁ RELLENA CON X PARA NO MOSTRAR "EL CONTENIDO REAL"
			
			public static String [][] rellenaTablero() {

				String [][] tablero = new String [filas][columnas];

				int n = 0;
				int m = 0;
				
				for (n = 0; n < tablero.length; n++) {
					for (m = 0; m < matriz[n].length; m++) {

						tablero[n][m] = "X";
						
				}
				}
			
				return tablero;

				}
			
			public static boolean [][] rellenaActivado () {
				
				boolean [][] activar = new boolean [filas][columnas];
				
				int n = 0;
				int m = 0;
				
				for (n = 0; n < activar.length; n++) {
					for (m = 0; m < activar[n].length; m++) {

						activar[n][m] = false;
						
				}
				}
				
				return activar;
				
			}
			
			//IMPRIMO LA MATRIZ DE JUEGO
			
			//EN ESTE CASO AUNQUE TENGO LAS VARIABLES FUERA SÍ LE INDICO UN VALOR PARA PODER ELEGIR QUÉ IMPROMO SI EL ARRAY DE LOS DATOS O EL TABLERO
			
			public static void imprimeMatriz(String [][] matriz) {

				for (int n = 0; n < matriz.length; n++) {

					for (int m = 0; m < matriz[n].length; m++) {

						System.out.print(matriz[n][m] + " ");

				}

				System.out.println();

				}

				}
			
			//MÉTODO PARA BUSCAR LAS BOMBAS
			
			public static void buscaBombas() {

				int fila = 0;

				int columna = 0;
				
				//INICIALIZAMOS UN CONTADOR A 0 QUE SERÁ QUIÉN NOS DIGA CUANTAS BOMBAS HAY
				
				int cont = 0;
				
				//ESTE CONTADOR AUXILIAR VA A CONTAR EL NÚMERO TOTAL DE BOMBAS
				
				int contAux = 0;
				
				//ESTA VARIABLE SIRVE PARA ELEGIR QUE HACER, DESCUBRIR O MARCAR
				
				String accion = "";
				
				//ESTE FOR VA A CONTAR EL NÚMERO TOTAL DE BOMBAS EN EL ARRAY PARA PODER DETENER EL SIGUIENTE BUCLE
					
				for (int k = 0; k < matriz.length; k++) {
					
					for (int l = 0; l < matriz[k].length; l++) {
						
						if ((matriz[k][l]).equals("*")) {
							
							contAux++;
							
						}	
					
					}
				}
					
					
				//ESTE FOR ES PARA REPETIR EL PROCESO DE BÚSQUEDA
					
					for(int i = 0; i < contAux;) {
						
						//LE PREGUNTAREMOS SI QUIERE MARCAR BOMBA O ABRIR CASILLA
						
						//SERÁ LA VARIABLE PARA SACARNOS DEL WHILE
						
						int noEquals = 0;
						
						//WHILE PARA ASEGURARNOS QUE ESCRIBE LO QUE SE PIDE
						
						while (noEquals != 1) {
						
							System.out.print("\nSi quieres marcar la posición de una bomba escribe '+', si quieres adivinar escribe '-' \n");
						
							accion = entrada.nextLine();
							
								if (accion.isEmpty()) {
									
									accion = entrada.nextLine();
									
								}
						
								if (accion.equals("+") || accion.equals("-")) {
								
						//SI NO INTRODUCIMOS UNA OPCIÓN DE LAS QUE SE PIDE NO SE SALE DEL BUCLE
									
									noEquals = 1;
								
								}
								
						}
						
						//SI ACCION ES + PONDRÁ UN + EN LA CASILLA, SI ES - DESCUBRIRÁ TABLERO
						
						if (accion.equals("+")) {
							
							System.out.println("\nIntroduce las coordenadas\n");
							
							System.out.println("Fila\n");
							
							//TANTO LAS FILAS COMO LAS COORDENADAS SE PEDIRÁS DE UNA FORMA MÁS INTUITIVA AL USUARIO, SIENDO CIFRAS ENTRE EL 1 Y EL 5
							
							fila = (entrada.nextInt() - 1);
							
							System.out.println("Columna\n");
							
							columna = (entrada.nextInt() - 1);
							
							tablero [fila][columna] = "+";
							
							//SI LA COORDENADA CORRESPONDE A UNA BOMBA EN LA MATRIZ Y NO HA SIDO PREVIAMENTE DESCUBIERTA SUMARÁ UN CONTADOR
							
							if ((matriz [fila][columna]).equals("*") && (activar [fila][columna] = false)) {
								
								//CUANDO ESTE CONTADOR SEA IGUAL QUE EL NÚMERO DE BOMBAS EN LA MATRIZ SE GANA LA PARTIDA
								
								i ++;
								
								//SI ESA POSICIÓN ESTÁ DESACTIVADA SE ACTIVARÁ PARA QUE NO PUEDA VOLVER A SUBIR EL CONTADOR EN CASO DE REPETIR LA COORDENADA
								
								activar [fila][columna] = true;
								
							}
							
							imprimeMatriz(tablero);
							
						}
						
						else if (accion.equals("-")) {
						
						//PEDIMOS LAS COORDENADAS SEPARADAS POR FILAS Y COLUMNAS Y SE GUARDAN CADA UNA EN UNA VARIABLE
						//LAS GUARDO COMO FINAL PARA EVITAR QUE CAMBIEN SUS VALORES POR ERROR
							
							//ESTE AUXILIAR SERÁ PARA PODER CREAR UN WHILE QUE SOLO TERMINARÁ AL INTRODUCIR COORDENADAS CORRECTAS
							
							//int filaAux = -2;
							
							//ESTE AUXILIAR SERÁ PARA PODER CREAR UN WHILE QUE SOLO TERMINARÁ AL INTRODUCIR COORDENADAS CORRECTAS
							
							//int columnaAux = -2;
							
							//MIENTRAS QUE NO SE INTRODUZCA UN NÚMERO ENTRE 0 Y EL 4 EL BUCLE CONTINUARÁ
							
							//SI SE INTRODUCE UN CARACTER QUE NO SEA UN NÚMERO DEL 0 AL 4 TAMNBIÉN CONTINUARÁ
							
							//while (((filaAux <= -1 && filaAux >= 5) && ((Integer.toString(filaAux).charAt(filaAux) != 0) || (Integer.toString(filaAux).charAt(filaAux) != 1) || (Integer.toString(filaAux).charAt(filaAux) != 2) || (Integer.toString(filaAux).charAt(filaAux) != 3) || (Integer.toString(filaAux).charAt(filaAux) != 4))) && ((columnaAux <= -1 && columnaAux >= 5) && ((Integer.toString(columnaAux).charAt(columnaAux) != 0) || (Integer.toString(columnaAux).charAt(columnaAux) != 1) || (Integer.toString(columnaAux).charAt(columnaAux) != 2) || (Integer.toString(columnaAux).charAt(columnaAux) != 3) || (Integer.toString(columnaAux).charAt(columnaAux) != 4)))) {
							
								System.out.println("\nIntroduce las coordenadas\n");
						
								System.out.println("Fila\n");
						
								fila = (entrada.nextInt() - 1);
							
								//filaAux = fila;
							
								System.out.println("Columna\n");
						
								columna = (entrada.nextInt() - 1);
							
								//columnaAux = fila;
							
							//}
						
						//INICIALIZAMOS UN CONTADOR A 0 QUE SERÁ QUIÉN NOS DIGA CUANTAS BOMBAS HAY AL REDEDOR
						
							cont = 0;
						
						//SI HACEMOS EXPLOTAR LA BOMBA NOS DIRÁ QUE HEMOS PERDIDOE, SALDRÁ DEL BUCLE IMPRIMIRÁ EL TABLERO COMPLETO
						
							if (matriz[fila][columna].equals("*")) {
												
							perder = true;
							
							i = contAux;
						
							}
						
						//SI NO HACEMOS EXPLOTAR BOMBA NOS DIRÁ CUANTAS BOMBAS HAY EN LAS CASILLAS ADYACENTES
						
							else if (matriz[fila][columna].equals("-")) {
							
								System.out.println("\nHas tenido suerte, coordenada libre\n");					
					
					//ESTE SERIA EL GENÉRICO (PARA FILAS Y COLUMNAS INTERIORES)
					
								if ((fila -1 != -1) && (fila + 1 != matriz.length) && (columna - 1 != -1) && (columna + 1 != matriz.length))  {
					
					//RECORRE FILAS Y COLUMNAS BUSCANDO BOMBAS
					
					//EL SISTEMA BUSCARÁ EN LAS FILAS ANTERIOR, POSTERIOR Y EN LA MISMA EN UN CUADRADO DE 9X9
					
									for (int n = fila - 1; n < fila + 2; n++) { //TIENE QUE SER UN 2 PORQUE HE PUESTO MENOR

										for (int m = columna - 1; m < columna + 2; m++) { //NUNCA VA A SUMAR LA BOMBA DE LA COORDENADA SELECCIONADA PORQUE TIENE QUE SER UN ESPACIO VACÍO
							
							//SOLO AUMENTARÁ EL CONTADOR SI LA MATRIZ TIENE UN *
							
											if (matriz[n][m].equals("*")) {
								
												cont ++;
								
											}
										}
									}
								}
				
				//CUANDO NO EXISTEN NI LA FILA DE ARRIBA NI LA COLUMNA DE LA IZQUIERDA
				
								else if ((fila -1 == -1) && (columna - 1 == -1)) {
									
									for (int n = fila; n < fila + 2; n++) {

										for (int m = columna; m < columna + 2; m++) {
											if (matriz[n][m].equals("*")) {
								
												cont ++;

											}
										}
									}
					
								}
				
				//CUANDO NO EXISTEN NI LA FILA DE ARRIBA NI LA COLUMNA DE LA DERECHA
				
								else if ((fila -1 == -1) && (columna + 1 == matriz.length)) {
					
									for (int n = fila; n < fila + 2; n++) {

										for (int m = columna - 1; m < matriz[n].length; m++) {
											if (matriz[n][m].equals("*")) {
								
												cont ++;
								
											}
										}
									}
					
								}
				
				//CUANDO NO EXISTEN NI LA FILA DE ABAJO NI LA COLUMNA DE LA IZQUIERDA
				
								else if ((fila + 1 == matriz.length) && (columna - 1 == -1)) {
					
									for (int n = fila - 1; n < matriz.length; n++) {
										
										for (int m = columna; m < columna + 2; m++) {
											if (matriz[n][m].equals("*")) {
								
												cont ++;
												
											}
										}
									}
					
								}
				
				//CUANDO NO EXISTEN NI LA FILA DE ABAJO NI LA COLUMNA DE LA DERECHA
								
								else if ((fila + 1 == matriz.length) && (columna + 1 == matriz.length)) {
					
									for (int n = fila - 1; n < matriz.length; n++) {

										for (int m = columna - 1; m < matriz[n].length; m++) {
											if (matriz[n][m].equals("*")) {
								
												cont ++;
									
											}
										}
									}
					
								}
				
				//CUANDO LA FILA DE ARRIBA NO EXISTE
				
								else if (fila -1 == -1) {
					
									for (int n = fila; n < fila + 2; n++) {

										for (int m = columna - 1; m < columna + 2; m++) {
											if (matriz[n][m].equals("*")) {
								
												cont ++;

											}
										}
									}
					
								}
				
				//CUANDO LA FILA DE ABAJO NO EXISTE
				
								else if (fila + 1 == matriz.length) {
					
									for (int n = fila - 1; n < matriz.length; n++) {

										for (int m = columna - 1; m < columna + 2; m++) {
											if (matriz[n][m].equals("*")) {
								
												cont ++;

											}
										}
									}
					
								}
				
				//CUANDO LA COLUMNA DE LA IZQUIERDA NO EXISTE
				
								else if (columna - 1 == -1) {
						
									for (int n = fila - 1; n < fila + 2; n++) {

										for (int m = columna; m < columna + 2; m++) {
											if (matriz[n][m].equals("*")) {
								
												cont ++;

											}
										}
									}
					
								}
				
				//CUANDO LA COLUMNA DE LA DERECHA NO EXISTE
				
								else if (columna + 1 == matriz.length) {
					
									for (int n = fila - 1; n < fila + 2; n++) {

										for (int m = columna - 1; m < matriz[n].length; m++) {
											if (matriz[n][m].equals("*")) {
								
												cont ++;

											}
										}
									}
						
								}
								
								//TABLERO SUSTITUIRÁ X POR EL NÚMERO DE BOMBAS QUE TIENE AL REDEDOR
								
								tablero [fila][columna] = Integer.toString(cont);
								
								//SI CONT VALE 0 EN ESA POSICIÓN SE PONDRA UN -
								
								if (cont == 0) {
									
									tablero [fila][columna] = "-";
									
								}
								
								imprimeMatriz(tablero);
								
							}	
							}
						}
					
					
					if (perder = true) {
						
						System.out.println("\nOh no, has perdido. Has encontrado una bomba.\n");
						
						imprimeMatriz(matriz);
						
					}
					
					else if (perder = false) {
					
						System.out.println("FELICIDADES, HAS COMPLETADO EL NIVEL");
						
					}
					
			}

			//EL MAIN
			
			public static void main(String[] args) {

				System.out.println("EN ESTE BUSCAMINAS LAS COORDENADAS SON NUMÉRICAS TANTO EN LAS FILAS CÓMO EN LAS COLUMNAS\nTANTO LAS FILAS CÓMO LAS COLUMNAS TIENEN VALORES ENTRE EL 1 Y EL 5\nLAS X SON LAS POSICIONES QUE AÚN NO HAS DESCUBIERTO\nLOS * SON LAS BOMBAS\nLOS - SON POSICIONES VACÍAS\nLOS NÚMEROS APARECERÁN EN LAS POSICIONES VACÍAS Y TE INDICARÁN CUÁNTAS BOMBAS ADYACENTES HAY, SI ES QUE LAS HAY\nBUENO, ESTE ES TU TABLERO ¡BUENA SUERTE!\n");
				
				//INVOCAMOS LOS MÉTODOS PARA IMPRIMIR LA MATRÍZ Y EL BUSCADOR DE BOMBAS QUE SERÁ DONDE DECIDIREMOS SI DESCUBRIR LA CASILLA O MARCAR UNA BOMBA
				
				imprimeMatriz(tablero);
				
				buscaBombas();
				
			}
	
}
