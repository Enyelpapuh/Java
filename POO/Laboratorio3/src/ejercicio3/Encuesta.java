package ejercicio3;

import javax.swing.JOptionPane;

public class Encuesta {

    public static void main(String[] args) {
        int totalPersonas = 10;
        int[] genero = new int[totalPersonas];
        int[] trabaja = new int[totalPersonas];
        double[] sueldo = new double[totalPersonas];

        realizarEncuesta(genero, trabaja, sueldo);
        calcularResultados(genero, trabaja, sueldo);
    }

    public static void realizarEncuesta(int[] genero, int[] trabaja, double[] sueldo) {
        String[] optionsGenero = new String[] { "Masculino", "Femenino" };
        String[] optionsTrabajo = new String[] { "Sí", "No" };

        for (int i = 0; i < genero.length; i++) {
            int opcionGenero = JOptionPane.showOptionDialog(null, "Escoja su sexo", "Encuesta",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, optionsGenero, optionsGenero[0]);
            genero[i] = opcionGenero + 1; // 1 para masculino, 2 para femenino

            int opcionTrabajo = JOptionPane.showOptionDialog(null, "¿Usted Trabaja?", "Encuesta",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, optionsTrabajo, optionsTrabajo[0]);
            trabaja[i] = opcionTrabajo + 1; // 1 para sí trabaja, 2 para no trabaja

            if (trabaja[i] == 1) {
                sueldo[i] = generarNumeroAleatorio(600, 2000);
            } else {
                sueldo[i] = 0; // Si no trabaja, el sueldo es cero
            }
        }
    }

    public static void calcularResultados(int[] genero, int[] trabaja, double[] sueldo) {
        int totalHombres = 0;
        int hombresTrabajan = 0;
        double sueldoTotalHombres = 0;

        int totalMujeres = 0;
        int mujeresTrabajan = 0;
        double sueldoTotalMujeres = 0;

        for (int i = 0; i < genero.length; i++) {
            if (genero[i] == 1) { // Hombres
                totalHombres++;
                if (trabaja[i] == 1) { // Si trabaja
                    hombresTrabajan++;
                    sueldoTotalHombres += sueldo[i];
                }
            } else { // Mujeres
                totalMujeres++;
                if (trabaja[i] == 1) { // Si trabaja
                    mujeresTrabajan++;
                    sueldoTotalMujeres += sueldo[i];
                }
            }
        }

        double porcentajeHombres = (double) totalHombres / genero.length * 100;
        double porcentajeMujeres = (double) totalMujeres / genero.length * 100;
        double porcentajeHombresTrabajan = (double) hombresTrabajan / genero.length * 100;
        double porcentajeMujeresTrabajan = (double) mujeresTrabajan / genero.length * 100;
        double sueldoPromedioHombres = hombresTrabajan > 0 ? sueldoTotalHombres / hombresTrabajan : 0;
        double sueldoPromedioMujeres = mujeresTrabajan > 0 ? sueldoTotalMujeres / mujeresTrabajan : 0;

        String mensaje = String.format("Porcentaje de hombres: %.2f%%\n", porcentajeHombres);
        mensaje += String.format("Porcentaje de mujeres: %.2f%%\n", porcentajeMujeres);
        mensaje += String.format("Porcentaje de hombres que trabajan: %.2f%%\n", porcentajeHombresTrabajan);
        mensaje += String.format("Porcentaje de mujeres que trabajan: %.2f%%\n", porcentajeMujeresTrabajan);
        mensaje += String.format("Sueldo promedio de los hombres que trabajan: %.2f\n", sueldoPromedioHombres);
        mensaje += String.format("Sueldo promedio de las mujeres que trabajan: %.2f\n", sueldoPromedioMujeres);

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
