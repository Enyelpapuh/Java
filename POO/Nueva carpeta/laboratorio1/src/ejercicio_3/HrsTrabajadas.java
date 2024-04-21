package ejercicio_3;

import java.util.Scanner;

public class HrsTrabajadas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de hrs trabajadas:");
        float TrabajoHrs = scanner.nextFloat();

        System.out.println("ingrese el pago por hrs:");
        float Pagohrs = scanner.nextFloat();

        float Pagototal = TrabajoHrs * Pagohrs;

        System.out.println("su pago sera un total de: " + Pagototal);

        scanner.close();
    }
}
