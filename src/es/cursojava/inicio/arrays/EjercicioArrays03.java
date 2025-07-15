//Simular un colegio con 
//2 aulas
//3 puestos en cada aula
//
//Menu:
//1. Insertar alumno -> Solicitara el nombre de los alunos para las aulas que tengan puestos disponibles
//2. Mostrar alumno -> Muestra los alumnos por aula, si un puesto no tiene alumno mostrara (vacio). 
//3. Buscar alumno -> Solicitar texto, mostrar el aula y puesto en el que estan todos los alumnos que contengan esa cadena de texto
//4. Borrar alumno -> Solicitar un nombre y se borra a todos los alumnos que contengan ese string (poner a null)
//5. Salir

package es.cursojava.inicio.arrays;

import java.util.Scanner;

public class EjercicioArrays03 {

	public static void main(String[] args) {

//		String[][] aulas = new String[2][3];
		String[][] aulas = { { null, "pedro", "diego" }, { "ana", null, "marta" } };
		int opcion = 0;

		do {
			System.out.println("===========MENU===========");
			System.out.println("Elige una opción");
			System.out.println("1. Insertar alumno");
			System.out.println("2. Mostrar todos los alumnos");
			System.out.println("3. Buscar alumno");
			System.out.println("4. Borrar alumno");
			System.out.println("5. Salir");

			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();

			// switch nuevo
			switch (opcion) {
			case 1 -> {

				System.out.println("===========OPCION 1=======");
				int contadorCase1 = 0;

				for (int i = 0; i < aulas.length; i++) {

					for (int j = 0; j < aulas[i].length; j++) {

						if (aulas[i][j] == null) {
							System.out.println("Dame el nombre del alumno para el aula " + i + " y puesto " + j);
							Scanner scann = new Scanner(System.in);
							aulas[i][j] = scann.nextLine();
							contadorCase1++;
						}
					}
				}

				if (contadorCase1 == 0) {
					System.out.println("Todos los puestos de todas las aulas estan ocupados");
				}

			}
			case 2 -> {
				System.out.println("===========OPCION 2=======");
				int puestosLibres = 0;
				for (int i = 0; i < aulas.length; i++) {

					for (int j = 0; j < aulas[i].length; j++) {

						if (aulas[i][j] == null) {
							puestosLibres++;
							System.out.print("(vacio)" + "\t\t");

						} else {
							System.out.print(aulas[i][j] + "\t\t");

						}
					}
					System.out.println();
				}
				if (puestosLibres == 0) {
					System.out.println("Las aulas estan llenas");
				}
			}
			case 3 -> {
				System.out.println("===========OPCION 3=======");
				System.out.println("A que alumno quieres buscar?");
				Scanner scanno = new Scanner(System.in);
				String alumnoBuscado = scanno.nextLine();
				int alumnosCoincidentes = 0;

				for (int i = 0; i < aulas.length; i++) {

					for (int j = 0; j < aulas[i].length; j++) {

						if (aulas[i][j]!= null && aulas[i][j].contains(alumnoBuscado)) {
							System.out.println("El alumno buscado se encuentra en el aula " + i+1 + " en el puesto " + j+1);
							alumnosCoincidentes++;
							}
						}
						System.out.println();
					}
				if (alumnosCoincidentes == 0) {
					System.out.println("No hay ningun alumno con ese nombre en este colegio");
				}
			}
			case 4 -> {
				System.out.println("===========OPCION 4=======");
				System.out.println("A que alumno quieres borrar?");
				Scanner sc = new Scanner(System.in);
				String alumnoABorrar = sc.nextLine();
				int alumnosBorrables = 0;
				for (int i = 0; i < aulas.length; i++) {

					for (int j = 0; j < aulas[i].length; j++) {

						if (aulas[i][j]!= null && aulas[i][j].equals(alumnoABorrar)) {
							aulas[i][j] = null;
							alumnosBorrables++;
						}
					}
				}
				if (alumnosBorrables == 0) {
					System.out.println("No hay ningun alumno con ese nombre en este colegio");
				}
			}
			case 5 -> System.out.println("Adios");
			default -> System.out.println("Opción incorrecta");
			}

		}while(opcion!=5);
}}