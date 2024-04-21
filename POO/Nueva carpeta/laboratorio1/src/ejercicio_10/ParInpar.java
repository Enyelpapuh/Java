package ejercicio_10;
/*Escribir un programa que pida al usuario un número entero y muestre
por pantalla si es par o impar.*/

import java.util.Scanner;
public class ParInpar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un numero entero:" );
		int entero = scanner.nextInt();
		
		scanner.close();
		
		if (entero %2 == 0) {
		System.out.println("el numero " + entero + " es par");
			
		}else {
			System.out.println("el numero " + entero + " no es par");
		}
		
		
	}

}
