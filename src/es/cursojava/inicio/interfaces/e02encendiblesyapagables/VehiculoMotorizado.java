package es.cursojava.inicio.interfaces.e02encendiblesyapagables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class VehiculoMotorizado extends Vehiculo implements Apagable, Encendible {

	private static final Logger log = LoggerFactory.getLogger(VehiculoMotorizado.class);

	private String motor;

	public VehiculoMotorizado(int id, String motor) {
		super(id);
		this.motor = motor;
	}

	@Override
	public void encender() {
		log.info("Encendiendo {}", this.getClass().getSimpleName());

	}

	@Override
	public void apagar() {
		log.info("Apagando {}", this.getClass().getSimpleName());

	}

	public String getMotor() {
		return motor;
	}

}
