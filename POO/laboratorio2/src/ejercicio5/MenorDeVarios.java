package ejercicio5;

import javax.swing.JOptionPane;
public class MenorDeVarios {

	public static void main(String[] args) {
		 String numvalor = JOptionPane.showInputDialog("Ingrese el numero de valor a comparar");
	        int Numvalor = Integer.parseInt(numvalor);

	       
	        String primerValorStr = JOptionPane.showInputDialog("Ingrese el valor #1:");
	        int primerValor = Integer.parseInt(primerValorStr);
	        int menor = primerValor;

	        for (int i = 1; i < Numvalor; i++) {
	            String ValorStr = JOptionPane.showInputDialog("Ingrese el valor #" + (i + 1) + ":");
	            int valor = Integer.parseInt(ValorStr);

	            if (valor < menor) {
	                menor = valor;
	            }
	        }

	        JOptionPane.showMessageDialog(null, "El menor valor ingresado es: " + menor);

	}

}
