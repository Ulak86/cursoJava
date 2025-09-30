package es.cursojava.inicio.interfaces.e02encendiblesyapagables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bicicleta extends Vehiculo implements Consultable, Deleteable {

	private static final Logger log = LoggerFactory.getLogger(Coche.class);

	private int numMarchas;

	public Bicicleta(int id, int numMarchas) {
		super(id);
		this.numMarchas = numMarchas;
	}

	@Override
	public void update() {
		log.info("Actualizando con ID {}", super.getId());

	}

	@Override
	public void insert() {
		log.info("Insertando con ID {}", super.getId());

	}

	@Override
	public void select() {
		log.info("Consultando con ID {}", super.getId());

	}

	@Override
	public void delete() {
		log.info("Eliminando con ID {}", super.getId());

	}

}
