package EjercicioCiclos;

import java.util.Scanner;

public class do_while_ejercicio10 {
public static void main(String[] args) {
	int i=0;
	System.out.println("ingrese el numero de la cantidad de veces que quiere ejecutar el algoritmo");
	Scanner cant=new Scanner(System.in);
	int cantidad= cant.nextInt();

	do {
		System.out.println("ingrese el primer numero");
		Scanner n1=new Scanner(System.in);
		double num1=n1.nextInt();
		System.out.println("ingrese el segundo numero");
		Scanner n2=new Scanner(System.in);
		double num2=n1.nextInt();
		System.out.println("ingrese el tercer numero");
		Scanner n3=new Scanner(System.in);
		double num3=n1.nextInt();
		 
		 double resultado= num1+num2+num3;
		 System.out.println("el resultado de la suma de los tres numeros es: "+resultado);
		i++;
	} while (i<cantidad);
	System.out.println("Fin del programa");
}
}
