package ejercicio_14;

import java.util.Scanner;

public class CalculadoraPrecioEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese la edad del cliente: ");
        int edad = scanner.nextInt();

       
        int precioEntrada;

        if (edad < 4) {
            precioEntrada = 0; 
        } else if (edad <= 18) {
            precioEntrada = 5; 
        } else {
            precioEntrada = 10; 
        }

        
        System.out.println("El precio de la entrada es: " + precioEntrada + " cordobas.");

        scanner.close();
    }
}
