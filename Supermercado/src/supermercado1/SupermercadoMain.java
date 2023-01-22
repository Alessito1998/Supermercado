package supermercado1;

import java.util.*;

public class SupermercadoMain {

	static Scanner entrada = new Scanner(System.in);

	static List<String> carrito;

	static List<String> productos;

	static List<String> datos;

	public static final String ANSI_RED = "\u001B[31m";

	public static final String ANSI_YELLOW = "\u001B[33m";

	public static final String ANSI_RESET = "\u001B[0m";

	// PROCEDIMIENTO DE ACCESO

	public static void acceso() {

		// SE MUESTRA UN MENÚ DONDE SE ELIJE UNA OPCIÓN INTRODUCIENDO 1 O 2

		// DEPENDIENDO CUAL SE ESCOJA INICIAS CÓMO EMPLEADO O COMO CLIENTE

		// SI ESCOJES UNA OPCIÓN INVÁLIDA TE LO DIRÁ Y TE VOLVERÁ A PEDIR QUE ELIJAS LA OPCIÓN

		int accion = 0;

		System.out.println("******** ACCESO ******** \n\n1. Personal del supermercado \n2. Cliente");

		while (accion < 1 || accion > 2) {

			accion = entrada.nextInt();

			switch (accion) {

			case 1:

				autentificacion();

				break;

			case 2:

				menu();

				break;

			case 3:

				System.out.println(ANSI_YELLOW + "Introduzca una acción vñalida" + ANSI_RESET);

			}

		}

	}

	// --------------------------------------- CLIENTES ---------------------------------------\\

	// MENÚ DE CLIENTES

	public static void menu() {

		// APARECERÁ EL MENÚ DISPONIBLE PARA LOS CLIENTES CON SUS OPCIONES

		// EL PROGRAMA TE OBLIGARÁ A ELEGIR UNA ACCIÓN ENTRE EL 1 Y EL 6

		// LA OPCIÓNM 6 CERRARÁ EL PROGRAMA

		int accion;

		System.out.println("******** MENÚ ********\n" + "1. Mostrar productos supermercado\n"
				+ "2. Añadir productos al cariito\n" + "3. Mostrar carrito de la compra ordenado\n"
				+ "4. Consultar producto de carrito\n" + "5. Cambiar un producto por otro\n" + "6. Salir");

		accion = entrada.nextInt();

		if (accion >= 1 && accion <= 6) {

			acciones(accion, carrito);

		}

		else {

			menu();

		}

	}

	// DEPENDIENDO DE LA OPCIÓN ESCUGIDA ENTRE 1 Y 5 SE LLAMARÁ A SU RESPECTIVO MÉTODO

	public static void acciones(int accion, List<String> carrito) {

		switch (accion) {

		case 1:

			mostrarProductos(productos);

			break;

		case 2:

			carrito = anyadir(carrito);

			break;

		case 3:

			mostrarCarrito(carrito);

			break;

		case 4:

			consultarProducto(carrito);

			break;

		case 5:

			carrito = cambiarProducto(carrito);

			break;

		case 6:

			finalizar();

			break;

		}

		menu();

	}

	// MÉTODO QUE MUESTRA LA LISTA DE PRODCUTOS DISPONIBLES EN EL SUPERMERCADO

	public static void mostrarProductos(List<String> productos) {

		Collections.sort(productos);

		System.out.println("\n" + productos + "\n");

	}

	// FUNCIÓN QUE PERMITE LLENAR EL CARRITO DE LA COMPRA CON LOS PRODUCTOS DISPONIBLES

	// SI LOS PRODUCTOS YA ESTÁN EN EL CARRITO TE LO ADVERTIRÁ Y NO LLENARÁ EL CARRITO, LO MISMO SI EL PRODUCTO NO ESTÁ EN STOCK

