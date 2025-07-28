/**
 * Ejercicio 4
 * 
 * Escribe un programa que reciba un String con varias palabras separadas por espacios 
 * y determine cuál es la palabra más larga.
 */

package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class E04PalabraMasLarga {

	public static void main(String[] args) {

		System.out.println("Dame una palabra");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine().toLowerCase();

		String larga = "";

		larga = texto.substring(texto.lastIndexOf(' ')+1);

		texto = texto.substring(0, texto.lastIndexOf(' '));
		
		System.out.println(larga + larga.length());
		System.out.println(texto + texto.length());
		
		if (larga.length() > texto.length()) { 
			
			
			
		}
//		for (int i = 0; i< texto.length()-1 ; i++){
//			
//			larga = texto.substring(texto.lastIndexOf(' '));
//			
//			texto = texto.substring(0, texto.lastIndexOf(' '));
//			
//			
//			if (larga.length()>texto.length()) {

	}

}
