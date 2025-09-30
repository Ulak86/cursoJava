package es.cursojava.inicio.interfaces.e02encendiblesyapagables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pan extends Alimentos implements Consultable {

	private static final Logger log = LoggerFactory.getLogger(Pan.class);

	public Pan(String nombre, double precio, int id, String fechaCaducidad) {
		super(nombre, precio, id, fechaCaducidad);
	}

	@Override
	public void select() {
		log.info("Consultando por ID {}", super.getId());
	}

}
