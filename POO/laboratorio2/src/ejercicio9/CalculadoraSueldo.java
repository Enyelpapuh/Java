package ejercicio9;

import java.util.Scanner;

public class CalculadoraSueldo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {
			
			System.out.println("Ingrese EL nombre del empleado "+ i +":");
			String nombre = scanner.nextLine();
			
			System.out.println("Ingrese el numero de horas trabajadas por "+ i +":");
			int HrsTrabajadas = scanner.nextInt();
			
			System.out.println("Ingrese la tarifa por hora de "+ nombre +":");
			double TarifaPorHora = scanner.nextDouble();
			scanner.nextLine();
			
			double sueldobruto = CalculadoraSueldoBruto(HrsTrabajadas, TarifaPorHora);
			System.out.println("El sueldo bruto de "+ nombre+ "es: $"+ sueldobruto);
			
		}
		
		scanner.close();

	}
	
	public static double CalculadoraSueldoBruto(int HrsTrabajadas,double TarifaPorHora) {
		
		double sueldoBruto;
		if (HrsTrabajadas <= 40) {
			
			sueldoBruto = HrsTrabajadas * TarifaPorHora;
			
		}else {
			int HrsNormales = 40;
			int HrsExtra = HrsTrabajadas - 40;
			double sueldoNormal = HrsNormales*TarifaPorHora;
			double sueldoExtra = HrsExtra * (TarifaPorHora* 1.5);
			
			sueldoBruto= sueldoNormal+ sueldoExtra;
		}
		return sueldoBruto;
	}

}
