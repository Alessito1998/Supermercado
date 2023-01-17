package arrays;

public class Pokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n;
		
		int j = 0;
		
		int h = 0;
		 
		 int mequieromorir;
		 
		 int posiciones [] = new int [150];
		 
		 int par = 0, impar = 0;
		 
		 
		 
		 for (n = 0; n <= posiciones.length -1; n++) {
			 
			mequieromorir = (int)(Math.random() * 100);
			 
			posiciones [n] = mequieromorir;
			
			System.out.print(mequieromorir + " ");
		
		 
			if (mequieromorir % 2 == 0) 
					par++;
			 	 
			else if (mequieromorir % 2 != 0)  
				impar++;
				  
		}
		 
		 
		 int arraypares [] = new int [par];
		 int arrayimpares [] = new int [impar];
		
		 
		 for (int i=0; i < posiciones.length; i++){
			 
			 if (posiciones[i] % 2 == 0) {
				  
		 			arraypares [j] = posiciones[i];
		 			j++;
					 
				 }
			 
			 else  
				 	 
		 			arrayimpares [h] = posiciones[i];
		 			h++;
		 }
		 

		 
	/* System.out.println("\n\nPares:\n"); //YANOMEMUERO ES EL ARRAY DE NÚMEROS PARES
		 
		 	int arraypares [] = new int [par];
		 	int arrayimpares [] = new int [impar];
		 	
		 	 for (n = 0; n <= posiciones.length -1; n++) {
		 		 
		 		 if (mequieromorir % 2 == 0) {
					 
					 
		 			arraypares [j] = mequieromorir [n];
					 
				 }
		 		 
		 		 else (mequieromorir % 2 != 0) {
		 		
					
					int arrayimpares [h] = mequieromorir [n];
					
		 		 }
		 	 }*/
		 		 
		 	
		 

		 		
			
		 		
		
		 
		 	

		 	



		 
	
	}
}
