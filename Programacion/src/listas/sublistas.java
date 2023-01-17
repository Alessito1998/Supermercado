package listas;

import java.util.Arrays;
import java.util.List;

public class sublistas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> diasSemana = Arrays.asList("lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo");
		
		List<String> sublistaSemana = diasSemana.subList(2, 5);
		
		System.out.println("Lista completa: " + diasSemana);
		System.out.println("Sublista: " + sublistaSemana);
		
	}

}
