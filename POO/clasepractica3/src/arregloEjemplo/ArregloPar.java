package arregloEjemplo;


import javax.swing.JOptionPane;
public class ArregloPar {

public static void main(String[] args) {
		

		
		int[]arreglo = new int[10];
		
		/*encabezado*/
		String  mensaje = String.format("%s%8s%n","Indice","Valor");
		
		int contador = 0;
		
		for (int n = 1; n <=20 ; n++) {
			
		
			
				
				if(n % 2 == 0) {
					if(contador < arreglo.length) {
						
					arreglo[contador] = n; 
					mensaje += String.format("%5d %8d %n", contador,arreglo[contador]);
					contador++;
					
					}else {
						break;
					}
					
				}
				
			
		}
			
		JOptionPane.showMessageDialog(null, mensaje);
		

	}
	

}
