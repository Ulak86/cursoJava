package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int saldo = 500;
		int numApuesta = 0;
		int cantApuesta = 0;
		int seguir = 1;
		int juego = 0;
		int par = 0;

		while (saldo > 0 && seguir == 1) {
			System.out.println(
					"¿A que quieres jugar?" + "\n" + "1. Numeros" + "\n" + "2. Par/Impar " + "\n" + "3. Bloques");
			Scanner scan = new Scanner(System.in);
			juego = scan.nextInt();

			if (juego == 2) {
				System.out.println("¿A que quieres apostar?" + "\n" + "1. Pares" + "\n" + "2. Impares ");
				scan = new Scanner(System.in);
				par = scan.nextInt();
			} else {
				System.out.println("¿Por qué numero quieres apostar?");
				scan = new Scanner(System.in);
				numApuesta = scan.nextInt();
			}

			System.out.println("¿Cuánto dinero quieres apostar?");
			scan = new Scanner(System.in);
			cantApuesta = scan.nextInt();
			saldo -= cantApuesta;

			if (cantApuesta > saldo) {
				System.out.println("No puedes apostar mas de lo que tienes");
			} else {
				int ruleta = (int) (Math.random() * 37);
				System.out.println("Resultado ruleta: " + ruleta);

				if (ruleta == numApuesta && juego == 1) {
					saldo = saldo + (cantApuesta * 36);
				} else if (ruleta % 2 == 0 && ruleta != 00 && juego == 2 && par == 1) {
					saldo = saldo + (cantApuesta * 2);
				} else if (((ruleta < 13) && (numApuesta < 13)
						|| ((ruleta > 13) && (ruleta < 24)) && ((numApuesta > 13) && (numApuesta < 24))
						|| (ruleta > 24) && (ruleta > 24)) && (juego == 2)) {
					saldo = saldo + (cantApuesta * 5);
				} else {
					saldo = saldo - cantApuesta;
				}
			}
			if (saldo > 0) {
				System.out.println("Quieres seguir jugando?" + "\n" + "1. Si" + "\n" + "2. No");
				scan = new Scanner(System.in);
				seguir = scan.nextInt();
				if (seguir == 2) {
					System.out.println("Tu saldo actual es: " + saldo);
				}
			} else {
				System.out.println("Te has quedado sin saldo");
			}

		}
	}
}

//============================
//Ruleta
//============================
//
//Facil
//============================
//saldo = 500
//
//¿Por qué numero quieres apostar? (0-36) 
//Si es otro numero numero se vuelve a formular la pregunta
//
//¿Cuánto dinero quieres apostar? 
//Si el importe de la apuesta es > que el saldo disponible por el usuario,
//se notifica y se vuelve a formular la pregunta
//
//De manera aleatoria generar un nº entre 0 y 36
//
//Si el numero apostado es = al nº aleatorio, se multiplica lo apostado *36 y se suma al saldo no apostado
//Si no lo es le restamos del saldo la cantidad apostada
//
//Si tiene saldo le perguntamos ¿Quieres seguir jugando? si dice que no le indicamos el saldo con el que se va y si no tiene saldo le indicamos que se ha quedado sin dinero.
//
//
//Dificil
//============================
//Preguntar a qué juego quiere jugar (Número,Par/Impar,Bloques)
//
//+ Si la apuesta es par/impar y se gana, se multiplica lo apostado *2
//+ Si la apuesta es Bloques y se gana, se multiplica lo apostado *5 (1-12,13-24,25-36)
//
