//Solicitar el número de alumnos que hay en una clase
//Por cada alumno pedir su nota y la guardas en una posición del array
//
//Con la información almacenada en el array indicar:
//+ cuantos alumnos han aprobado
//+ nota media de todos los alumnos
//MIRAR LA SOLUCION DEL PROFE QUE EN ELLA EXPLICA Y USA EL FOR EACH

package es.cursojava.inicio.arrays;

import java.util.Scanner;

public class EjerciArrays01 {

	public static void main(String[] args) {

		//Solicitar el número de alumnos que hay en una clase
		
		System.out.println("Dame el numero de alumnos");
		Scanner scan = new Scanner(System.in);
		int numAlumnos = scan.nextInt();
		
		double[] notas = new double[numAlumnos];
		
		//Por cada alumno pedir su nota y la guardas en una posición del array
		
		for (int i = 1; i<=numAlumnos ; i++ ) {
			System.out.println("Dame la nota del alumno " + i );
			scan = new Scanner(System.in);
			int nota = scan.nextInt();			
			notas[i-1] = nota;
		}
		

		//cuantos alumnos han aprobado
		//nota media de todos los alumnos

		int aprobados = 0;
		double media = 0;
		for (int i = notas.length; i>0 ; i-- ) {
		if ((notas[i-1]) >= 5) {	
			aprobados ++;
			}
		media = media + (notas[i-1]); 
		}		
		
		System.out.println("El numero de aprobados es: " + aprobados);
		media = media / numAlumnos;
		System.out.println("La nota media de la clase es: " + media);

//		colores[colores.length-1] int i = numAlumnos
		

		
	}

}
