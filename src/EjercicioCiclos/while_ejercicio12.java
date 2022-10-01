package EjercicioCiclos;
import java.util.Scanner;
public class while_ejercicio12 {
public static void main(String[] args) {
	int i=0;
	Scanner entrada=new Scanner(System.in);
	System.out.println("ingrese la primer nota");
	double nota1=entrada.nextInt();
	System.out.println("ingrese la segunda nota");
	double nota2= entrada.nextInt();
	System.out.println("ingrese la tercera nota");
	double nota3=entrada.nextInt();
    
    
	while(i<=nota3) {
		double promedio= (nota1+nota2+nota3)/3;
	    System.out.println("el promedio de las tras notas parciales es: "+promedio);
		i++;
	}
}
}
