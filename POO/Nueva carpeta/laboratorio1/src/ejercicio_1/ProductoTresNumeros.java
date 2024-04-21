package ejercicio_1;

import java.util.Scanner;

public class ProductoTresNumeros {
    public static void main(String[] args) throws Exception {

        // crea el objeto para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero entero:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer numero entero:");
        int numero3 = scanner.nextInt();

        // calcula el producto de tres numero
        int resultado = numero1 * numero2 * numero3;

        // imprimir el resultado con el formato especificado
        System.out.println(numero1 + " x " + numero2 + " x " + numero3 + " = " + resultado);

        scanner.close();
    }
}
