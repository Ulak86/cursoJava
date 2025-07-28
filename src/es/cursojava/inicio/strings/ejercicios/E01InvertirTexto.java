/**
 * E01InvertirTexto
 * Escribe un programa que reciba un String y devuelva el texto invertido.
 */

package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class E01InvertirTexto {

	public static void main(String[] args) {

		System.out.println("Dame una palabra");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();

		String invertido = "";

		for (int i = texto.length() - 1; i >= 0; i--) {
			invertido += texto.charAt(i);
		}

		System.out.println(invertido);

		sc.close();
	}

}
