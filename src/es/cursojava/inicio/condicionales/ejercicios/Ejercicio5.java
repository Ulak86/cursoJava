package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		System.out.println("Esta herramienta calcula el coste de tu llamada");
		System.out.println("Para ello, introduce los siguientes datos:");
		System.out.println("Duracion de la llamada en minutos");
		Scanner scan = new Scanner(System.in);
		int duracionLlamada = scan.nextInt();

		System.out.println("Selecciona dia de la semana en el que se hizo la llamada");
		System.out.println("1. L");
		System.out.println("2. M");
		System.out.println("3. X");
		System.out.println("4. J");
		System.out.println("5. V");
		System.out.println("6. S");
		System.out.println("7. D");
		scan = new Scanner(System.in);
		int diaDeLaSemana = scan.nextInt();


		double costePreTax = 0;
		double costePostTax = 0;

		if (duracionLlamada <= 5) {
			costePreTax = 1;
		} else if (duracionLlamada < 8) {
			costePreTax = 1.8;
		} else if (duracionLlamada <= 10) {
			costePreTax = 2.15;
		} else if (duracionLlamada > 10) {
			costePreTax = (2.15 + (duracionLlamada - 10) * 0.50);
		}
		
		
		if (diaDeLaSemana == 7) {
			costePostTax = (costePreTax + (costePreTax / 100) * 3);
		}else {
			System.out.println("Indica la hora del dia a la que comenzo la llamada usando un numero entre el 0 y el 23");
			scan = new Scanner(System.in);
			int horaInicioLlamada = scan.nextInt();
			if (horaInicioLlamada < 12 && horaInicioLlamada >= 6) {
				costePostTax = costePreTax + (costePreTax / 100) * 15;
			} else if (horaInicioLlamada < 23 && horaInicioLlamada >= 12) {
				costePostTax = costePreTax + (costePreTax / 100) * 10;
			} else if (horaInicioLlamada < 6 && horaInicioLlamada >= 23) {
				costePostTax = costePreTax + (((costePreTax / 100) * 10) * -1);
			}
			
		}


		System.out.println("El coste de la llamada fue de " + costePostTax);

	}

}
//EJERCICIO 5
//===============================================
//Herramienta para calcular el precio de una llamada
//Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, 
//de tal forma que:
//
//+ los primeros cinco minutos cuestan 1€, 
//+ los siguientes 3 minutos, 80 céntimos, 
//+ los siguientes dos minutos a 70 céntimos 
//+ y a partir del décimo minuto, 50 céntimos cada minuto.
//
//Se carga un impuesto del 3% cuando es domingo, 
//y si es otro día, 
//	en turno de mañana 15% (6-12)
//	y en turno de tarde 10%. (12-23)
//	y en turno de noche -10%. (23-6)
//
//Solicitar tiempo de llamada, dia de la semana y hora y calcular el coste de la llamada
//
//
//Acciones:
//Crear una condición que indique que mientras la cantidad de minutos sea mayor a 0 y menor a 5 el coste sea 1 euro. 
//Crear una condición que indique que si la llamada dura más de 5 minutos y menos de 8, el costo de los minutos 6, 7 y 8 sea de 80 céntimos.
//Crear una condición que indique que si la llamada dura más de 8 minutos y menos y hasta 10, el costo de los minutos 9 y 10 sea de 70 céntimos.
//Crear una condición que indique que si la llamada dura más de 10 minutos cada minuto valga 50 céntimos.
//Crear una condición que indique que si la llamada se hace el día domingo la llamada tenga un impuesto derl 3%
//Crear una condición que indique que si la llamada se hace en un día diferente al domingo se aplique:
//15% turno de 06:00am a 12:00m; 10% turno de 12:00m a 23:00pm; -10% turno de 23:00am a 05:59am; 
