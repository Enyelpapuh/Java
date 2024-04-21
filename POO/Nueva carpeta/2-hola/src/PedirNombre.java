import java.util.Scanner;

public class PedirNombre {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre!");
        // ingresa el nombre
        String nombre = scanner.nextLine();

        System.out.println("¡Hola " + nombre + " !,");

        scanner.close();
    }
}
