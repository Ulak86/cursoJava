//En una clase 
//+ Escribe un método que pinte la tabla de multiplicar de un numero que le pases
//+ Escribe un método que pinte las tablas de multiplicar de los números que estén entre dos números que le pases
//+ Desde el main llamar a los dos métodos

package es.cursojava.inicio.metodos.ejercicios;

import java.util.Scanner;

public class E1TablasDeMultiplicarConMétodos {

	public static void tablaUnica(int numeroTabla) {

		int i = 1;

		while (i <= 10) {
			int resultadoTablaUnica = numeroTabla * i;
			System.out.println(numeroTabla + " por " + i + " = " + resultadoTablaUnica);
			i++;
		}

		System.out.println();

	}

	public static void tablaMultiple(int numero1, int numero2) {

		int numeroParaMetodo = numero1;

		while (numeroParaMetodo <= numero2) {
			int numeroParaMetodoTabla = numeroParaMetodo;
			tablaUnica(numeroParaMetodoTabla);
			numeroParaMetodo++;
		}

	}

	public static void main(String[] args) {

		System.out.println(
				"Este programa te imprime o bien la tabla de un solo numero o bien las tablas de 2 numero y todos lo que hay entre ellos\nSelecciona la opcion deseada:\n1. Tabla de 1 solo numero \n2. Tablas de 2 numeros y todos lo que hay entre ellos");

		Scanner sc = new Scanner(System.in);
		int seleccion = sc.nextInt();
		sc.nextLine();

		switch (seleccion) {

		case 1 -> {

			System.out.println("Dame el numero para el que quieres su tabla");
			sc = new Scanner(System.in);
			int numeroSolo = sc.nextInt();
			sc.nextLine();

			tablaUnica(numeroSolo);

		}
		
		case 2 -> {
			
			System.out.println("Dame el primer numero para el que quieres su tabla");
			sc = new Scanner(System.in);
			int numeroPrimero = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Dame el ultimo numero para el que quieres su tabla");
			int numeroSegundo = sc.nextInt();
			sc.nextLine();
			
			tablaMultiple(numeroPrimero, numeroSegundo);
		}
		}

		sc.close();

	}

}
