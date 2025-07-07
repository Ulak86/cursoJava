//5. Solicitar por consola el numero de alumnos de un aula. 
//Pedir para cada alumno su nota
//Indicar la nota media de todos los alumnos del aula.

package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int alumnos = 0;
		int contadorAlumnos = 0;
		int sumadorNotas = 0;
		double notaMedia = 0;
		double alumnosD = 0;
		double sumadorNotasD = 0;

		System.out.println("Dime cuantos alumnos hay en tu aula");
		Scanner scan = new Scanner(System.in);
		alumnos = scan.nextInt();
		contadorAlumnos = alumnos;

		while (contadorAlumnos > 0) {

			System.out.println("Dime la nota del alumno " + contadorAlumnos);
			scan = new Scanner(System.in);
			sumadorNotas = sumadorNotas + scan.nextInt();
			contadorAlumnos--;

		} ;

		
		notaMedia = sumadorNotas / alumnos;
		System.out.println("La nota media de la clase es: " + notaMedia);
		
		alumnosD = alumnos;
		sumadorNotasD = sumadorNotas;
		
		notaMedia = sumadorNotasD / alumnosD;
		System.out.println("La nota media de la clase es: " + notaMedia);

		System.out.println("Fin");

	}
}
