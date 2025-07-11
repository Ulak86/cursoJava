//Ejercicio 5 - Validar un email
//==============================
//Preguntar al usuario por un email
//Le diremos si es valido o no y si no lo es le diremos el motivo
//
//Validaciones: 
//+ Que no tenga espacios en blanco
//+ Que tenga @, solo 1
//+ Que después de la @ tenga al menos un punto
//+ Que entre la @ y el punto a su derecha haya una separación de dos caracateres
//+ Que despues del último punto haya entre 2 y 6 caracteres

package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringsEjer05 {

	public static void main(String[] args) {

		System.out.println("Dame una direccion de mail");
		Scanner scan = new Scanner(System.in);
		String mail = scan.nextLine();

		// + Que no tenga espacios en blanco
		boolean espacios = false;
		String mailEspacios = mail;

		mailEspacios = mailEspacios.strip();

		if (mailEspacios.contains(" ")) {
			espacios = true;
		}

		// + Que tenga @, solo 1
		boolean arroba = false;
		int arrobaCounter = 0;

		if (!mailEspacios.contains("@")) {
			arroba = true;
		} else {
			for (int i = mailEspacios.length() - 1; i > 0; i--) {

				if (mailEspacios.charAt(i) == '@') {

					arrobaCounter++;

				}

				if (arrobaCounter > 1) {

					arroba = true;
				}

			}
		}
//		String mailArroba = mail;
		// + Que después de la @ tenga al menos un punto
		boolean punto = false;
		int arrobaPosition = 0;

		if (!arroba) {

			arrobaPosition = mailEspacios.indexOf('@');
			mailEspacios = mailEspacios.substring(arrobaPosition, mailEspacios.length());

			if (!mailEspacios.contains(".")) {

				punto = true;
			}
		}

//		String mailPunto = mail;
		// + Que entre la @ y el punto a su derecha haya una separación de dos
		// caracateres

		boolean separacion = false;
		String mailSeparacion = mailEspacios;
		int dotPosition = 0;
		
		if (!arroba) {

			dotPosition = mailSeparacion.indexOf('.');
			mailSeparacion = mailSeparacion.substring(1, dotPosition);

			if (mailSeparacion.length() < 2) {

				separacion = true;
			}

		}
		// + Que despues del último punto haya entre 2 y 6 caracteres
		boolean caracteres = false;
		
		dotPosition = mailEspacios.lastIndexOf('.');
		
		if (!arroba) {
			mailEspacios = mailEspacios.substring(dotPosition + 1);
			int length = mailEspacios.length();

			if (length < 2 || length > 6) {

				caracteres = true;

			}
		}

//		mailEspacios
//		String mailCaracteres = mail;

		if (espacios || arroba || punto || separacion || caracteres) {

			System.out.println();
			System.out.println("Your email address in invalid and containes the following errors");

			if (espacios) {
				System.out.println("❌ Tiene espacios en blanco");
			}
			if (arroba) {
				System.out.println("❌ Tiene ninguna o mas de 1 arroba");
			}
			if (punto) {
				System.out.println("❌ A la derecha de @ hay menos de 1 punto");
			}
			if (separacion) {
				System.out.println("❌ Entre la arroba y el punto a su derecha no hay 2 caracteres");
			}
			if (caracteres) {
				System.out.println("❌ Despues del ultimo punto no hay entre 2 o 6 caracteres");
			}
		} else {
			System.out.println();
			System.out.println("Mail valido");
		}
	}

}
