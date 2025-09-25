package es.cursojava.inicio.metodos;

import es.cursojava.inicio.utils.Utilidades;

public class Metodos {

	public static void main(String[] args) {

		System.out.println("Empieza");
		metodo1();
		MetodoSaludar.saludar("Paco");
		Utilidades.calculaEdad(1987);
		int edad = Utilidades.calculaEdad(1987);
		System.out.println(edad);
		
		System.out.println("Termina");	
		
		
	}

	public static void metodo1 () {
		
		System.out.println("Hola, soy el metodo 1");		
	}
	
	public static void metodo2 (String nombre) {
		
		System.out.println(nombre);
		
	}
	
	public static void metodo3 (int numero) {
		
		System.out.println(numero);
		numero = 7;
		System.out.println(numero);
		
	}
}
