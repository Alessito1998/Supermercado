package u4;

import java.util.*;

public class BuscaminasMuyMejorado {

	//ABRIMOS EL ESCANER DE NOMBRE ENTRADA Y LO DECLARAMOS AQUÍ PARA PODER USARLO SIEMPRE
	
	static Scanner entrada = new Scanner(System.in);
	
	//INICIALIZAMOS LAS FILAS Y LAS COLUMNAS (EL EJERCICIO PIDE QUE SEAN 5 Y 5 RESPECTIVAMENTE)
	
	//LAS DECLARAMOS FINAL PORQUE SON CONSTANTES Y AUNQUE NO VAN A CAMBIAR DE VALOR ES MÁS CORRECTO DECLARARLAS COMO LO QUE SON, CONSTANTES
	
	//EN CASO DE QUE SE QUIERA MODIFICAR EL TAMAÑO DEL TABLERO SIMPLEMENTE HABRÍA QUE MODIFICAR ESTOS VALORES Y FUNCIONARÍA CORRECTAMENTE PARA TABLEROS DE CÓMO MUCHO 9X9
	
	static final int filas = 5;
	static final int columnas = 5;
	
	//FILA Y COLUMNA SON VALORES QUE EL USUARIO INTRODUCIRÁ
	
	static int fila = 0;
	static int columna = 0;
	
	//ESTA VARIABLE SIRVE PARA QUE EL USUARIO ELIJA QUÉ HACER, DESCUBRIR O MARCAR UNA COORDENADA
	
	//CUANDO QUIERA MARCAR TOMARÁ EL VALOR +
			
	//CUANDO QUIERA DESCUBRIR TOMARÁ EL VALOR -
			
	static String accion = "";
		
	//EL JUEGO SE BASARÁ EN LAS SIGUIENTES TRES MATRICES QUE FUNCIONARÁN DE FORMA PARALELA
	
	//MATRIZ TIENE LOS DATOS DEL JUEGO
	
	//TABLERO ES LA QUE SE MUESTRA POR PANTALLA
	
	//ACTIVAR ACTIVA LA POSICIÓN INTRODUCIDA POR EL USUARIO PARA BLOQUEAR ESA CASILLA Y QUE LOS CONTADORES NO APLIQUEN CAMBIOS EN CASO DE REPETIR LA COORDENADA
	
	static String matriz [][] = rellenar();
	static String tablero [][] = rellenaTablero();	
	static boolean activar [][] = rellenaActivado();
	
	//SI AL FINALIZAR EL PROGRAMA PERDER ES = TRUE ENTONCES SE HA PERDIDO LA PARTIDA, DE LO CONTRARIO SE HA GANADO
	
	static boolean perder = false;
	
	//SI ESTA VARIABLE ES TRUE FINALIZARÁ EL PROGRAMA
	
	static boolean finalizar = false;
	
	//CÓDIGO DE COLOR ROJO
	
	public static final String ANSI_RED = "\u001B[31m";
	
	//CÓDIGO DE COLOR NEGRO
	
	public static final String ANSI_BLACK = "\u001B[30m";
	
	//CÓDIGO DE RESETEO DE COLOR
	
	public static final String ANSI_RESET = "\u001B[0m";
	
	//PCÓDIGO ARA PONERLO EN NEGRITA (EL TEXTO EN ROJO SE LEE MEJOR EN NEGRITA)
	
	public static final String ANSI_BOLD = "\u001B[1m";
	
	//CÓDIGO DE COLOR DE FONDO ROJO
	
	public static final String ANSI_BACKGROUNDRED = "\u001B[41m";
	
//-----------------------------------------------------------------------------------------\\
	
	//CÓDIGO PARA VER LA MATRIZ DE DATOS "HACIENDO TRAMPAS"
	
	//FRASE A INTRODUCIR EN LA PETICIÓN DE ACCIONES
	
	static String trampa = "Soy un tramposo";
	
	//LA MATRIZ DE DATOS SE MOSTRARÁ EN COLOR AMARILLO AL SOLICITAR LAS TRAMPAS
	
	//CÓDIGO DE COLOR AMARILLO (LO HE DECIDIDO ASÍ PARA QUE SE DIFERENCIE MEJOR DEL CÓDIGO QUÉ DEBERÍA VER EL USUARIO Y EL QUE VERÍA QUIÉN USE ESTE COMANDO OCULTO)
	
	public static final String ANSI_YELLOW = "\u001B[33m";
	
//-----------------------------------------------------------------------------------------\\	
	
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
	
	//DE NO HACERLO ASÍ IMPRIMIRÍA LA MATRÍZ DE DATOS EN VEZ DE EL TABLERO DE JUEGO
	
