package ejercicio_11;

/*Para tributar un determinado impuesto se debe ser mayor de 16 años y
tener unos ingresos iguales o superiores a 1000 € mensuales. Escribir un
programa que pregunte al usuario su edad y sus ingresos mensuales y
muestre por pantalla si el usuario tiene que tributar o no.
*/

import java.util.Scanner;

public class Tributar {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese su edad:");
		int edad =  scanner.nextInt();
		
		System.out.print("Ingrese sus ingresos mensuales:");
		double ingresos_mensuales =  scanner.nextDouble();
		
		scanner.close();
		
		if (edad > 16 && ingresos_mensuales >= 1000) {
			System.out.println("Debe tributar.");
			
		} else {
			System.out.println("no tiene que tributar.");

		}
	}

}
