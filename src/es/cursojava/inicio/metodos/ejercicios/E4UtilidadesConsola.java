//Ejercicio 4
//====================================================================================
//EN la clase Utilidades crear métodos:
//
//+ pintaMenu le vamos a pasar un array de Strings y nos va a mostrar 
//todas las opciones que vengan en el array 
//y al final va a pintar "Introduce una opción"
//
//+ pintaMenu le vamos a pasar un array de Strings y un String texto. 
//Nos va a mostrar todas las opciones que vengan en el array 
//y al final nos va pintar el contenido de la variable texto
//
//+ pideDatoNumerico al que le pasamos un String denominado Texto. 
//El método tiene que pintar el texto que le pasamos, recoger un dato numérico (int) 
//por la consola y devolver el dato que se ha introducido
//
//+ pideDatoCadena al que le pasamos un String denominado Texto. 
//El método tiene que pintar el texto que le pasamos, recoger un dato (String)  
//por la consola y devolver el dato que se ha introducido

package es.cursojava.inicio.metodos.ejercicios;

import java.util.Scanner;

public class E4UtilidadesConsola {

	public static void pintaMenu(String[] menuStringArray) {

		pintaMenu(menuStringArray, "Select an option");

	}

	public static void pintaMenu(String[] menuStringArray, String stringLinea) {

		System.out.println(stringLinea);

		for (String linea : menuStringArray) {
			System.out.println(linea);
		}

	}

	public static int pideDatoNumerico(String texto) {

		System.out.println(texto);
		Scanner sc = new Scanner(System.in);
		int intIntroducido = sc.nextInt();
		sc.nextLine();
		return intIntroducido;
	}

	public static String pideDatoCadena(String texto) {

		System.out.println(texto);
		Scanner sc = new Scanner(System.in);
		String strIntroducido = sc.nextLine();
		return strIntroducido;
	}

}