	public static List<String> anyadir(List<String> carrito) {

		boolean introducir = true;

		// APROBECHO EL BUG

		entrada.nextLine();

		while (introducir == true) {

			String SiNo = "";

			System.out.println("Introduzca el producto que desea introducir al carrito\n");

			String producto = entrada.nextLine().toLowerCase();

			if (!productos.contains(producto)) {

				System.out.println(
						ANSI_YELLOW + "Este producto no está disponible, por favor elija otro producto" + ANSI_RESET);

				SiNo = "si";

			}

			else {

				if (carrito.contains(producto)) {

					System.out.println(ANSI_YELLOW
							+ "\nEste producto ya está en la lista, por favor elija otro producto\n" + ANSI_RESET);

					carrito.remove(producto);

					SiNo = "si";

				}

				else {

					carrito.add(producto);

				}
			}

			while (!SiNo.equals("si") && !SiNo.equals("no")) {

				System.out.println("¿Quiere introducir más productos?\n");

				SiNo = entrada.nextLine().toLowerCase();

				if (SiNo.equals("si")) {

					introducir = true;

				}

				else if (SiNo.equals("no")) {

					introducir = false;

				}

				else {

					System.out.println(ANSI_YELLOW + "Introduzca una respuesta válida" + ANSI_RESET);

				}
			}
		}

		return carrito;

	}

	// PROCEDIMIENTO QUE MUESTRA LOS PRODUCTOS QUE PREVIAMENTE SE HAN ESCOGIDO

	public static void mostrarCarrito(List<String> carrito) {

		Collections.sort(carrito);

		System.out.println(carrito);

	}

	// PROCEDIMIENTO QUE MUESTRA UNA DESCRIPCIÓN DEL PRODUCTO DESEADO SIEMPRE Y CUANDO ESTÉ EN STOCK

	public static void consultarProducto(List<String> carrito) {

		boolean introducir = true;

		// APROBECHO EL BUG

		entrada.nextLine().toLowerCase();

		while (introducir == true) {

			String SiNo = "";

			System.out.println("Introduzca el producto que desea consultar");

			String producto = entrada.nextLine().toLowerCase();

			if (!productos.contains(producto)) {

				System.out.println(
						ANSI_YELLOW + "Este producto no está disponible, por favor elija otro producto" + ANSI_RESET);

			}

			else {

				for (int n = 0; n < productos.size(); n++) {

					if (productos.get(n).equals(producto)) {

						System.out.println(datos.get(n));

					}

				}

				while (!SiNo.equals("si") && !SiNo.equals("no")) {

					System.out.println("¿Quiere consultar más productos?\n");

					SiNo = entrada.nextLine().toLowerCase();

					if (SiNo.equals("si")) {

						introducir = true;

					}

					else if (SiNo.equals("no")) {

						introducir = false;

					}

					else {

						System.out.println(ANSI_YELLOW + "Introduzca una respuesta válida" + ANSI_RESET);

					}
				}

			}

		}

	}

	// FUNCIÓN QUE PERMITE MODIFICAR EL CARRO DE LA COMPRA

	// SI EL CARRITO DE LA COMPRA ESTÁ VACÍO NO TE PERMITIRÁ HACER NADA Y MOSTRARÁ EL MENÚ

	// NO ME FUNCIONA NO SÉ POR QUÉ

	public static List<String> cambiarProducto(List<String> carrito) {

		boolean introducir = true;

		// APROBECHO EL BUG

		entrada.nextLine().toLowerCase();

		if (carrito.isEmpty()) {

			System.out.println(ANSI_YELLOW
					+ "\nLo sentimos, su carrito está vacío, agrege productos antes de utilizar esta función\n"
					+ ANSI_RESET);

			menu();
			
		}

		else if (!carrito.isEmpty()) {

			while (introducir == true) {

				String SiNo = "";

				System.out.println("¿Qué producto desea remover?");

				String quitarProducto = entrada.nextLine().toLowerCase();

				System.out.println("¿Qué producto desea añadir?");

				String añadirProducto = entrada.nextLine().toLowerCase();

				for (int n = 0; n < carrito.size(); n++) {

					if (carrito.get(n).equals(quitarProducto)) {

						carrito.get(n).replaceAll(quitarProducto, añadirProducto);

					}

					while (!SiNo.equals("si") && !SiNo.equals("no")) {

						System.out.println("¿Quiere cambiar más productos?\n");

						SiNo = entrada.nextLine().toLowerCase();

						if (SiNo.equals("si")) {

							introducir = true;
						}

						else if (SiNo.equals("no")) {

							introducir = false;

						}

						else {

							System.out.println(ANSI_YELLOW + "Introduzca una respuesta válida" + ANSI_RESET);

						}
					}

				}
			}
		}

		return carrito;
	}

