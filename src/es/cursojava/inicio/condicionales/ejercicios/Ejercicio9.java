package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Iterator;
import java.util.Scanner;

//9. Pintar el menu hasta que se puse la opción de salir. 
//
//1. Pintar Cuadrado
//2. Validar email
//3. Añadir Alumno
//4. Salir
//
//Elige una opción

public class Ejercicio9 {

	public static void main(String[] args) {

		int option = 0;

		while (option != 4) {

			int cuadrado = 0;
			int b = 0;
			int c = 0;
			int d = 0;

			System.out.println("Elige una opcion" + "\n" + "1. Pintar Cuadrado" + "\n" + "2. Validar email" + "\n"
					+ "3. Añadir Alumno" + "\n" + "4. Salir" + "\n");

			Scanner scan = new Scanner(System.in);
			option = scan.nextInt();

			if (option == 4) {
				System.out.println("\n" + "Ciao!");
				break;
			} else if (option == 3) {
				System.out.println("\n" + "Alumno añadido" + "\n");
			} else if (option == 2) {
				System.out.println("\n" + "Mail validado" + "\n");
			} else if (option == 1) {
				System.out.println("\n" + "De que dimension lo quieres" + "\n");
				scan = new Scanner(System.in);
				cuadrado = scan.nextInt();

				for (int i = 0; i < cuadrado; i++) {
					for (int j = 0; j < cuadrado; j++) {
						if (i==0||i==(cuadrado-1)) System.out.print("* ");
						else if (j==0||j==(cuadrado-1)) System.out.print("* ");
						else System.out.print("  ");
					}
					System.out.println();
				}

			} else if (option < 1 || option > 4) {
				System.out.println("\n" + "Opcion no disponible, selecciona una opcion del menu" + "\n");
			}
		}
	}
}
