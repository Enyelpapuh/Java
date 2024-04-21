package Estudiante;

import java.util.Scanner;

public class Calificacion {
	public void name() {
		
	}
	
		public static void main(String[]arg) {
			Scanner entrada = new Scanner(System.in);
			int total=0;
			int contador=0;
			int aCuenta=0;
			int bCuenta=0;
			int cCuenta=0;
			int dCuenta=0;
			int fCuenta=0;
			
			System.out.printf("%s%n%s%n%s%n","Introduzca las calificaciones en el rango 0-100",
					"Escriba un indicador de fin de linea para terminar el ciclo",
					"Escriba <crtl> + z y presione enter");
			
			while(entrada.hasNext()) {
				System.out.print("Introduzca la calificacion");
				int calificacion = entrada.nextInt();
				total+= calificacion;
				contador++;
				
					switch(calificacion/10) {
					case 10:
					case 9:
						++aCuenta;
					break;
					case 8:
						++bCuenta;
					break;
					case 7:
						++cCuenta;
					break;
					case 6:
						++dCuenta;
						break;
					default:
						fCuenta++;
					break;
					}		
			}
			
			System.out.println("Reporte de calificacion");
			
			if(contador!=0) {
				double promedio = (double)total/contador;
				System.out.printf("El total de %d calificaciones es %d %n",contador, total);
				
				System.out.printf("El promedio de la clase es %.2f%n", promedio);

				
				System.out.printf("%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n","Cantidad de notas en Letras",
						"A: ",aCuenta,
						"B: ",bCuenta,
						"C: ",cCuenta,
						"D: ",dCuenta,
						"F: ",fCuenta);
			}
			else {
				System.out.println("No se introdujo calificaciones");
			}
			entrada.close();
			
		}
	
		
		
		
		
		
	}


