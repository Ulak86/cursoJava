package es.cursojava.inicio.condicionales.ejercicios;

public class Ejercicio2 {
	
	public static void main (String [] args) {
		
		String asignatura = "POO";
		String nombreAlumno = "Marcos";
		int nota  = (int) (Math.random()*10);
		
		System.out.println(nota);

//		mi solucion
		
		if (nota<5) {
			System.out.println("El alumno " + nombreAlumno + " tiene un suspenso en " + asignatura);
		} else if (nota<7) {
			System.out.println("El alumno " + nombreAlumno + " tiene un aprobado en " + asignatura);
		} else if (nota<9) {
			System.out.println("El alumno " + nombreAlumno + " tiene un notable en " + asignatura);
		} else {
			System.out.println("El alumno " + nombreAlumno + " tiene un sobresaliente en " + asignatura);
		}
		
//		otro modo mejor:
		
		String notaFinal= "";

		if (nota<5) {
			notaFinal= "suspenso";
		} else if (nota<7) {
			notaFinal= "aprobado";
		} else if (nota<9) {
			notaFinal= "notable";
		} else {
			notaFinal= "sobresaliente";
		}
		
		{System.out.println("El alumno " + nombreAlumno + " tiene un " + notaFinal + " en " + asignatura);}
		
		}

}


//+ Declarar la variables asignatura de tipo String, nombreAlumno de tipo String y nota de tipo int 
//+ Inicializar las variables con valores inventados
//+ El resultado a mostrar sería: El alumno Juan en la asignatura Matemáticas tiene un Notable
//
//0 <5 suspenso
//5 <7 aprobado
//7 <9 notable
//9-10 sobresaliente