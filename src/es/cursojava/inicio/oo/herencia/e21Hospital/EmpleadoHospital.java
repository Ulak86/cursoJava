package es.cursojava.inicio.oo.herencia.e21Hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpleadoHospital extends Persona {

	private static final Logger log = LoggerFactory.getLogger(Paciente.class);

	private String turno;

	public void fichar() {
		log.info("El empleado {} esta fichando", super.getNombre());
	}

	@Override
	public void comer() {
		log.info("El empleado {} esta comiendo en el comedor", super.getNombre());
	}
}
