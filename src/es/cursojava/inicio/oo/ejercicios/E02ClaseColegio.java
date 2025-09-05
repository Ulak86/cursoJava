package es.cursojava.inicio.oo.ejercicios;

public class E02ClaseColegio {

	public static void main(String[] args) {
		
		String[] asignaturasClase = new String[] {"Matematicas", "Lengua","Geografia"};
		
		E01Alumno alumno1 = new E01Alumno();

		alumno1.setNombre("Marcos");
		alumno1.setDni("523111A");
		alumno1.setNotaMedia(4.4);
		alumno1.setAsignaturas(asignaturasClase);
		
		E01Alumno alumno2 = new E01Alumno();

		alumno2.setNombre("Luisa");
		alumno2.setDni("111523A");
		alumno2.setNotaMedia(7.8);
		alumno2.setAsignaturas(asignaturasClase);
		
		E01Alumno alumno3 = new E01Alumno();

		alumno3.setNombre("Julian");
		alumno3.setDni("188883A");
		alumno3.setNotaMedia(9.8);
		alumno3.setAsignaturas(asignaturasClase);
		
		alumno1.estudiar();
		alumno2.estudiar();
		alumno3.estudiar();
		
	
		E01Alumno alumno4 = new E01Alumno("Marta","199993A");

		E01Alumno alumno5 = new E01Alumno("Maria","177773A");
		
		E01Alumno alumno6 = new E01Alumno("Jorge","399993A",3.2,new String[] {"Lengua","Matemáticas"});

		E01Alumno alumno7 = new E01Alumno("Manolo","377773A",8.2,new String[] {"Musica","Educacion Fisica"});

		E01Alumno[] alumnos = new E01Alumno[] {alumno1, alumno2, alumno3, alumno6, alumno7};
		
		estudiarAlumnos(alumnos);
		
		}
	
	public static void estudiarAlumnos (E01Alumno[] alumnos) {
		for (E01Alumno e01Alumno : alumnos) {
			e01Alumno.estudiar();
		}
	}
}