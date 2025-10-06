package es.cursojava.inicio.colecciones.listas.ej01listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Alumno> alumnos = generarAlumnos();
		imprimirAlumnos(alumnos);
		alumnosNotaMayorQue9(alumnos);
		notaDeAlumnosConNota(alumnos, sc);
		eliminarAlumnosSuspensos(alumnos);

	}

	private static List<Alumno> generarAlumnos() {

		List<Alumno> alumnos = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			alumnos.add(new Alumno(UtilidadesAlumnos.nombresAlumnos(), UtilidadesAlumnos.notaAlumnos()));
		}

		return alumnos;
	}

	private static void imprimirAlumnos(List<Alumno> alumnos) {

		System.out.println("\nImprimiendo toda la informacion disponible de todos los alumnos incluidos en la "
				+ alumnos.getClass().getSimpleName());
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}

	private static void alumnosNotaMayorQue9(List<Alumno> alumnos) {

		System.out.println("\nImprimiendo toda la informacion disponible de todos los alumnos incluidos en la "
				+ alumnos.getClass().getSimpleName() + " con una nota superior a un 9");

		for (Alumno alumno : alumnos) {
			if (alumno.getNota() > 10) {
				System.out.println(alumno);
			}
		}
	}

	private static void notaDeAlumnosConNota(List<Alumno> alumnos, Scanner sc) {

		System.out.println(
				"\nIntroduce el nombre del alumno(s) para los que quieres consultar la nota, la app imprimira todas las notas de alumnos con ese nombre o informara de que no hay alumnos con ese nombre en este "
						+ alumnos.getClass().getSimpleName());

		String nombre = sc.nextLine();
		boolean hayNombre = false;

		for (Alumno alumno : alumnos) {
			if (alumno.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(alumno.getNota());
				hayNombre = true;
			}
		}

		if (!hayNombre) {
			System.out.println("\nNo hay alumnos con ese nombre");
		}

	}

	private static void eliminarAlumnosSuspensos(List<Alumno> alumnos) {

//		for (int i = 0; i < alumnos.size(); i++) {
//			if (alumnos.get(i).getNota() < 5) {
//				System.out.println(alumnos.remove(i));
//
//			}
//		}

		List<Alumno> posicionesSuspensas = new ArrayList<>();

		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNota() < 5) {
				posicionesSuspensas.add(alumnos.get(i));
		
			}
		}
		
//		for (Alumno alumno : posicionesSuspensas) {
//			for (int i = 0; i < alumnos.size(); i++) {
//				if (alumnos.get(i) == alumno) {
//				
//				}
//			}
//		}
		alumnos.removeAll(posicionesSuspensas);
		
		imprimirAlumnos(alumnos);
	}
}