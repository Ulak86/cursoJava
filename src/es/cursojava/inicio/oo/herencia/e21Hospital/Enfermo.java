package es.cursojava.inicio.oo.herencia.e21Hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Enfermo extends Persona {

	private static final Logger log = LoggerFactory.getLogger(Enfermo.class);

	private String enfermedad;

	
	public Enfermo(String nombre, int edad, String enfermedad) {
		super(nombre, edad);
		this.enfermedad = enfermedad;
	}


	@Override
	public void comer() {
		log.info("Enfermo {} comiendo en la habitacion", super.getNombre());
	}
}
