package ejercicios;

import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		Scanner leer =new Scanner(System.in);
		System.out.println("ingrese un numero");
		int n1= leer.nextInt();
		System.out.println("ingrese otro numero");
		int n2=leer.nextInt();
		int r =n1*n2/2;
		System.out.println("El resultado es:"+r);
	}

}
