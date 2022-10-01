package ejercicios;
import java.util.Scanner;
public class ejercicio6 {
  public static void main(String[]args) {
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
