package ejercicios;

import java.util.Scanner;

public class ejercicio27 {
	public static void main(String[] args) {
		Scanner ingreso=new Scanner(System.in);
		System.out.println("ingrese la primera nota");
		double nota1=ingreso.nextDouble();
		System.out.println("ingrese la segunda nota");
		double nota2=ingreso.nextDouble();
		System.out.println("ingrese la nota del trabajo");
		double noTrabajo=ingreso.nextDouble();
		double notaFinal=(nota1+nota2+noTrabajo)/3;
		
		
		System.out.println("la nota final es: "+notaFinal);
	}
 
}
