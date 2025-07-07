package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

public class PideDatos {
	
	public static void main (String [] args) {
		
		System.out.println("Introduce tus calle");
		Scanner scan = new Scanner(System.in);
		String nombreCalle = scan.nextLine();
		
		System.out.println("Introduce el numero de edificio");
		scan = new Scanner(System.in);
		int numeroCalle = scan.nextInt();
		
		System.out.println("Introduce el nombre de la poblacion");
		scan = new Scanner(System.in);
		String poblacion = scan.nextLine();


		System.out.println("La direccion es: Calle " + nombreCalle + " Numero: " + numeroCalle + " Poblacion: " + poblacion);
		
		boolean laCalleEsGrande = numeroCalle>100;
		
		System.out.println("La afirmacio la calle es grande es " + laCalleEsGrande);
		
		double aleatorio = Math.random();
		boolean evaluacionDelNumeroAleatorio = aleatorio>0.5; 
		System.out.println("La afirmacion el numero aleatorio es mayor que 0.5 es " + evaluacionDelNumeroAleatorio);
		
		//la siguiente linea usa el operador modulo para evaluar si un numero es par
		System.out.println("El numero de calle es par " + (numeroCalle%2==0));
		
		//operador ++ vs operador suma
		numeroCalle=7;
		System.out.println(numeroCalle);
		
		numeroCalle=numeroCalle+1;
		System.out.println(numeroCalle);
		
		numeroCalle += 1;
		System.out.println(numeroCalle);
		
		System.out.println(numeroCalle++);
		System.out.println(numeroCalle);
		System.out.println(++numeroCalle);
		
		double numeroAleatorio = Math.random();
		System.out.println(numeroAleatorio);
		System.out.println("Es mayor de 0,5" + (numeroAleatorio>0.5));
		
//		Cada vez que invoco Math.random() genera un numero nuevo
//		Si hiciera lo siguiente, la evaluacion del segundo parentesis de la siguiente linea la haria sobre el segundo numero generado
//		System.out.println(Math.random());
//		System.out.println("Es mayor de 0,5" + (Math.random()>0.5));
		
		/*todas las expresiones que siguen son validas
		numeroCalle += 1;
		numeroCalle -= 1;
		numeroCalle *= 1;
		numeroCalle /= 1;
		=====
		Con el formato que sigue solo es valido en suma y resta
		numeroCalle++;
		++numeroCalle;
		numeroCalle--;
		--numeroCalle;
		 */
	};
}
