package ejercicios;

	import java.util.Scanner;
	
	public class ejercicio25 {
		public static void main(String[]args) {
			   Scanner sueldo = new Scanner (System.in);
			   System.out.println("ingrese su salario");
			   int sueldo1= sueldo.nextInt();
			   System.out.println("ingrese el incremento.");
			   Scanner incremento= new Scanner(System.in);
			   double porcentaje=incremento.nextInt();
			   double calculo= sueldo1+((porcentaje/100)*sueldo1);
			   System.out.println("el nuevo salario es: "+ calculo);
			  
			 }
	}
