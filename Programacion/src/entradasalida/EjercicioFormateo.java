package entradasalida;

public class EjercicioFormateo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*Declaro deos variables x = 144, y = 199
		 * hacemos la suma, resta, multiplicación y división.
		 * 
		 * VARIABLES SUMA RESTA DIV MULT
		 * -----------------------------
		 * 144 y 199 343   55  9,72 28656
		 * 
		 */
		
		
		double X = 144;
		double Y = 199;

		
		System.out.printf("    %-27s %-20s %-20s %-21s %s \n", "VARIABLES", "SUMA", "RESTA", "DIV", "MULT");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.printf("%.3f y %-20.3f %-20.3f %-20.3f %-20.3f %-20.3f \n", X, Y, (X + Y), (X - Y), (X / Y), (X * Y));
		
		
	}
	

}
