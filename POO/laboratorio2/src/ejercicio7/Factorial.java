package ejercicio7;

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Aplicación que calcula los factoriales del 1 al 20 y los muestra tabularmente\n\n");
        resultado.append(String.format("%s%30s%n", "!", "Resultado"));
        
        long fac = 1; 
        
        for(int n = 1; n <= 20; n++) {
            
            fac *= n;
            
            resultado.append(String.format("%d%s%,50d%n", n, "!", fac));
            
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString(), "Factoriales del 1 al 20", JOptionPane.INFORMATION_MESSAGE);
        

	}

}
