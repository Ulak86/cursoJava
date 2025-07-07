package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main (String [] args) {
		
//	+ Clase donde se solicite un número y se diga si el número es par o impar	
	
	System.out.println("Introduce un numero y evaluare si es o no par");
	Scanner scan = new Scanner(System.in);
	int numero = scan.nextInt();
	
//	!= es distinto de
	
			
	if (numero%2==0) {
		System.out.println("El numero " + numero + " es par");
	} else  {
		System.out.println("El numero " + numero + " es impar");
	}
	
	boolean resultadoCero = numero%2==0;
	
	if(!resultadoCero) {
		System.out.println("El numero " + numero +  " es impar");
	} else
		System.out.println("El numero " + numero +  " es par");
	}
}

