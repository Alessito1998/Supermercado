package funciones;

public class MuchosArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	public static int [] rrellenaArray() {
		
		int array [] = new int [10];
		
			for (int n = 0; n < array.length; n++) {
				
				int aleatorio = (int)(Math.random() * 1000);
		
				while (esPrimo(aleatorio) == false) {
					
					aleatorio = (int)(Math.random() * 1000);
					
				}
				
				array [n] = aleatorio;
				
			}
			
			return array;
		
	}
	
	public static boolean esPrimo(int m) {
		
		for (int i = 2; i < m; i++) {
			
			if (m % i == 0)
				
				return false;
		
		}
		
		return true;
		
	}
	
	public static int sumaArray(int array []) {
		
		int suma = 0;
		
		for (int n = 0; n < array.length; n++) {
			
			suma = ((array [n]) + (array [n]) / 2);
			
		}
		
		return suma;
		
	}
}
