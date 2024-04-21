package Estudiante;

public class prueba {

	public static void main(String[] args) {
		Estudiante alumno1 = new Estudiante("jose chamo", 100);
		Estudiante alumno2 = new Estudiante("Ryan Goslies", 90);
		Estudiante alumno3 = new Estudiante("Beatriz pinzon", 80);
		Estudiante alumno4 = new Estudiante("Walter blaco", 70);
		Estudiante alumno5 = new Estudiante("jessie pickman", 60);
		Estudiante alumno6 = new Estudiante("bitlejuice jose", 59);
		Estudiante alumno7 = new Estudiante("jesus nazareno", 50);

		System.out.printf("La calificacion en letra de %s es: %s%n", alumno1.getNombre(), alumno1.getCalificaciones());
		System.out.printf("La calificacion en letra de %s es: %s%n", alumno2.getNombre(), alumno2.getCalificaciones());
		System.out.printf("La calificacion en letra de %s es: %s%n", alumno3.getNombre(), alumno3.getCalificaciones());
		System.out.printf("La calificacion en letra de %s es: %s%n", alumno4.getNombre(), alumno4.getCalificaciones());
		System.out.printf("La calificacion en letra de %s es: %s%n", alumno5.getNombre(), alumno5.getCalificaciones());
		System.out.printf("La calificacion en letra de %s es: %s%n", alumno6.getNombre(), alumno6.getCalificaciones());
		System.out.printf("La calificacion en letra de %s es: %s%n", alumno7.getNombre(), alumno7.getCalificaciones());

	}

}
