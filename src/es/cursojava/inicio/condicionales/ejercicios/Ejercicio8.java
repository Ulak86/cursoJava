//8. Numero tenistas en el top 10 --> 
//+ Pedir por teclado la cantidad de tenistas que se apuntan a un torneo, 
//+ por cada uno de ellos preguntar en que puesto de la ATP se encuentran. 
//+ Indicar cuantos tenistas estarían entre los diez primeros.

package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] Args) {

		int tenistas = 0;
		int puesto = 0;
		int top10 = 0;

		System.out.println("Cuantos tenistas se apuntan al torneo?");
		Scanner scan = new Scanner(System.in);
		tenistas = scan.nextInt();

		for (int i = tenistas; i > 0; i--) {
			System.out.println("En que puesto del ATP se encuentra el tenista " + i);
			scan = new Scanner(System.in);
			puesto = scan.nextInt();

			if (puesto < 11) {
				top10++;
			}
		}

		System.out.println("Hay " + top10 + " tenista de este torneo en el top 10");
	}

}