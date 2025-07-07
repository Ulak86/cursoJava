//4. Mostrar todas las tablas de multiplicar hasta el número que solicites al usuario

package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		System.out.println("Dame el numero");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = num, tabla = 1; i > 0; i--, tabla++) {
			System.out.println("Tabla del " + tabla);
			{
				for (int i2 = 1; i2 < 11; i2++)
					System.out.println(tabla + "x" + i2 + "=" + tabla * i2);
			}
			System.out.println();
		}
	}

}
