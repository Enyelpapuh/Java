package Estudiante;

public class Estudiante {
	
	private String nombre;
	private String carnet;
	private String grupo;
	private int promedio; // Se añade la variable promedio
	
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	// Se añade un constructor que inicializa el nombre y el promedio
	public Estudiante(String nombre, int promedio) {
		this.nombre = nombre;
		setPromedio(promedio); // Se llama al método setPromedio para realizar las validaciones
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPromedio(int promedio) {
		if (promedio >= 0 && promedio <= 100) { // Se realizan las validaciones de rango
			this.promedio = promedio;
		} else {
			System.out.println("El promedio debe estar en el rango de 0 a 100.");
		}
	}
	
	public int getPromedio() { // Se cambia el tipo de retorno a int y se elimina el parámetro
		return promedio;
	}
	
	public String getCalificaciones() {
		String calificaciones = "";
			
		switch (promedio / 10) {
			case 10:
			case 9:
				calificaciones = "A";
				break;
			case 8:
				calificaciones = "B";
				break;
			case 7:
				calificaciones = "C"; // Se corrige la letra C
				break;
			case 6:
				calificaciones = "D"; // Se corrige la letra D
				break;
			default:
				calificaciones = "F";
				break;
		}
		return calificaciones;
	}
}
