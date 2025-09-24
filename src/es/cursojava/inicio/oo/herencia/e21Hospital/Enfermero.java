package es.cursojava.inicio.oo.herencia.e21Hospital;

public class Enfermero extends EmpleadoHospital {

	private int planta;

	
	public Enfermero(String nombre, int edad, String turno, int planta) {
		super(nombre, edad, turno);
		this.planta = planta;
	}

	public void atenderPaciente() {

	}
}
