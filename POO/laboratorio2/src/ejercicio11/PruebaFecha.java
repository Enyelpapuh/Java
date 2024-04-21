package ejercicio11;
import javax.swing.JOptionPane;
public class PruebaFecha {

	public static void main(String[] args) {
		String strmes = JOptionPane.showInputDialog("Ingrese el mes:");
		String strdia = JOptionPane.showInputDialog("Ingrese el dia:");
		String stranio =JOptionPane.showInputDialog("Ingrese el año:");
		
		int mes = Integer.parseInt(strmes);
		int dia = Integer.parseInt(strdia);
		int anio = Integer.parseInt(stranio);
		
		Fecha fecha = new Fecha(mes, dia, anio);
		
		fecha.mostrarFecha();
	}

}
