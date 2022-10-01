package ejercicios;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[]args) {
		Scanner base= new Scanner (System.in);
		System.out.println("ingrese la base del triangulo");
		float baseT=base .nextInt();
		Scanner altura=new Scanner(System.in);
		System.out.println("ingrese la altura del triangulo");
		float alturaT=altura.nextInt();
		float area=baseT*alturaT/2;
		System.out.println("el area del triangulo rectangulo es: "+area);
		
	}
}
