package ejercicio_12;
/* Los tramos impositivos para la declaración de la renta en un
determinado país son los siguientes:
Renta Tipo impositivo
Menos de 10000€ 5%
Entre 10000€ y 20000€ 15%
Entre 20000€ y 35000€ 20%
Entre 35000€ y 60000€ 30%
Más de 60000€ 45%
Escribir un programa que pregunte al usuario su renta anual y muestre por
pantalla el tipo impositivo que le corresponde.*/
import java.util.Scanner;

public class TramosImpositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su renta anual en Cordobas: ");
        double rentaAnual = scanner.nextDouble();

        double tipoImpositivo;

        if (rentaAnual < 10000) {
            tipoImpositivo = 0.05; 
            
        } else if (rentaAnual < 20000) {
            tipoImpositivo = 0.15; 
            
        } else if (rentaAnual < 35000) {
            tipoImpositivo = 0.20; 
            
        } else if (rentaAnual < 60000) {
            tipoImpositivo = 0.30; 
            
        } else {
            tipoImpositivo = 0.45; 
            
        }

 
        System.out.println("Para una renta anual de " + rentaAnual + " cordobas, el tipo impositivo es del " + (tipoImpositivo * 100) + "%.");

        scanner.close();
    }
}
