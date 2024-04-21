package factura;

public class PruebaFactura {

	public static void main(String[] args) {
		
		Factura factura1 = new Factura("123456789", "descripcion", 90, 900);
		
		System.out.printf("Numero: %s %n",factura1.getNumPieza());
		System.out.printf("Descripcion: %s %n",factura1.getDespiez());
		System.out.printf("cantidad %d %n",factura1.getCantidadArticulo());
		System.out.printf("precio: %.2f %n",factura1.getPrecio());
		System.out.printf("monto: %.2f %n",factura1.ObtenerMontoFactura());

	}

}
