//Ejercicio 3
//==============================
//Crea un programa que cuente cuántas vocales (a, e, i, o, u) tiene un String. Ignora las mayúsculas y minúsculas.

package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringsEjer03 {
	public static void main(String[] args) {

		System.out.println("Escribe y pulsa enter");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();

		text = text.toLowerCase();

		int vowels = 0;

//		Asignar el caracter a una variable ne el for
		for (int i = text.length(); i > 0; i--) {
			char esteCar = text.charAt(i - 1);
			if ((esteCar == 'a') || (esteCar == 'e') || (esteCar == 'i')
					|| (esteCar == 'o') || (esteCar == 'u')) {
				vowels++;
			}
			;
			
		}
		
		System.out.println("El texto: '" + text + "' contiene " + vowels + " vocales");
	}

}
