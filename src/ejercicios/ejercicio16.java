package ejercicios;
import java.util. Scanner;
public class ejercicio16 {
 public static void main(String[]args) {
	 int arroz=3000;
	 Scanner compra =new Scanner(System.in);
	 System.out.println("ingrese la cantidad de arroz que quiere comprar");
	 int comprar=compra.nextInt();
	 int comprado= arroz*comprar;
	 Scanner pagar=new Scanner(System.in);
	 System.out.println("ingrese el pago");
	 int pago=pagar.nextInt();
	 if(pago>=comprado) {
		 System.out.println("si le alcanza");
	 }else {
		 System.out.println("le hace falta dinero para pagar la cuenta");
	 }
	 int devuelta=pago-comprado;
	 System.out.println("la devuelta es:"+devuelta);
	 
 }
}
