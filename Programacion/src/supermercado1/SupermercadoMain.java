package supermercado1;

import java.util.*;

public class SupermercadoMain {

	static Scanner entrada = new Scanner(System.in);

	static List<String> productos = Arrays.asList("tomate", "aceite", "pan", "leche", "yogur", "queso", "jamón",
			"harina", "champú", "manzana");

	public static final String ANSI_RED = "\u001B[31m";

	public static final String ANSI_YELLOW = "\u001B[33m";

	public static final String ANSI_RESET = "\u001B[0m";

	public static void acceso() {

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

	public static void menu() {

		int accion;

		System.out.printf("%-20s \n\n%-20s \n-20%s \n-20%s \n-20%s \n-20%s \n-20%s \n", "******** MENÚ ********",
				"1. Mostrar productos supermercado", "2. Añadir productos al cariito",
				"3. Mostrar carrito de la compra ordenado", "4. Consultar producto de carrito",
				"5. Cambiar un producto por otro", "6. Salir");

		accion = entrada.nextInt();

		if (accion >= 1 && accion <= 5) {

			acciones(accion);

		}

		if (accion != 6) {

			menu();

		}

		if (accion == 6) {

			finalizar();

		}

	}

	public static void acciones(int accion) {

		List<String> carrito = new LinkedList<String>();

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

			cambiarProducto(carrito);

			break;

		}

	}

	public static void mostrarProductos(List<String> productos) {

		Collections.sort(productos);

		System.out.println("\n" + productos + "\n");

	}

	public static List<String> anyadir(List<String> carrito) {

		boolean introducir = true;

		while (introducir == true) {

			String SiNo = "";

			System.out.println("Introduzca el producto que desea introducir al carrito\n");

			String producto = entrada.nextLine();

			if (producto.isEmpty()) {
				entrada.nextLine();
			}

			carrito.add(producto);

			// System.out.println(carrito);

			for (int n = 0; n < carrito.size() - 1; n++) {

				if (carrito.get(n).equals(producto)) {

					System.out.println(ANSI_YELLOW
							+ "\nEste producto ya está en la lista, por favor elija otro producto\n" + ANSI_RESET);

					carrito.remove(producto);

					SiNo = "si";

				}

			}

			/*
			 * if (!productos.contains(producto)) {
			 * 
			 * System.out.println(ANSI_YELLOW +
			 * "Este producto no está disponible, por favor elija otro producto" +
			 * ANSI_RESET);
			 * 
			 * carrito.remove(producto);
			 * 
			 * SiNo = "si";
			 * 
			 * }
			 */

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

	public static void mostrarCarrito(List<String> carrito) {

		Collections.sort(carrito);

		System.out.println(carrito);

	}

	public static void consultarProducto(List<String> carrito) {

		System.out.println("Introduzca el producto que desea buscar");

		String producto = entrada.nextLine();

		if (producto.isEmpty()) {
			entrada.nextLine();
		}

		System.out.println("\n" + carrito.contains(producto) + "\n");

		// ESTÁ MAL, NECESITA DESCRIPCIÓN DE CADA PRODUCTO

	}

	public static void cambiarProducto(List<String> carrito) {

		System.out.println("¿Qué producto desea remover?");

		String quitarProducto = entrada.nextLine();

		if (quitarProducto.isEmpty()) {
			entrada.nextLine();
		}

		System.out.println("¿Qué producto desea añadir?");

		String añadirProducto = entrada.nextLine();

		if (añadirProducto.isEmpty()) {
			entrada.nextLine();
		}

		for (int n = 0; n < carrito.size(); n++) {

			if (carrito.get(n).equals(quitarProducto)) {

				carrito.get(n).replaceAll(quitarProducto, añadirProducto);

			}

		}
	}

	public static void menuPersonal() {

		int accionesPersonal;

		System.out.println(
				"******** MENÚ ******** \n\n1. Mostrar productos sel supermercado \n2. Añadir productos \n3. Eliminar productos \n4.Modificar producto \n5. Salir\n");

		accionesPersonal = entrada.nextInt();

		if (accionesPersonal >= 1 && accionesPersonal <= 4) {

			accionesPersonal(accionesPersonal);
		

		}


		if (accionesPersonal == 5) {

			finalizar();

		}

	}

	public static void autentificacion() {

		final String contraseña = "J4v4d0n";

		int cont;

		for (cont = 0; cont < 3; cont++) {

			System.out.println("Introduzca clave");

			String codigo = entrada.nextLine();

			if (codigo.isEmpty()) {
				entrada.nextLine();
			}

			if (codigo.equals(contraseña)) {

				menuPersonal();

			}

			
			else {

				System.out.println(ANSI_RED + "Contraseña incorrecta" + ANSI_RESET);

			}

		}

		if (cont == 3) {

			finalizar();

		}
	}

	public static void accionesPersonal(int accion) {

		switch (accion) {

		case 1:

			mostrarProductos(productos);

			break;

		case 2:

			anyadirProductos();

			break;

		case 3:

			eliminarProductos();

			break;

		case 4:

			// cambiarProducto();

			break;

		}

	}

	public static void anyadirProductos() {

		boolean terminar = false;

		while (terminar != false) {

			String SiNo = "";

			while (!SiNo.equals("si") && !SiNo.equals("no")) {

				System.out.println("¿Qué producto desea añadir?");

				productos.add(entrada.nextLine().toLowerCase());

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

	}

	public static void eliminarProductos() {

		boolean terminar = false;

		while (terminar != false) {

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
	}

	public static void finalizar() {

		// System.meloinvento("FINALIZAR RPOGRAMA");

	}

	public static void main(String[] args) {

		System.out.println("Bienvenido al supermercado\n");

		acceso();

	}

}
