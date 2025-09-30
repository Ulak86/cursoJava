package es.cursojava.inicio.interfaces.e02encendiblesyapagables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Batidora extends ProductosElectronicos implements Consultable, Insertable, Updateable {

	private static final Logger log = LoggerFactory.getLogger(Batidora.class);

	public Batidora(String nombre, double precio, int id, String fechaFabricacion) {
		super(nombre, precio, id, fechaFabricacion);
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
