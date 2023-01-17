package sentenciaif;

import java.util.Scanner;

public class SentenciaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double area = 0;
		
		Scanner entrada = new Scanner(System.in);
				
				System.out.println("Escribe un numero del 1 al 4.\n1 para el área del cuadrado,\n2 para el área del rectángulo,\n3 para el área del triángulo \ny 4 para el área del círculo.");
				
				int numero = entrada.nextInt();
			
			switch (numero) {
			
				case 1 : 
				
					System.out.println("Introduce el valor del lado del cuadrado");
				
					area = entrada.nextDouble();
					
					area =  Math.pow(area, 2);
					
					System.out.printf("El área del cuadrado es %f\n", area);
					
				break ;
				
				case 2 :
				
					System.out.println("Introduce el valor del lado del rectángulo");
					
					double ladorectangulo = entrada.nextDouble();
				
					System.out.println("Introduce el valor de la altura del rectángulo");
					
					double alturarectangulo = entrada.nextDouble();
					
					area = ladorectangulo * alturarectangulo;
					
					System.out.printf("El área del rectángulo es %f\n", area);
				
				break ;
				
				case 3 : 
					
					System.out.println("Introduce el valor de la base del triángulo");
					
					double ladotriangulo = entrada.nextDouble();
					
					System.out.println("Introduce el valor del la altura del triangulo");
					
					double alturatriangulo = entrada.nextDouble();
					
					area = (ladotriangulo * alturatriangulo) / 2;
				
					System.out.printf("El área del triangulo es %f\n", area);
			
				break ;
				
				case 4 : 
					
					System.out.println("Introduce el valor del rádio del círculo");
					
					double radiocirculo = entrada.nextDouble();
					
					area = (Math.PI * Math.pow(radiocirculo, 2));
			
					System.out.printf("El área del circulo es %f\n", area);
				
				break ;
				
				default :
			
					System.out.println("Eres tonto");
				
			
			}
					
				
			entrada.close();
			

	}

}
