package arraysmultidimensionales;

public class ContarColumnas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] columnas = {
				
				{10, 9, 8},
				{3, 4},
				{1},
				{5, 4, 3, 7}
				};
		
		for (int n = 0; n < columnas.length; n++)
		
		System.out.println("La fila " + (n + 1) + " tiene " + columnas[n].length + " columnas.");
		
	}

}