	public static void imprimeMatriz(String [][] matriz) {

		for (int n = 0; n < matriz.length; n++) {

			for (int m = 0; m < matriz[n].length; m++) { 
				
//-----------------------------------------------------------------------------------------\\
				
				//SI SE ACTIVAN LAS TRAMPAS SE IMPRIMIRÁ LA MATRIZ DE DATOS EN AMARILLO
				
				if (accion.equals(trampa)) {
				
					System.out.print(ANSI_YELLOW + matriz[n][m] + ANSI_RESET + " ");
				
				}
				
//-----------------------------------------------------------------------------------------\\
			
				//SI LAS TRAMPAS NO SE HAN ACTIVADO SE SEGUIRÁ EL PROCEDIMIENTO HABITUAL
				
				else {
				
					//SI EN LAS COORDENADAS [FILA][COLUMNA] HAY BOMBA, ESTA SE IMPRIMIRÁ EN COLOR NEGRO, FONDO ROJO Y EN NEGRITA
					
					if ((n == fila && m == columna) && (accion.equals("-")) && ((matriz[fila][columna]).equals("*"))) {
			
						System.out.print(ANSI_BLACK + ANSI_BACKGROUNDRED + ANSI_BOLD +  matriz[n][m] + ANSI_RESET + " ");
			
					}
			
					//IMPRIMIRÁ LOS VALORES DE LAS MATRICES POR DEFECTO, SIN COLORES Y EL RESTO DE DATOS QUE EL IF ANTERIOR NO PUEDE IMPRIMIR
					
					else {
				
						System.out.print(matriz[n][m] + " ");
				
					} 
			
				}
				
			}

		System.out.println();

		}

		}
	
	//MÉTODO PARA BUSCAR LAS BOMBAS
	
