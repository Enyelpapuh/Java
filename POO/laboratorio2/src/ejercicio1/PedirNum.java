package ejercicio1;

import javax.swing.JOptionPane;

public class PedirNum {

	public static void main(String[] args) {

		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero:"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero:"));

		String mensaje = "Suma: " + (numero1 + numero2) + "\n" +
				"Producto: " + (numero1 * numero2) + "\n" +
				"Diferencia: " + (numero1 - numero2) + "\n";

		if (numero2 != 0) {
			mensaje += "Cociente: " + (numero1 / numero2);
		} else {
			mensaje += "No se puede dividir por cero";
		}

		JOptionPane.showMessageDialog(null, mensaje);

	}

}
