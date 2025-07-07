package es.cursojava.inicio.condicionales;

import java.util.Scanner;

public class CondicionalesSwitch {

	public static void main(String[] args) {

		String mes = "octubre";
		
		switch (mes) {
		
		case "enero" :
		case "febrero" :
		case "marzo" : System.out.println("Invierno");break;
		case "abril" : 
		case "mayo" : System.out.println("Primavera");break;
		case "junio" : 
		case "julio" :
		case "agosto" : 
		case "septiembre" : System.out.println("Verano");break;
		case "octubre" : System.out.println("Otoño");
		case "noviembre" : System.out.println("Otoño");
		case "diciembre" : System.out.println("Otoño");break;
		default : System.out.println("Mes incorrecto");
		
//		octubre imprimiria hasta el siguiente break
		
		}

		System.out.println("Fin de ejecucion switch clasico");
		
		System.out.println("Escribe un numero entre el 1 y el 7");


			
		}
	
}
