package extra;

public class ColoresPrueba {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static final String ANSI_BOLD = "\u001B[1m";
	
	public static final String ANSI_ALEX = "\u001B[41m";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ANSI_GREEN + "This text has a green background but default text!" + ANSI_RESET);
		System.out.println(ANSI_BLACK + ANSI_ALEX + ANSI_BOLD + "This text has red text but a default background!" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "This text has a green background and red text!" + ANSI_RESET);
		
	}

}
