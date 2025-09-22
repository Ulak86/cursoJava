package es.cursojava.inicio.oo.herencia.e21Hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Paciente extends Persona {

	private static final Logger log = LoggerFactory.getLogger(Paciente.class);

	private String[] sintomas;

	@Override
	public void comer() {
		log.info("Paciente {} comiendo en la cafetería", super.getNombre());
	}
}
