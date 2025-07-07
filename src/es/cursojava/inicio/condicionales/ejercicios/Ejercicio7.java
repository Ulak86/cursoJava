//7. Solicitar por consola el numero de números de la serie 
//de Fibonacci que se quieren mostrar
//Serie de Fibonacci: 0,1,1,2,3,5,8,13,21,34,55,....

package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] Args) {

		int num = 0;
		int fibo = 1;
		int nextFibo = 1;
		int argh = 1;

		System.out.println("Dame el numero");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

		if (num == 1) {
			System.out.print("0");
		}

		else if (num >= 2) {
			System.out.print("0 1 ");

			if (num > 2) {

				num = num - 3;

				System.out.print(fibo + " ");
				for (int i = num; num > 0; num--) {

					nextFibo = argh + nextFibo;
					System.out.print(nextFibo + " ");
					argh = fibo;
					fibo = nextFibo;

				}
			}

		}

		System.out.println();

		int a = 0;
		int b = 1;
		int fib = 0;

		System.out.println("Dame el numero");
		scan = new Scanner(System.in);
		num = scan.nextInt();

		System.out.print(a + " " + b + " ");

		num = num - 2;

		while (num > 0) {
			fib = a + b;
			System.out.print(fib + " ");
			a = b;
			b = fib;
			num--;
		}

	}

}
