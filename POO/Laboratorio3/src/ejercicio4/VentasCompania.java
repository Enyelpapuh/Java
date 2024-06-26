package ejercicio4;

import javax.swing.JOptionPane;

public class VentasCompania {
    public static void main(String[] args) {

        double[][] ventas = new double[6][5]; 

        for (int vendedor = 1; vendedor <= 4; vendedor++) {
            for (int producto = 1; producto <= 5; producto++) {
                double precio = Math.random() * (200 - 50 + 1) + 50; 
                ventas[producto][vendedor] = precio;
       
            }
        }

        double[] totalPorProducto = new double[6];
        double[] totalPorVendedor = new double[5];

        for (int producto = 1; producto <= 5; producto++) {
            for (int vendedor = 1; vendedor <= 4; vendedor++) {
                totalPorProducto[producto] += ventas[producto][vendedor];
                totalPorVendedor[vendedor] += ventas[producto][vendedor];
            }
        }
        
        StringBuilder mensaje = new StringBuilder();

        mensaje.append(String.format("Ventas por Vendedor y Producto: \n\n%25s", ""));
        for (int vendedor = 1; vendedor <= 4; vendedor++) {
            mensaje.append(String.format("V%d%10s", vendedor, ""));
        }
        mensaje.append("Total \n");

        for (int producto = 1; producto <= 5; producto++) {
            mensaje.append(String.format("Producto %d: ", producto));
            for (int vendedor = 1; vendedor <= 4; vendedor++) {
                mensaje.append(String.format("%.2f%5s", ventas[producto][vendedor], ""));
            }
            mensaje.append(String.format("%.2f%n", totalPorProducto[producto]));
        }

        mensaje.append("Totales:   ");
        double totalGeneral = 0;
        for (int vendedor = 1; vendedor <= 4; vendedor++) {
            double totalVendedor = 0;
            for (int producto = 1; producto <= 5; producto++) {
                totalVendedor += ventas[producto][vendedor];
            }
            mensaje.append(String.format("%.2f  ", totalVendedor));
            totalGeneral += totalVendedor;
        }
        mensaje.append(String.format("%.2f%n", totalGeneral));

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Resumen de mes", JOptionPane.INFORMATION_MESSAGE);

    }
}

