package ejercicios;
import java.util.Scanner;
public class ejercicio21 {
 public static void main(String[]args) {
	Scanner horas=new Scanner (System.in); 
	System.out.println("ingrese el numero de horas trabajadas");
	int horaTrabajada=horas.nextInt();
	int pagoHora=horaTrabajada*2000;
	double descuento=pagoHora*0.1;
    int fin=(int) (pagoHora-descuento);
	System.out.println("Su sueldo parcial es: "+pagoHora+"\n su sueldo final es: "+descuento);
	
	
 }
}