	// --------------------------------------- EMPLEADOS ---------------------------------------\\

	// EL MENÚ DE LOS EMPLEADOS, PUEDES ESCOGER HACER COSAS

	// EL PROGRAMÁ TE OBLIGARÁ A ELEGIR UN NÚMERO DEL 1 AL 5

	public static void menuPersonal() {

		int accionesPersonal;

		System.out.println(
				"******** MENÚ ******** \n\n1. Mostrar productos sel supermercado \n2. Añadir productos \n3. Eliminar productos \n4. Modificar producto \n5. Salir\n");

		accionesPersonal = entrada.nextInt();

		if (accionesPersonal >= 1 && accionesPersonal <= 5) {

			accionesPersonal(accionesPersonal);

		}

		if (accionesPersonal != 5) {

			menuPersonal();

		}

	}

	// EL PROCESO DE AUTENTIFICACIÓN

	// ES OBLIGATORIO EN CASO DE SELECCIONAR LA OPCIÓN DE PERSONAL DEL SUPERMERCADO Y HAY 3 INTENTOS, EN CASO DE FALLAR EL PROGRAMA SE DETENDRÁ

	public static void autentificacion() {

		final String contraseña = "J4v4d0na";

		String codigo = "";

		// APROBECHO EL BUG

		entrada.nextLine();

		for (int cont = 0; cont < 3; cont++) {

			System.out.println("Introduzca clave");

			codigo = entrada.nextLine();

			if (codigo.equals(contraseña)) {

				cont = 3;

			}

			else if (!codigo.equals(contraseña) && cont < 3) {

				System.out.println(ANSI_RED + "Contraseña incorrecta" + ANSI_RESET);

			}

		}

		if (!codigo.equals(contraseña)) {

			System.out.println(ANSI_YELLOW + "\nFallo de autentificación, cerrando sistema ..." + ANSI_RESET);

			finalizar();

		}

		else if (codigo.equals(contraseña)) {

			menuPersonal();

		}

	}

	// LAS ACCIONES DISPONIBLES DEL MENÚ DE PERSONAL

	// DEPENDIENDO DE LA OPCIÓN SE LLAMARÁ A SU PROCEDIMIENTO CORRESPONDIENTE
	
	public static void accionesPersonal(int accion) {

		switch (accion) {

		case 1:

			mostrarProductos(productos);

			break;

		case 2:

			productos = anyadirProductos();

			break;

		case 3:

			productos = eliminarProductos();

			break;

		case 4:

			modificar();

			break;

		case 5:
			
			finalizar();
			
			break;
			
		}

		menuPersonal();
		
	}

	// FUNCIÓN PARA AÑADIR PRODUCTOS A LA LISTA DE PRODUCTOS DISPONIBLES

	// SE AÑADEN A UN HASHSET Y SE AÑADEN LOS NUEVOS TAMBIÉN EN EL HASHSET PARA EVITAR QUE SE REPITAN PRODUCTOS

	// AL INTRODUCIR UN PRODUCTO SE PEDIRÁ QUE SE AÑADA UNA DESCRIPCIÓN DEL PRODUCTO

	// PARA LA DESCRIPCIÓN SE UTILIZARÁ UN STRINGBUILDER PARA AÑADIR LA DESCRIPCIÓN DETRÁS DEL PRODUCTO INTRODUCIDO

	// ADEMÁS SE VUELTE A INICIALIZAR EL ARRAY DATOS PARA PODER MODIFICAR SU TAMAÑO CON CADA PASADA DEL BUCLE

	// 	SALTA UN ERROR

	public static List<String> anyadirProductos() {

		HashSet<String> añadir = new HashSet<String>();

		añadir.addAll(productos);

		String descripcion;

		boolean terminar = false;

		// APROBECHO EL BUG

		entrada.nextLine();

		while (terminar == false) {

			String SiNo = "";

			while (!SiNo.equals("si") && !SiNo.equals("no")) {

				System.out.println("¿Qué producto desea añadir?");

				String añadido = entrada.nextLine().toLowerCase();

				añadir.add(añadido);

				System.out.println("Añade una descripción del producto " + añadido);

				descripcion = entrada.nextLine();

				StringBuilder descrito = new StringBuilder(": " + añadido);

				descrito.append(descripcion);

				descripcion = descrito.toString();

				datos.add(descripcion);

				System.out.println("¿Desea añadir más productos?");

				SiNo = entrada.nextLine().toLowerCase();

				if (SiNo.equals("si")) {

					terminar = false;

				}

				if (SiNo.equals("no")) {

					terminar = true;

				}

				else {

					System.out.println(ANSI_YELLOW + "Introduzca una instrucción válida" + ANSI_RESET);

				}

			}

		}

		productos.addAll(añadir);

		return productos;

	}

