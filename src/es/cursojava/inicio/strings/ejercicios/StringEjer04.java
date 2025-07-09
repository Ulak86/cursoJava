//Ejercicio 4
//==============================
//Escribe un programa que reciba un String con varias palabras separadas por espacios y determine cuál es la palabra más larga.

package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringEjer04 {

	public static void main(String[] args) {

		System.out.println("Escribe una frase y pulsa enter");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();

		int contadorA = 0, contadorB = 0;
		String palabra = "";

		
		for (int i = text.length(); i > 0; i--) {
			if (text.charAt(i - 1) != ' ') {
				contadorB++;
				if (contadorA < contadorB) {
					contadorA = contadorB;
					contadorB = 0;
				}
			}

			
		}
		System.out.println(palabra + "es la palabra mas larga tiene " + contadorA + " letras");

	}
}
