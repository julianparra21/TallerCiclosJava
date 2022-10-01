package ejercicios;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;
public class ejercicio5 {
 public static void main(String[]args) {
   Scanner sueldo = new Scanner (System.in);
   System.out.println("ingrese su salario");
   int sueldo1= sueldo.nextInt();
   double porcentaje= 0.25;
   double calculo= sueldo1+((porcentaje/100)*sueldo1);
   System.out.println("el nuevo salario es: "+ calculo);
  
 }
}