	public static void buscaBombas() {
		
		//ESTE CONTADOR AUXILIAR VA A CONTAR EL NÚMERO TOTAL DE BOMBAS
		
		int contAux = 0;
		
		//ESTE FOR ES PARA PODER DETENER EL BUCLE PRINCIPAL DEL PROGRAMA
		
		//CUENTA EL NÚMERO TOTAL DE BOMBAS
			
		for (int k = 0; k < matriz.length; k++) {
			
			for (int l = 0; l < matriz[k].length; l++) {
				
				if ((matriz[k][l]).equals("*")) {
					
					contAux++;
					
				}	
			
			}
		}
			
		//ESTE CONTADOR AUXIALIAR 2 QUE DISMINUIRÁ CADA VEZ QUE SE ACIERTE UNA POSICIÓN VACÍA
		
		//PARA FINALIZAR EL PROGRAMA EL CONTADOR DEBERÁ TEENR EL VALOR 0
		
		//SE IMPLEMENTARÁ UNA CONDICIÓN PARA QUE NO PUEDA DISMINUIR SI ESA CASILLA YA HA SIDO MARCADA PREVIAMENTE
				
		int contAux2 = (filas * columnas) - contAux;
		
		//ESTE CONTADOR VA A CONTAR LA CANTIDAD DE BOMBAS MARCADAS CORRECTAMENTE		
		
		int contBomb = 0;
		
		//ESTE WHILE ES EL BUCLE PRINCIPAL DEL PROGRAMA
		
		//HASTA QUE FINALIZAR NO SEA IGUAL A TRUE NO TERMINARÁ
		
		while (finalizar == false) {
				
			//DESPUES DE CADA PASADA FILA Y COLUMNA VALDRÁN -1 POR CONVENIENCIA
			
				fila = -1;
				columna = -1;
			
				//INICIALIZAMOS UN CONTADOR A 0 QUE SERÁ QUIÉN NOS DIGA CUANTAS BOMBAS HAY
				
				int cont = 0;
				
				//LE PREGUNTAREMOS SI QUIERE MARCAR BOMBA O ABRIR CASILLA
				
				//SI NO ES IGUAL SE REPETIRÁ EL PROCESO
				
				boolean noEquals = true;
				
				//WHILE PARA ASEGURARNOS QUE ESCRIBE LO QUE SE PIDE
				
				while (noEquals == true) {
				
					System.out.print("\nSi quieres marcar la posición de una bomba escribe '+', si quieres adivinar escribe '-' \n");
				
					accion = entrada.nextLine();
					
						if (accion.isEmpty()) {
							
							accion = entrada.nextLine();
							
						}
				
						if (accion.equals("+") || accion.equals("-")) {
						
				//SI NO INTRODUCIMOS UNA OPCIÓN DE LAS QUE SE PIDE NO SE SALE DEL BUCLE
							
							noEquals = false;
						
						}
						
//-----------------------------------------------------------------------------------------\\
						
						//ESTA CONDICIÓN PERMITIRÁ HACER TRAMPAS Y MIRAR EL TABLERO
						
						//ES UNA FUNCIÓN DE DESARROLLO PERO LA VOY A DEJAR ACTIVA
						
						//EN NINGUN LUGARA SE LE DARÁ A CONOCER AL USUARIO ESTA FUNCIÓN
						
						//HAY QUE ESCRIBIR EXACTAMENTE Soy un tramposo O EL SISTEMA NO LO RECONOCERÁ
						
						//NO SALDRÁ DEL WHILE PORQUE SI SALE VOLVERÍA A ENTRAR, ASÍ ES MÁS EFICIENTE
						
						else if (accion.equals(trampa)) {
							
							System.out.println();
							
							imprimeMatriz(matriz);
							
						}
						
//-----------------------------------------------------------------------------------------\\
						else {
							
							//SI INTRODUCIMOS UNA ACCIÓN NO VÁLIDA NOS LO DIRÁ EN ROJO Y NEGRITA
							
							System.out.println(ANSI_RED + ANSI_BOLD + "Introduce una acción válida" + ANSI_RESET);
						
						}
						
				}
				
				
				//SE PEDIRÁN LAS COORDENADAS DE FILA Y COLUMNA INDEPENDIENTEMENTE DE LA ACCIÓN ESCOGIDA
				
				//TANTO LAS FILAS COMO LAS COORDENADAS SE PEDIRÁN DE UNA FORMA MÁS INTUITIVA AL USUARIO, SIENDO CIFRAS ENTRE EL 1 Y EL 5
				
				//ADEMÁS, SI SE INTRODUCE CUALQUIER VALOR QUE NO SEA UN NÚMERO DEL 1 AL 5 NO DARÁ ERROR PERO NO SE SALDRÁ DEL WHILE Y VOLVEÁ A PEDIR LOS DATOS
				
				//VAMOS A CREAR LAS VARIABLES DE FILAAUX Y COLUMNAAUX DE TIPO CHAR PARA QUE EL PROGRAMA NO SE DETENGA NUNCA AL INTRODUCIR VALORES ERRONEOS
				
				//EL USUARIO DARÁ VALORES A LAS DOS VARIABLES AUXILIARES, DESPÚES FILA Y COLUMNA SE RELLENARÁN EN BASE A ESTOS AUXILIARES
				
				//HE UTILIZADO EL CÓDIGO ASCI PARA QUE EL RESULTADO NÚMERICO CORRESPONDA CON EL ARRAY DONDE SE GUARDAN LOS VALORES
				
				//CUANDO EL USUARIO INTRODUZCA LOS DATOS DEL 1 AL 5 SE LES RESTARÁ EL VALOR CORRESPONDIENTE (49)
				
				//SI EL SÍMBOLO INTRODUCIDO ES MENOR A 49 O MAYOR DE 49 + EL NÚMERO DE FILA / COLUMNAS ENTONCES FILA TOMARÁ EL VALOR DE -1 PARA REPETIR LA PETICIÓN DE DATOS
				
				//EN EL CÓDIGO ASCII LOS VALORES ENTRE EL 1 Y 5 ESTÁN DEFINIDOS CON LAS CIFRAS ENTRE EL 49 Y EL 53, POR ESO SE LE RESTA 49
				
				//SI DESPUÉS DE LA TOMA DE VALORES FILA O COLUMNA VALEN -1 DIRÁ QUE LA COORDENADA NO ES VÁLIDA
				
					while ((fila < 0 || fila > 5) || (columna < 0 || columna > 5) ) {
						
						System.out.println("\nIntroduce las coordenadas\n");
					
						System.out.println("Fila\n");
					
						char filaAux = entrada.next().charAt(0);
					
							if (filaAux > 48 && filaAux < (49 + filas)) {
								
								fila = (filaAux - 49);
								
							}
							
							else if ((filaAux > 0 && filaAux < 49) || (filaAux > (48 + filas))) {
								
								fila = -1;
								
							}
						
						System.out.println("Columna\n");
					
						char columnaAux = entrada.next().charAt(0);
					

							if (columnaAux > 48 && columnaAux < (49 + columnas)) {
							
								columna = (columnaAux - 49);
							
							}
						
							else if ((columnaAux > 0 && columnaAux < 49) || (columnaAux > (48 + columnas))) {
							
								columna = -1;
							
							}
							
							
						if (fila == -1 || columna == -1) {
						
						//SI INTRODUCIMOS UNA COORDENADA NO VÁLIDA NOS LO DIRÁ EN ROJO Y NEGRITA
							
						System.out.println(ANSI_RED + ANSI_BOLD + "Introduce una coordenada válida" + ANSI_RESET);
						
						}
						
					}
					
					//SI ACCION ES + PONDRÁ UN + EN LA CASILLA, SI ES - DESCUBRIRÁ TABLERO
					
					if (accion.equals("+")) {
					
						tablero [fila][columna] = "+";
					
						//SI LA COORDENADA CORRESPONDE A UNA BOMBA EN LA MATRIZ Y NO HA SIDO PREVIAMENTE DESCUBIERTA SUMARÁ UN CONTADOR
					
						if (((matriz [fila][columna]).equals("*")) && (activar [fila][columna] == false)) {
						
							//AQUÍ SE LLEVA LA CUENTA DE LAS BOMBAS MARCADAS CORRECTAMENTE
						
							contBomb ++;
							
							//SI ESA POSICIÓN ESTÁ DESACTIVADA SE ACTIVARÁ PARA QUE NO PUEDA VOLVER A SUBIR EL CONTADOR EN CASO DE REPETIR LA COORDENADA
							
							if (activar [fila][columna] == false) {
							
								activar [fila][columna] = true;
								
							}	
							
						}
					
						imprimeMatriz(tablero);
					
					}
				
				else if (accion.equals("-")) {
				
					if (matriz[fila][columna].equals("*")) {
										
						perder = true;
					
						//PARA SALIR DEL WHILE LE DECIMOS QUE FINALIZAR ES = TRUE
					
						finalizar = true;
				
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
						
						if (((matriz [fila][columna]).equals("-")) && (activar [fila][columna] == false)) {
							
							//A MEDEDIA QUE SE VAYAN DESCUBRIENDO HUECOS ESTE CONTADOR DISMINUIRÁ HASTA LLEGAR A 0
						
							contAux2--;
							
							//SI ESA POSICIÓN ESTÁ DESACTIVADA SE ACTIVARÁ PARA QUE NO PUEDA VOLVER A BAJAR EL CONTADOR EN CASO DE REPETIR LA COORDENADA
							
							if (activar [fila][columna] == false) {
							
								activar [fila][columna] = true;
							
							}
							
						}
						
						imprimeMatriz(tablero);
						
					}	
				}
			
				//HASTA QUE NO SE DESCUBRAN CORRECTAMENTE TODAS LAS CASILLAS, EL RPOGRAMA NO FINALIZARÁ
						
			if ((contAux2 == 0) && (contBomb == contAux)) {
				
				finalizar = true;
				
			}
		}
			
		//SI HAS DESCUBIERTO UNA BOMBA SE IMPRIME QUE HAS PERDIDO Y SE IMPRIMIRÁ LA MATRIZ OCULTA CON TODAS LAS POSICIONES DESCUBIERTAS
		
			if (perder == true) {
				
				System.out.println("\nOh no, has perdido. Has encontrado una bomba.\n");
				
				imprimeMatriz(matriz);
				
			}
			
		//SI SE HAN DESCUBIERTO TODAS LAS POSICIONES Y SON CORRECTAS APARECERÁ EL MENSAJE DE FELICITACIÓN POR SUPERAR EL NIVEL	
			
			else if (perder == false) {
			
				System.out.println("\n¡FELICIDADES, HAS COMPLETADO EL NIVEL!");
				
			}
			
	}

	//EL MAIN
	
	public static void main(String[] args) {

		System.out.println("EN ESTE BUSCAMINAS LAS COORDENADAS SON NUMÉRICAS TANTO EN LAS FILAS CÓMO EN LAS COLUMNAS\nTANTO LAS FILAS CÓMO LAS COLUMNAS TIENEN VALORES ENTRE EL 1 Y EL 5\nLAS X SON LAS POSICIONES QUE AÚN NO HAS DESCUBIERTO\nLOS * SON LAS BOMBAS\nLOS - SON POSICIONES VACÍAS\nLOS NÚMEROS APARECERÁN EN LAS POSICIONES VACÍAS Y TE INDICARÁN CUÁNTAS BOMBAS ADYACENTES HAY, SI ES QUE LAS HAY\n\nBUENO, ESTE ES TU TABLERO ¡BUENA SUERTE!\n");
		
		//INVOCAMOS LOS MÉTODOS PARA IMPRIMIR LA MATRÍZ Y EL BUSCADOR DE BOMBAS QUE SERÁ DONDE DECIDIREMOS SI DESCUBRIR LA CASILLA O MARCAR UNA BOMBA
				
		imprimeMatriz(tablero);
		
		buscaBombas();
	
	}
}
