package arregloEjemplo;

import javax.swing.JOptionPane;
public class ArregloEjemplo {

	public static void main(String[] args) {
		
		String tamanoArreglo = JOptionPane.showInputDialog("DE que tamano quiere su arreglo");
		int a = Integer.parseInt(tamanoArreglo);
		
		int[]arreglo = new int[a];
		
		/*encabezado*/
		String  mensaje = String.format("%s%8s%n","Indice","Valor");
		for (int i = 0; i < arreglo.length; i++) {
			
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(String.format("Introduzca el valor par al indice %d",i)));
			
			mensaje += String.format("%5d %8d %n", i,arreglo[i]);
			
		}
		JOptionPane.showMessageDialog(null, mensaje);
		

	}

}
