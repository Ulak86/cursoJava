//EJERCICIO 2
//
//Pintar los numeros pares aunmentando desde el 2 y los impares disminuyendo desde el 99
//2, 99
//4, 97
//... ...
//hasta el 100 hasta el 0 o 1 (no recuerda donde va acabar)

package es.cursojava.inicio.bucles.ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {

		int digit1 = 2;
		int digit2 = 99;
		System.out.println(digit1 + "," + digit2);

		for (int i = 0; i < 49; i++) {
	{
				digit1 = digit1 + 2;
				digit2 = digit2 - 2;
			}
			System.out.println(digit1 + "," + digit2);

		}
		System.out.println("Fin de ejecucion");

	}

}
