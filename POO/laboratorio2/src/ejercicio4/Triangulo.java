package ejercicio4;

import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[]args) {
		
		String lado1str = JOptionPane.showInputDialog("Ingrese el primer lado del triangulo");
		double lado1 = Double.parseDouble(lado1str);
		
		String lado2str = JOptionPane.showInputDialog("Ingrese el segundo lado del triangulo");
		double lado2 = Double.parseDouble(lado2str);
		
		String lado3str = JOptionPane.showInputDialog("Ingrese el tercer lado del triangulo");
		double lado3 = Double.parseDouble(lado3str);
		
		boolean estriangulo = (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2+lado3 >lado1);
		
		if(estriangulo) {
			JOptionPane.showMessageDialog(null, "los valores ingresados represetan los lado de un triangulo"  );
		}else {
			JOptionPane.showMessageDialog(null, "los valores ingresado no pueden representar los lados de un triangulo"  );
			
		}
		
		
	}
}
