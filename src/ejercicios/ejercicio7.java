package ejercicios;
import java.util.Scanner;
public class ejercicio7 {
 public static void main(String[]args) {
	 Scanner tratamientoC= new Scanner (System.in);
	 System.out.println("ingrese el costo del tratamiento");
	 float tratamiento= tratamientoC .nextInt();
	 System.out.println("ingrese el numero de dias de hospitalizacion");
	 Scanner hospitalizacion = new Scanner (System.in);
	 int Dhospitalizacion= hospitalizacion .nextInt();
	 int hospiDias= Dhospitalizacion*100000;
	 System.out.println("ingrese el costo de los medicamentos");
	 Scanner medicamentos=new Scanner (System.in);
	 float costoMedicamentos= medicamentos .nextInt();
	 float calculoFinal= tratamiento+hospiDias+costoMedicamentos;
	 System.out.println("el monto que se debe pagar al hospital es: $"+calculoFinal);
 }
}
