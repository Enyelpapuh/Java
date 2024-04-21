package ejercicio10;

import javax.swing.JOptionPane;

public class PruebaFactura {

	public static void main(String[] args) {
		
		Factura factura1 = new Factura("0f04c5efff", "Lorem ipsum", 13, 69);
		
        String mensaje = "Número: " + factura1.getNumPieza() + "\n" +
                "Descripción: " + factura1.getDespiez() + "\n" +
                "Cantidad: " + factura1.getCantidadArticulo() + "\n" +
                "Precio: " + String.format("%.2f", factura1.getPrecio()) + "\n" +
                "Monto: " + String.format("%.2f", factura1.ObtenerMontoFactura());

        JOptionPane.showMessageDialog(null, mensaje);

	}

}
