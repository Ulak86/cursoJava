/**
 * Ejercicio 3
 * 
 * Crea un programa que cuente cuántas vocales (a, e, i, o, u) tiene un String. 
 * Ignora las mayúsculas y minúsculas.
 */

package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class E03ContadorVocales {

	public static void main(String[] args) {
		System.out.println("Dame una palabra");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine().toLowerCase();
	
		int vocales = 0;

		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
				vocales++;
		}

		System.out.println(texto + " contiene " + vocales + " vocales");
		
		sc.close();
	}
}
