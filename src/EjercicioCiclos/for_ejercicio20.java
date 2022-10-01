package EjercicioCiclos;

import java.util.Iterator;
import java.util.Scanner;

public class for_ejercicio20 {
 public static void main(String[] args) {
	 System.out.println("ingrese la cantidad de trabajadores de los que quiere conocer el salario");
	 Scanner trabajadores=new Scanner(System.in);
	 int nTrabajadores=trabajadores.nextInt();
	 
	for(int i=0;i<nTrabajadores;i++) 
	{
		Scanner salario =new Scanner (System.in);
		  System.out.println("ingrese su salario");
		  int sueldo=salario .nextInt();
		  Scanner hExtras =new Scanner (System.in);
		  System.out.println("ingrese el numero de horas extras trabajadas");
		  int extras= hExtras.nextInt();
		  int horaExtra= extras*3000;
		  int resultado= sueldo+horaExtra;
		  System.out.println("Su sueldo inicial es: "+sueldo+" Las horas extras trabajadas fueron: "+extras+" Y Su saldo total es: "+resultado);	
	}
}
}
