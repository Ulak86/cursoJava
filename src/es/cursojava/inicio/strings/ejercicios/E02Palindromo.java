/**
 * Ejercicio 2
 * 
 * Escribe un programa que determine si un String ingresado por el usuario es un palíndromo 
 * (se lee igual de izquierda a derecha que de derecha a izquierda, ignorando mayúsculas y espacios).
 */

package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class E02Palindromo {

	public static void main(String[] args) {

		System.out.println("Dame una palabra");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();

		boolean palindromo = true;

		for (int i = 0, j = texto.length() - 1; i < texto.length() / 2; i++, j--) {

			if (!(texto.charAt(i) == texto.charAt(j)))
				palindromo = false;

			if (palindromo == false)
				break;
		}

		System.out.println(texto + " es un palindromo: " + palindromo);

		sc.close();
	}
}
