
package ejercicios;
import java.util.Scanner;
public class ejercicio4 {
 public static void main(String[] args) {
	 Scanner ingresar=new Scanner (System.in);
	 System.out.println("ingrese el valor del cual desea conocer el porcentaje");
	 int ingreso= ingresar.nextInt();
	 double porcentaje=15;
	 double calculo= porcentaje*ingreso/100;
	 System.out.println("El valor de la constante es: "+calculo);
	 
	
 }
 
}