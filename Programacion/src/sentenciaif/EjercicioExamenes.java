package sentenciaif;

import java.util.Scanner;

public class EjercicioExamenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime la nota de tus últimos 3 examenes");
		
		double nota1 = entrada.nextDouble();
		
		System.out.println("");
		
		double nota2 = entrada.nextDouble();
		
		System.out.println("");
		
		double nota3 = entrada.nextDouble();
		
		double notamedia = (nota1 + nota2 + nota3) / 3;
		

		if (notamedia < 5) {System.out.println("Suspenso");}
		
		else if (notamedia >= 5 && notamedia < 6) {System.out.println("Suficiente");}
		
		else if (notamedia >= 6 && notamedia < 7) {System.out.println("Bien");}
		
		else if (notamedia >= 7 && notamedia < 8) {System.out.println("Notable");}
		
		else if (notamedia >= 8 && notamedia < 9) {System.out.println("Notable");}
		
		else if (notamedia >= 9 && notamedia < 10) {System.out.println("Sobresaliente");}
		
		else {System.out.println("Matrícula");}
		
		entrada.close();
}
}