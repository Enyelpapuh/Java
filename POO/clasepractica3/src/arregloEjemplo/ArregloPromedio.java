package arregloEjemplo;

import javax.swing.JOptionPane;

public class ArregloPromedio {

	public static void main(String[] args) {
		String tamanoArreglo = JOptionPane.showInputDialog("De que tamano quiere su arreglo");
		int a = Integer.parseInt(tamanoArreglo);
		
		double [] arreglo = new double[a];
		double valores = 0;
		int contador;
		
		for (int i = 0; i < arreglo.length; i++) {
			
			contador = i +  1;
			
			 arreglo[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor numero " + contador ));
			 
			 valores += arreglo[i];
			
		}
		
	 valores = valores / arreglo.length;
		
		JOptionPane.showMessageDialog(null, "El promedio de todos los valores es " + valores);

	}

}
 