package operadores;

public class OperacionesAricmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		final double num1 = 2;
		final double num2 = 4;
		final double numSuma = num1 + num2;
		final double numDivisión = num2 / num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.printf("La suma de %.0f y %.0f es %.0f \n", num1, num2, numSuma);
		System.out.println(num1 - num2);
		System.out.println(num1 % num2);
	
		System.out.printf("%.2f\n", numDivisión);
		
		int numC1 = (int)(num1);
		int numC2 = (int)(num2);
		int numCS = (int)(numSuma);
		
		System.out.println("La suma de " + numC1 + " y " + numC2 + " es " + numCS);
	}

}