	// FUNCIÓN PARA ELIMINAR UN ELEMENTO DE LA LISTA DE PRODUCTOS DEL SUPERMERCADO
	
	//SE CAMBIA EL TAMAÑO DEL ARRAY
	
	//EL ARRAY HACE UN ERROR

	public static List<String> eliminarProductos() {

		boolean terminar = false;

		// APROBECHO EL BUG

		entrada.nextLine();

		while (terminar == false) {

			String SiNo = "";

			while (!SiNo.equals("si") && !SiNo.equals("no")) {

				System.out.println("Qué producto desea eleminar?");

				String producto = entrada.nextLine().toLowerCase();

				if (productos.contains(producto)) {

					productos.remove(producto);

				}

				else {

					System.out.println(ANSI_YELLOW + "Ese producto no existe" + ANSI_RESET);

				}

				System.out.println("¿Desea eleminar más productos?");

				SiNo = entrada.nextLine().toLowerCase();

				if (SiNo.equals("si")) {

					terminar = false;

				}

				if (SiNo.equals("no")) {

					terminar = true;

				}

				else {

					System.out.println(ANSI_YELLOW + "Introduzca una instrucción válida" + ANSI_RESET);

				}
			}
		}

		return productos;
	}

	// ESTE MÉTODO PERMITE MODIFICAR LA DESCRIPCIÓN DE LOS PRODUCTOS

	public static void modificar() {
		
		boolean terminar = false;

		// APROBECHO EL BUG

		entrada.nextLine();

		while (terminar == false) {

			String SiNo = "";

			while (!SiNo.equals("si") && !SiNo.equals("no")) {

				System.out.println("¿Qué producto desea modificar?");

				String producto = entrada.nextLine();

				for (int n = 0; n < productos.size(); n++) {

					if (productos.get(n).equals(producto)) {

						System.out.println("Introduce nuevos datos");

						datos.add(entrada.nextLine());

					}
				}

				System.out.println("¿Desea modificar más productos?");

				SiNo = entrada.nextLine().toLowerCase();

				if (SiNo.equals("si")) {

					terminar = false;

				}

				if (SiNo.equals("no")) {

					terminar = true;

				}

				else {

					System.out.println(ANSI_YELLOW + "Introduzca una instrucción válida" + ANSI_RESET);

				}

			}
		}
	}

	// --------------------------------------- MAIN ---------------------------------------\\

	// EL MAIN

	// LAS VARIABLES SE INICIALIZAN AQUÍ Y SE LLAMA AL MÉTODO DE ACCESO

	public static void main(String[] args) {

		productos = Arrays.asList("tomate", "aceite", "pan", "leche", "yogur", "queso", "jamón", "harina", "champu",
				"manzana");

		carrito = new LinkedList<String>();

		datos = new ArrayList<String>();

		datos.add("tomate: Tomate ecológico de huerta española.");
		datos.add("aceite: Aceite producido en Andalucía.");
		datos.add("pan: Pan elavorado en el día.");
		datos.add("leche: Leche fresca de vaca asturiana.");
		datos.add("yogur: Yogur eleavorado con leche de vaca pasteurizada.");
		datos.add("queso: Queso elavorado con leche de oveja.");
		datos.add("jamón: Jamón ibérico de bellota.");
		datos.add("harina: Harina de trigo.");
		datos.add("champu: Champú fortificante olor melocotón.");
		datos.add("manzana: Manzana de origen nacional.");

		System.out.println("Bienvenido al supermercado\n");

		acceso();

	}
	
	// EL PROGRAMA SE FINALIZARÁ FORSOMANETE CON SYSTEM.EXIT

	public static void finalizar() {
		
		System.out.println(ANSI_YELLOW + "\nCerrando el programa ..." + ANSI_RESET);
			
		System.exit(0);

	}

}
