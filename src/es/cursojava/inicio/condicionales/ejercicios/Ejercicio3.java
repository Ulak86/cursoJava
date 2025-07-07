package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main (String [] args) {
		
		System.out.println("Esto es una calculadora que permite ejecutar las operaciones de suma, resta, multiplicacion o division entre 2 numeros");
	
		System.out.println("Dame el primer valor de la operacion que quieres realizar");
		Scanner scan = new Scanner(System.in);
		double valor1 = scan.nextDouble();
		
		System.out.println("Dame el segundo valor de la operacion que quieres realizar");	
		scan = new Scanner(System.in);
		double valor2 = scan.nextDouble();
		
		System.out.println("Dime que operacion quieres que ejecute con esos valores");	
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		scan = new Scanner(System.in);
		int operacionSeleccionada = scan.nextInt();
		
		if (operacionSeleccionada==0 ||operacionSeleccionada>4) {
			System.out.println("La opcion seleccionada no existe, has de volver a empezar");}
		
//		aqui pare de escribir mi version porque el profesor mostro la siguiente que es mejor y cubre el ejercicio 
//		de comparar strings con operacion.equals
//		Esto es un metodo mejor

		System.out.println("Introduce un número");
		scan = new Scanner(System.in);
		int numero1 = scan.nextInt();
			
		System.out.println("Introduce un número");
		scan = new Scanner(System.in);
		int numero2 = scan.nextInt();
		
		System.out.println("Introduce la operacion");
		scan = new Scanner(System.in);
		String operacion = scan.nextLine();
		
		int resultado = 0;
		if(operacion.equals("+") || operacion.equalsIgnoreCase("suma")) {
			resultado = numero1 + numero2;
		}else if(operacion.equals("-") || operacion.equalsIgnoreCase("resta")) {
			resultado = numero1 - numero2;
		}else if(operacion.equals("x") || operacion.equalsIgnoreCase("multiplica")) {
			resultado = numero1 * numero2;
		}else if(operacion.equals("/") || operacion.equalsIgnoreCase("divide")) {
			resultado = numero1 / numero2;
		}else
			System.out.println("Operacion no permitida");
	}
	
}

//EJERCICIO 3
//===============================================
//Pedir dos numeros y pedir la operación que se quiere realizar ("suma o +", resta o - ,*,/)  nextLine
//
//Mostrar el resultado de la operación con los dos números