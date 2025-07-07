package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {

		String respuesta = "";
		int contador = 0;

//			En el bucle do while la variable a evaluar ha de estar definida fuera del bucle 

		do {

			System.out.println("Hola");
			System.out.println("Quieres continuar");
			Scanner scan = new Scanner(System.in);
			respuesta = scan.nextLine();

			if (contador == 2) {
				break;
			}
			
			contador++;
	
		} while (respuesta.equals("si"));

		System.out.println("Fin");

	}

}
