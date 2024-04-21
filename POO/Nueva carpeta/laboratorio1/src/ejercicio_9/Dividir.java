package ejercicio_9;
/*Escribir un programa que pida al usuario dos números y muestre por
pantalla su división. Si el divisor es cero el programa debe mostrar un error.*/

import java.util.Scanner;
public class Dividir {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el dividendo:");
		double dividendo = scanner.nextDouble();
		
		System.out.println("Ingrese el divisor:");
		double divisor = scanner.nextDouble();
		
		if (divisor == 0) {
			System.out.println("ERROR: no se puede dividir por cero.");
			
		}else {
			double resultado = dividendo/ divisor;
			
			System.out.println("El resultado de la division es: "+ resultado );
			
		}
		
		scanner.close();
		
		
	}

}
