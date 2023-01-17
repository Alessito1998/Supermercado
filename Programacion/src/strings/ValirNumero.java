package strings;

import java.util.*;

public class ValirNumero {

	static Scanner entrada = new Scanner(System.in);
	
	public static boolean validarNumero (String num) {
		
		return num.matches("^([-]?)[0-9]{3}$");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escribe tu número");
		
		String num = entrada.nextLine();
		
		System.out.println(validarNumero(num));
		
	}

}
