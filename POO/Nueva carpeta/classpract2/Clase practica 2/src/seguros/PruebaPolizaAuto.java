package seguros;

import javax.swing.JOptionPane;


public class PruebaPolizaAuto {

	public static void main (String[] args) {
		
		int contador = 0;
		String entrada;
		String respuesta;
		
		PolizaAuto poliza1 = new PolizaAuto(0, null, null);
		
		try{
		contador = Integer.parseInt(JOptionPane.showInputDialog("Numero de cuenta:"));
		}catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Utilize unicamente numeros");
        }
		
		poliza1.setNumeroCuenta(contador);
		
		entrada = JOptionPane.showInputDialog("Marca:");
		
		poliza1.setMarcaYModelo(entrada);
		
		entrada = JOptionPane.showInputDialog("Municipio (abreviado):");
		
		poliza1.setMunicipio(entrada);
		
		if (poliza1.esMunicipioSinMulta() == true) 
			respuesta = "No";
		else 
			respuesta = "Si";
			
		JOptionPane.showMessageDialog(null, "Numero de cuenta: " + poliza1.getNumeroCuenta()+"\nModelo Y Marca: "+ poliza1.getMarcaYModelo()
		+"\nMunicipio: "+ poliza1.getMunicipio() + "\nRecibe Multa: " + respuesta);
		
	}
	
}
