//Ejercicio 2
//==============================
//Escribe un programa que determine si un String ingresado por el usuario es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda, ignorando mayúsculas y espacios).

package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringEjer02 {

	public static void main(String[] args) {

		System.out.println("Escribe una frase y pulsa enter");
		Scanner scan = new Scanner(System.in);
		String alDerecho = scan.nextLine();

		alDerecho = alDerecho.toLowerCase();

		String alReves = "";

		for (int i = alDerecho.length(); i > 0; i--) {
			alReves = alReves + (alDerecho.charAt(i - 1));
		}

		if (alDerecho.equals(alReves)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}

	}

}
