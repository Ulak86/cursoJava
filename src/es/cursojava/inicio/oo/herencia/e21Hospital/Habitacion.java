package es.cursojava.inicio.oo.herencia.e21Hospital;

public class Habitacion {

	private static int contador = 1;

	private int habitacion;
	private Enfermo enfermo;

	public Habitacion(Enfermo enfermo) {

		this.habitacion = contador++;
		this.enfermo = enfermo;
	}

	public void setEnfermo(Enfermo enfermo) {
		this.enfermo = enfermo;
	}

	
}
