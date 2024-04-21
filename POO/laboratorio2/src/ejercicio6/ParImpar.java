package ejercicio6;

import javax.swing.JOptionPane;

public class ParImpar {

	public static void main(String[] args) {
        int producto = 1;

        for (int i = 1; i <= 15; i += 2) {
            producto *= i;
        }

  
        JOptionPane.showMessageDialog(null,"El producto de los enteros impares del 1 al 15 es: " + producto);
    }

}
