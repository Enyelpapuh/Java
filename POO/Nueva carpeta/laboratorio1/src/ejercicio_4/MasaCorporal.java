package ejercicio_4;

import java.util.Scanner;
import java.lang.Math;

public class MasaCorporal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su altura en metros");
        float altura = scanner.nextFloat();

        System.out.println("Ingrese peso en KiloGramos");
        float peso = scanner.nextFloat();

        float masacorporal = peso / (float) Math.pow(altura, 2);
        double masacorporalRedondeada = Math.round(masacorporal * 100.0) / 100.0;

        System.out.printf("Masa corporal: %.2f\n", masacorporalRedondeada);

        scanner.close();

    }
}
