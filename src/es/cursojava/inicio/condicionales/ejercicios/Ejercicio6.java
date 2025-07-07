//6. Conjetura Collatz
//Solicitar un numero:
//+Si el numero es par, se divide entre dos
//+Si es impar se multiplicar por 3 y se le suma 1
//se repite hasta que el valor del numero es 1

package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] Args) {

		int num = 0;

		System.out.println(
				"Este programa te mostrara la progresion numerica de Collatz para el numero que tu me des a continuacion");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

		while (num > 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = num * 3 + 1;
			}
			System.out.print(num + " ");

		}
	}

}
