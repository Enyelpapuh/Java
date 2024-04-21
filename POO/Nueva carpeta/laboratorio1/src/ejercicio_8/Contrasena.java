package ejercicio_8;


//Escribir un programa que almacene la cadena de caracteres contraseña
//en una variable, pregunte al usuario por la contraseña e imprima por
//pantalla si la contraseña introducida por el usuario coincide con la
//guardada en la variable sin tener en cuenta mayúsculas y minúsculas.
import java.util.Scanner;

public class Contrasena {

 public static void main(String[] args) throws Exception {

     String password = "Password";

     Scanner scanner = new Scanner(System.in);

     System.out.println("Ingrese la contrasena");
     String comparacion = scanner.nextLine();

     if (password.toLowerCase().equals(comparacion.toLowerCase())) {
         System.out.println("La contrasenas coinciden");

     } else {
         System.out.println("La contrasenas no coinciden");
     }
     scanner.close();
 }

}
