package ejercicio1;

import javax.swing.JOptionPane;

public class CiudadPorPais {

    public static void main(String[] args) {
        String[][] paisCiudad = new String[4][4];

        for (int i = 0; i < 4; i++) {
            paisCiudad[i][0] = JOptionPane.showInputDialog("Ingrese el nombre del país " + (i + 1) + ":");

            for (int j = 1; j <= 3; j++) { 
                paisCiudad[i][j] = JOptionPane.showInputDialog("Ingrese una ciudad para " + paisCiudad[i][0] + ":");
            }
        }

        String mensaje = "";
        for (int i = 0; i < 4; i++) {
            mensaje += "Ciudades de " + paisCiudad[i][0] + ":\n";
            for (int j = 1; j <= 3; j++) { 
                mensaje += "- " + paisCiudad[i][j] + "\n";
            }
            mensaje += "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
