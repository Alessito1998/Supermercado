package arraysmultidimensionales;

public class dosportres {

	public static void imprimeMatriz(int [][]matriz) {

		for (int i = 0; i < matriz.length; i++) { //recorre filas

		for (int j = 0; j < matriz[i].length; j++) { //columnas

		System.out.print(matriz[i][j] + " ");

		}

		System.out.println();

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int matriz [][] = new int [3][4];
		int nums = 0;
		
		int m = 0;
		int k = 0;
		int fila = -1;
		
		for (int n = 0; n < matriz.length; n++) {
			
			fila++;
			
			for (m = 0; m < matriz[n].length; m++) {
				
				if (n == 0 ) {
				
				nums = (int)(Math.random() * 10);
				
				matriz [n][m] = nums;}
				
				else if (n > 0) {
					
					int cuadrado = (int)(Math.pow(nums, 2));
					
					nums = cuadrado;
					
					matriz [fila][m] = nums;
					
				}
				
			}
			
			
		}
		
		
		imprimeMatriz(matriz);
	}
	
	
}