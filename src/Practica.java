import javax.swing.JOptionPane;

public class Practica {

	public static void main(String[] args) {
		 int edades = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
		
		while (edades<=0) {

			edades = Integer.parseInt(JOptionPane.showInputDialog("edad incotrrecta, ingrese una edad correcta  "));
			
		}
		System.out.println(edades);



	}

}
