package lab3;

import javax.swing.JOptionPane;
import java.lang.Math;

public class encuesta {

	public static void main (String[]args) {
		
		String[] options = new String[] {"Masculino", "Femenino"};
		String[] options2 = new String[] {"Trabajo", "No trabajo"};
		int[] sexo = new int[10];
		int[] trabajan = new int[10];
		double[] sueldo = new double[10];
		double mujeres = 0,mujeresT=0,hombres = 0,hombresT = 0;
		double hsueldoT = 0,msueldoT = 0;
		
		JOptionPane.showMessageDialog(null,"Este programa realiza una encuesta a 10 personas");
		
		for (int i = 0; i < 10 ; i++ ) {
			int sexos = JOptionPane.showOptionDialog(null, "Escoja su sexo", "Encuesta",
			        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
			        null, options, options[0]);
					
			
			if (sexos == 0) {
				
				sexo[i] = 1;
				
			}else {
				sexo[i] = 2;
			}
			
			int trabajos = JOptionPane.showOptionDialog(null, "¿Usted Trabaja?", "Encuesta",
			        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
			        null, options2, options2[0]);
					
			
			if (trabajos == 0) {
				trabajan[i] = 1;
				
			}else {
				trabajan[i] = 2;
			}
			
			if (trabajan[i] == 2) {
			
				sueldo[i] = 0;
			}else {
			
			
			
			sueldo[i] = (Math.random()*(2000 - 600 + 1)) + 600;
			
			}
		}
		
		for(int n = 0; n < sexo.length;n++) {
			
				if (sexo[n] == 1) {
					
					hombres++;
					
					if (trabajan[n] == 1) {
					hombresT++;
					hsueldoT += sueldo[n];
				}
			}	
			
				if (sexo[n] == 2) {
					
					mujeres++;
					
					if (trabajan[n] == 1) {
					mujeresT++;
					msueldoT += sueldo[n];
				}
			}	
		
		}
			
		mujeres = (mujeres / sexo.length) * 100 ;
		mujeresT = (mujeresT / sexo.length) * 100;
		msueldoT = (msueldoT / mujeresT);
		
		hombres = (hombres / sexo.length) * 100 ;
		hombresT = (hombresT / sexo.length) * 100;
		hsueldoT = (hsueldoT / hombresT ) * 100;
		
		String mensaje = String.format("El porcentaje de mujeres es: %.0f", mujeres );
		mensaje += String.format("\nEl porcentaje de hombres es: %.0f", hombres );
		mensaje += String.format("\nEl porcentaje de mujeres que trabajan es: %.0f", mujeresT);
		mensaje += String.format("\nEl porcentaje de hombres que trabajan es: %.0f", hombresT );
		mensaje += String.format("\nEl sueldo promedio de las mujeres es: %.0f", msueldoT );
		mensaje += String.format("\nEl sueldo promedio de los hombres es: %.0f", hsueldoT );
		
		JOptionPane.showMessageDialog(null,mensaje);
		

		
		
		}
	}
	

