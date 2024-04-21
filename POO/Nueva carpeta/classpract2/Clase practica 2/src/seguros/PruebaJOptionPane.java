package seguros;

import javax.swing.JOptionPane;

public class PruebaJOptionPane {
	
	public static void main (String[] args) {
		
		/*String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
		/*imprimir
		
		JOptionPane.showMessageDialog(null, String.format("Hello %s", nombre));*/
		
		/*Mensaje sin icono
		
		JOptionPane.showMessageDialog(null, "Mensaje sin icono (-1)", "POO 2024",JOptionPane.PLAIN_MESSAGE);*/
		
		/*Mensaje de error
		
		JOptionPane.showMessageDialog(null, "Mensaje de error (0)", "POO 2024",0);*/
		
		/*Mensaje de informacion
		
		JOptionPane.showMessageDialog(null, "Mensaje de informacion (2)", "POO 2024",2);*/
		
		/*Metodo ComfirDialog*/
		
		/*int ventana = JOptionPane.showConfirmDialog(null,"¿Desea continuar?","POO 2024",JOptionPane.YES_NO_CANCEL_OPTION,2);
		
		if(ventana==0) {
			JOptionPane.showMessageDialog(null, "Has pulsado Yes","2024",1);
			
		}
		
		else if(ventana == 1) {
			JOptionPane.showMessageDialog(null, "Has pulsado No","2024",1);
		}
		else if(ventana == 2) {
			JOptionPane.showMessageDialog(null, "Has pulsado Cancel","2024",1);
		}*/
		 
		 /*String[]botones= {"Boton A","Boton B","Boton C","Boton D"};
		 
		 int ventana = JOptionPane.showOptionDialog(null, "Pulsa Un Boton", "2024", JOptionPane.DEFAULT_OPTION, 
				 JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
		 
		 if(ventana==0)
			 JOptionPane.showMessageDialog(null, "Boton A","2024",2);
		 else if (ventana == 1)
			 JOptionPane.showMessageDialog(null, "Boton B","2024",2);
		 else if (ventana == 2)
			 JOptionPane.showMessageDialog(null, "Boton C","2024",2);
		 else if (ventana == 3)
			 JOptionPane.showMessageDialog(null, "Boton D","2024",2);
		 
		 }*/
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el primer entero: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el segundo entero: "));
		
		int suma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, String.format("La suma es: %d%n",suma));
	}
}

