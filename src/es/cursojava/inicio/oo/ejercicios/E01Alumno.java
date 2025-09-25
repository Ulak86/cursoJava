//crear clase Alumno con los atributos
//+nombre
//+dni
//+notaMedia
//+asignaturas
//
//Crear método estudiar(){
//Debe mostrar:
//"El estudiante <nombre> tiene las asignaturas …
//y si notaMedia<5 ha estudiado poco
//  si notaMedia>5 ha estudiado mucho
//  si notaMedia>9 es un genio"
//
//}
//
//Crear clase Colegio en el main crear 3 alumnos y ponerlos a estudiar
//
//crear método estudiarAlumnos al que le pasais los 3 alumnos y se pone a todos a estudiar

package es.cursojava.inicio.oo.ejercicios;

public class E01Alumno {

	private String nombre;
	private String dni;
	private double notaMedia;
	private String[] asignaturas;

	
	public E01Alumno() {
	}
	
	public E01Alumno(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public E01Alumno(String nombre, String dni, double notaMedia, String[] asignaturas) {
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.asignaturas = asignaturas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public double getNotaMedia() {
		return notaMedia;
	}


	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}


	public String[] getAsignaturas() {
		return asignaturas;
	}


	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}


	public void estudiar() {

		String stringAsignaturas = "";

		for (String string : this.asignaturas) {
			stringAsignaturas = stringAsignaturas + string + ", ";
		}

		String estudiado = "";

		if (this.notaMedia < 5) {
			estudiado = "ha estudiado poco";
		} else if (this.notaMedia > 9) {
			estudiado = "es un genio";
		} else if (this.notaMedia >= 5) {
			estudiado = "ha estudiado mucho";
		}

		System.out.println("El estudiante " + this.nombre + " tiene las asignaturas " + stringAsignaturas + estudiado + ".");
	}
	

}
