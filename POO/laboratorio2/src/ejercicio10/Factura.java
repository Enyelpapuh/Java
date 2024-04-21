package ejercicio10;

public class Factura {
 
	private String numPieza;
	private String despiez;
	private int cantidadArticulo;
	private double precio;
	
	public Factura(String numPieza, String despiez, int cantidadArticulo, double precio) {
		super();
		this.numPieza = numPieza;
		this.despiez = despiez;
		this.cantidadArticulo = cantidadArticulo;
		this.precio = precio;
	}

	public String getNumPieza() {
		return numPieza;
	}

	public void setNumPieza(String numPieza) {
		this.numPieza = numPieza;
	}

	public String getDespiez() {
		return despiez;
	}

	public void setDespiez(String despiez) {
		this.despiez = despiez;
	}

	public int getCantidadArticulo() {
		return cantidadArticulo;
	}

	public void setCantidadArticulo(int cantidadArticulo) {
		if (cantidadArticulo > 0) {
			
			this.cantidadArticulo = cantidadArticulo;
		}else {
			this.cantidadArticulo = 0;
		}
		
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0.0) {
			this.precio = precio;
		} else {
			this.precio = 0.0;

		}
		
	}
	
	public double ObtenerMontoFactura() {
		
		return cantidadArticulo * precio;
		
	}
	
	

}
