package u4;

import java.util.Scanner;

public class BuscaminasMejorado {

	//ABRIMOS EL ESCANER DE NOMBRE ENTRADA
	
		static Scanner entrada = new Scanner(System.in);
		
		//DECLARO PERDER ARRIBA PARA PODER USALRA
		
		//SI PERDER ES TRUE SE FINALIZARÁ EL PROGRAMA, SINO CONTINUARÁ
		
		static boolean perder = false;
		
		//FUNCIÓN PARA RELLENAR EL ARRAY CON BOMBAS Y ESPACIOS ALEATORIOS
		
		public static String[][] rellenar(int filas, int columnas) {

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
		
		public static String[][] rellenaTablero(int filas, int columnas) {

			String [][] matriz = new String [filas][columnas];

			int n = 0;
			int m = 0;
			
			for (n = 0; n < matriz.length; n++) {
				for (m = 0; m < matriz[n].length; m++) {

					matriz[n][m] = "X";
					
			}
			}
		
			return matriz;

			}
		
		//IMPRIMO LA MATRIZ DE JUEGO
		
		public static void imprimeMatriz(String [][] matriz) {

			for (int n = 0; n < matriz.length; n++) {

				for (int m = 0; m < matriz[n].length; m++) {

					System.out.print(matriz[n][m] + " ");

			}

			System.out.println();

			}

			}
		
		//MÉTODO PARA BUSCAR LAS BOMBAS
		
		public static void buscaBombas(String [][] matriz, String [][] tablero) {

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
					
						System.out.print("\nSi quieres marcar la posición de una bomba escribe '+', si quieres adivinar escribe '-' \n\n");
					
						accion = entrada.nextLine();
					
							if (accion.equals("+") || accion.equals("-")) {
							
					//SI NO INTRODUCIMOS UNA OPCIÓN DE LAS QUE SE PIDE NO SE SALE DEL BUCLE
								
								noEquals = 1;
							
							}
							
					}
					
					//SI ACCION ES + PONDRÁ UN + EN LA CASILLA, SI ES - DESCUBRIRÁ TABLERO
					
					if (accion.equals("+")) {
						
						System.out.println("\nIntroduce las coordenadas\n");
						
						System.out.println("Fila\n");
						
						fila = entrada.nextInt();
						
						System.out.println("Columna\n");
						
						columna = entrada.nextInt();
						
						tablero [fila][columna] = "+";
						
						imprimeMatriz(tablero);
						
						//SI LA COORDENADA CORRESPONDE A UNA BOMBA EN LA MATRIZ SUMARÁ UN CONTADOR
						
						if ((matriz [fila][columna]).equals("+")) {
							
							//CUANDO ESTE CONTADOR SEA IGUAL QUE EL NÚMERO DE BOMBAS EN LA MATRIZ SE GANA LA PARTIDA
							
							i ++;
							
						}
						
					}
					
					else if (accion.equals("-")) {
					
					//PEDIMOS LAS COORDENADAS SEPARADAS POR FILAS Y COLUMNAS Y SE GUARDAN CADA UNA EN UNA VARIABLE
					//LAS GUARDO COMO FINAL PARA EVITAR QUE CAMBIEN SUS VALORES POR ERROR
					
						System.out.println("\nIntroduce las coordenadas\n");
					
						System.out.println("Fila\n");
					
						fila = entrada.nextInt();
					
						System.out.println("Columna\n");
					
						columna = entrada.nextInt();
					
					//INICIALIZAMOS UN CONTADOR A 0 QUE SERÁ QUIÉN NOS DIGA CUANTAS BOMBAS HAY AL REDEDOR
					
						cont = 0;
							
						}
					
					//SI HACEMOS EXPLOTAR LA BOMBA NOS DIRÁ QUE HEMOS PERDIDO E IMPRIMIRÁ EL TABLERO COMPLETO
					
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
					
								//SI CONT VALE 0 EN ESA POSICIÓN SE PONDRA UN -
								
								if (cont == 0) {
									
									tablero [fila][columna] = "-";
									
								}
								
								//TABLERO SUSTITUIRÁ X POR EL NÚMERO DE BOMBAS QUE TIENE AL REDEDOR
								
								tablero [fila][columna] = Integer.toString(cont);
					
								imprimeMatriz(tablero);
							}
							
							tablero [fila][columna] = Integer.toString(cont);
							
							imprimeMatriz(tablero);
							
						}
					}
				
				
				if (perder = true) {
					
					System.out.println("\nOh, no. Has perdido, una bomba.\n");
					
					imprimeMatriz(matriz);
					
				}
				
				else if (perder = false) {
				
					System.out.println("FELICIDADES, HAS COMPLETADO EL NIVEL");
					
				}
				
		}

		//EL MAIN
		
		public static void main(String[] args) {

			//INICIALIZAMOS LAS FINALS Y LAS COLUMNAS (EL EJERCICIO PIDE QUE SEAN 5 Y 5)
			
			int filas = 5;
			int columnas = 5;
			
			//INVOCAMOS A LA FUNCIÓN QUE RELLENA EL ARRAY DE STRINGS QUE SERÍA EL TABLERO
			
			//SON DOS MATRICES PARALELAS DONDE SOLO SE MUESTRA EL TABLERO POR PANTALLA PERO LOS DATOS ESTAN EN LA MATRIZ
			
			String matriz [][] = rellenar(filas, columnas);
			String tablero [][] = rellenaTablero(filas, columnas);
			
			//INVOCAMOS LOS MÉTODOS PARA IMPRIMIR LA MATRÍZ Y EL BUSCADOR DE BOMBAS
			
			imprimeMatriz(tablero);
			
			buscaBombas(matriz, tablero);
			
		}
	
}
