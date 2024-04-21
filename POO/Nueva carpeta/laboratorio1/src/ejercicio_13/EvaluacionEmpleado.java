package ejercicio_13;

/*En una determinada empresa, sus empleados son evaluados al
final de cada año. Los puntos que pueden obtener en la evaluación
comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores
beneficios. Los puntos que pueden conseguir los empleados pueden
ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras
mencionadas. A continuación se muestra una tabla con los niveles
correspondientes a cada puntuación. La cantidad de dinero conseguida
en cada nivel es de 2.400€ multiplicada por la puntuación del nivel.

Escribir un programa que lea la puntuación del usuario e indique su nivel de
rendimiento, así como la cantidad de dinero que recibirá el usuario.
*/
import java.util.Scanner;

public class EvaluacionEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la puntuación del empleado: ");
        double puntuacion = scanner.nextDouble();
        
        String nivel;
        double cantidadDinero;
        if (puntuacion == 0.0) {
            nivel = "Inaceptable";
            cantidadDinero = 0.0;
        } else if (puntuacion == 0.4) {
            nivel = "Aceptable";
            cantidadDinero = 2400 * puntuacion;
        } else if (puntuacion >= 0.6) {
            nivel = "Meritorio";
            cantidadDinero = 2400 * puntuacion;
        } else {
            nivel = "Puntuación no válida";
            cantidadDinero = 0.0;
        }
        
        // Mostrar el resultado al usuario
        System.out.println("Nivel de rendimiento: " + nivel);
        System.out.println("Cantidad de dinero: " + cantidadDinero + "€");
        
        scanner.close();
    }
}
