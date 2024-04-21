package seguros;

public class PolizaAuto {
	
	public int numeroCuenta;
	public String marcaYModelo;
	public String municipio;
	
	public PolizaAuto(int numeroCuenta, String marcaYModelo, String municipio) {

		this.numeroCuenta = numeroCuenta;
		this.marcaYModelo = marcaYModelo;
		this.municipio = municipio;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getMarcaYModelo() {
		return marcaYModelo;
	}

	public void setMarcaYModelo(String marcaYModelo) {
		this.marcaYModelo = marcaYModelo;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public boolean esMunicipioSinMulta() {
		
		boolean municipioSinMulta;
		
		switch(getMunicipio()) {
		
		case "MY": case "GR": case "LE": case "MT":
			
			municipioSinMulta = true;
			break;
		default:
			municipioSinMulta = false;
		}
		return municipioSinMulta;
		
	}



			
		
		
		
	}
	
	


