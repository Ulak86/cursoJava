package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		System.out.println("Dime que operacion quieres que ejecute con esos valores");
		System.out.println("1. Pintar un cuadro");
		System.out.println("2. Validar email");
		System.out.println("3. Añadir alumno");
		System.out.println("4. Salir");
		Scanner scan = new Scanner(System.in);
		int operacionSeleccionada = scan.nextInt();

		if (operacionSeleccionada == 0 || operacionSeleccionada > 4) {
			System.out.println("La opcion seleccionada no existe, has de volver a empezar");

		} else if (operacionSeleccionada == 1) {
			System.out.println("Has seleccionado pintar un cuadro");

		} else if (operacionSeleccionada == 2) {
			System.out.println("Has seleccionado validar un mail");

		} else if (operacionSeleccionada == 3) {
			System.out.println("Has seleccionado añadir alumno");

		} else if (operacionSeleccionada == 4) {
			System.out.println("Hasta la proxima");
		}

//	usando switch que era el objetivo del ejercicio

		System.out.println("Dime que operacion quieres que ejecute con esos valores");
		System.out.println("Pintar");
		System.out.println("Validar");
		System.out.println("Añadir");
		System.out.println("Salir");
		scan = new Scanner(System.in);
		String operacionSeleccionada2 = scan.nextLine();

		switch (operacionSeleccionada2) {

		case "Pintar":
			System.out.println("Has seleccionado pintar un cuadro");
			break;
		case "Validar":
			System.out.println("Has seleccionado validar un mail");
			break;
		case "Añadir":
			System.out.println("Has seleccionado añadir alumno");
			break;
		case "Salir":
			System.out.println("Hasta la proxima");
			break;
		default:
			System.out.println("La opcion seleccionada no existe, has de volver a empezar");

		}

		System.out.println("Fin de ejecucion");

	}
}

//EJERCICIO 4
//===============================================
//Pintar menu
//1. Pintar Cuadrado
//2. Validar email
//3. Añadir Alumno
//4. Salir
//
//Elige una opción
//
//Se pide la opción por teclado, dependiendo de la opción introducida le indicamos la que ha seleccionado, si selecciona la 4 le decimos "Adios!" y si no es ninguna de las que existe que se ha equivocado
//
