//Ejercicio 1
//==============================
//Escribe un programa que reciba un String y devuelva el texto invertido.


package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringsEjer01 {

	public static void main(String[] args) {

			System.out.println("Escribe una frase y pulsa enter");
			Scanner scan = new Scanner(System.in);
			String alDerecho = scan.nextLine();
			
			System.out.println(alDerecho);
			System.out.println(alDerecho);		
			for  (int i = alDerecho.length(); i>0; i--) {
				System.out.print(alDerecho.charAt(i-1));
			}
			
			
			
	}

}
