package ejercicio2;

import javax.swing.JOptionPane;	

public class MasGrande {

	public static void main(String[] args) {
		
		String numero1 = JOptionPane.showInputDialog("Ingrese el primer numero entero:");
		int num1 = Integer.parseInt(numero1);
		
		String numero2 = JOptionPane.showInputDialog("Ingrese el segundo numero entero:");
		int num2 = Integer.parseInt(numero2);
		
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, numero1 + " Es mas grande"  );
			
		}else if (num2 > num1) {
			JOptionPane.showMessageDialog(null, numero2 + " Es mas grande"  );
			
		}else {
			JOptionPane.showMessageDialog(null, "Los dos son numeros iguales iguales"  );
			
		}
		

	}

}
