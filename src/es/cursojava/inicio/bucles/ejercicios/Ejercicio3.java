///Pedir 10 numeros --> Indicar cuantos son multiplos de 3 y cuantos multiplos de 5

package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] arg) {

		int multiplos3 = 0; 
		int multiplos5 = 0;

		int i = 10;
		while (i > 0) {
			System.out.println("Dame un numero");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			if (num % 3 == 0) {
				multiplos3++;
				
			} 

//			Un else if estaria mal porque un multiplo de 3 y de 5 no seria evaluado en la siguiente linea
			
			if (num % 5 == 0) {
				multiplos5++;
			}
			i--;
		}

		System.out.println("Multiplos de 3: " + multiplos3 + ", multiplos de 5: " + multiplos5);

	}

}
