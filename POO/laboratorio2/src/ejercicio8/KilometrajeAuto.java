package ejercicio8;

import javax.swing.JOptionPane;

public class KilometrajeAuto {

	public static void main(String[] args) {
		
		int totalkilometraje = 0;
		int totalgasolina = 0;
		
		while (true) {
			
			String inputKilometros = JOptionPane.showInputDialog(null, "Ingrese los kilometros conducidos(o 'fin' para terminar");
			if (inputKilometros == null || inputKilometros.equalsIgnoreCase("fin")) {
				
				break;
				
			}
			
			int kilometro = Integer.parseInt(inputKilometros);
			
			String inputLitros = JOptionPane.showInputDialog(null,"ingrese los litros usados:");
			if (inputLitros == null) {
				break;
				
			}
			int litros = Integer.parseInt(inputLitros);
			
			double KmPorLitro = (double) kilometro/litros;
			JOptionPane.showMessageDialog(null, "kilometro por litro en este viaje:"+ KmPorLitro);
			
			totalgasolina += litros;
			totalkilometraje += kilometro;
			
		}
		
		double promedioKmPorLitro = (double) totalkilometraje/totalgasolina;
		JOptionPane.showMessageDialog(null, "Promedio de kilometros por litro en todos los viajes:"+promedioKmPorLitro);

	}

}
