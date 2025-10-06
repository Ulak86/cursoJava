package es.cursojava.inicio.colecciones.listas.ej01listas;

public class UtilidadesAlumnos {

	public static String nombresAlumnos() {
		String[] nombres = {
			    "Marcos", "Juan", "Luis", "Ana", "Julia", "Marta", "Carlos", "Laura", "José", "Isabel",
			    "David", "Carmen", "Antonio", "Lucía", "José Antonio", "Francisco", "Manuel", "María", "José Luis", "Marta"
			};
		return nombres [(int) (Math.random() * 19)];
	}

	public static int notaAlumnos() {
		return (int) (Math.random() * 11);
	}
}
