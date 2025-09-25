package es.cursojava.inicio.utils;

import java.util.Scanner;

public class Utilidades {
	
	public static int calculaEdad (int anoNacimiento) {
		int edad = 2025 - anoNacimiento;
		return edad;
	}
	
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
