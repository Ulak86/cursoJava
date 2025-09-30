package es.cursojava.inicio.interfaces.e02encendiblesyapagables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Coche extends VehiculoMotorizado implements Consultable, Insertable, Updateable {
	
	private static final Logger log = LoggerFactory.getLogger(Coche.class);

	public Coche(int id, String motor) {
		super(id, motor);
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

}
