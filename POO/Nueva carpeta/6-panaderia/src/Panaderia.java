
// Una panadería vende barras de pan a 3.49€ cada una. El pan que no es el
// día tiene un descuento del 60%. Escribir un programa que comience
// leyendo el número de barras vendidas que no son del día. Después el
// programa debe mostrar el precio habitual de una barra de pan, el
// descuento que se le hace por no ser fresca y el coste final total.

import java.util.Scanner;

public class Panaderia {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double precio_pan = 3.49;
        System.out.println("Numero de barras vendidas:");
        float Npanes = scanner.nextFloat();

        double descuento = ((60 * precio_pan) / 100);
        double precio_final = (descuento * Npanes);

        System.out.printf("El precio del pan es: %.2fEuros %n", precio_pan);
        System.out.printf("Descuento de 6%%: %.2fEuros %n", descuento);
        System.out.printf("El precio final es: %.2fEuros %n", precio_final);

        scanner.close();
    }
}
