//Ejercicio 4
//==============================
//Escribe un programa que reciba un String con varias palabras separadas por espacios y determine cuál es la palabra más larga.

//
package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringEjer04 {

	public static void main(String[] args) {

		String texto = "En un lugar de La Mancha";

		int longitud = texto.length();

		int tamaño = 0;
		int tamañoMax = 0;
		String palabra = "";

//		boolean espacio = false;

		for (int i = longitud - 1; i > 0; i--) {

			if (texto.charAt(i) != ' ') {

				tamaño++;

			} else if (texto.charAt(i) == ' ') {

				if (tamaño > tamañoMax) {
					
					tamañoMax = tamaño;
					tamaño = 0;
					
					palabra = texto.substring(texto.length(),i);
					
					if (palabra.length>tamañoMax
				}
				
			}

		}
	}
}

//		System.out.println("Escribe una frase y pulsa enter");
//		Scanner scan = new Scanner(System.in);
//		String text = scan.nextLine();
//
//		int contadorA = 0, contadorB = 0, position1 = 0, position2 = 0;
//////		String palabra = "";
//
//		for (int i = text.length(); i >= 0; i--) {
//			
//			if (text.charAt(i-1) != ' ') {
//				contadorB++;
//			} else if (text.charAt(i-1) == ' ') {
//				contadorB = 0;
//			}
//			
//		}
//		for (int i = text.length(); i > 0; i--) {
//			if (text.charAt(i - 1) != ' ') {
//				contadorB++;
//				if (contadorA < contadorB) {
//					contadorA = contadorB;
//					contadorB = 0;
//				}
//			}
//		
//		}
//		System.out.println("La palabra mas larga tiene " + contadorA + " letras");
//
////			("La segunda e está en " + cadena.indexOf("e", cadena.indexOf("e") + 1));
////		
////		int position1 = 0, position2 =0;
////		
////		position2 = text.indexOf(" ");
////		
////		String palabra = (text.substring(position1, position2));
////		
////		System.out.println(palabra);
//
//	}
//}
