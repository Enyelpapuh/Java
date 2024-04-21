package ejercicio_7;


//Escribir un programa que pregunte al usuario su edad y muestre por
//pantalla si es mayor de edad o no.
import java.util.Scanner;

public class Edad {
 public static void main(String[] args) throws Exception {

     Scanner scanner = new Scanner(System.in);

     System.out.println("Ingrese su edad:");
     int edad = scanner.nextInt();

     if (edad >= 18) {
         System.out.println("Usted es mayor de edad");

     } else {
         System.out.println("Usted no es mayor de edad");
     }
     scanner.close();
 }
}
