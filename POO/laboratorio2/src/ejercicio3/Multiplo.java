package ejercicio3;

import javax.swing.JOptionPane;

public class Multiplo {
    public static void main(String[] args) {
   
        String primerNumeroStr = JOptionPane.showInputDialog("Ingrese el primer numero entero:");
        int primerNumero = Integer.parseInt(primerNumeroStr);

       
        String segundoNumeroStr = JOptionPane.showInputDialog("Ingrese el segundo numero entero:");
        int segundoNumero = Integer.parseInt(segundoNumeroStr);

      
        boolean esMultiplo = primerNumero % segundoNumero == 0;

       
        if (esMultiplo) {
            JOptionPane.showMessageDialog(null, primerNumero + " es multiplo de " + segundoNumero);
        } else {
            JOptionPane.showMessageDialog(null, primerNumero + " no es multiplo de " + segundoNumero);
        }
    }
}
