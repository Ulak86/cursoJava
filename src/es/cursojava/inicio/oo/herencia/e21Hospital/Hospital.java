package es.cursojava.inicio.oo.herencia.e21Hospital;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hospital {

	private static final Logger log = LoggerFactory.getLogger(Paciente.class);

	private String nombre;
	private Habitacion[] habitaciones = new Habitacion[2];
	private Paciente[] salaDeEspera = new Paciente[3];
	private EmpleadoHospital[] empleadosHospital = new EmpleadoHospital[2];

	public Hospital(String nombre, Habitacion[] habitacion, Paciente[] salaDeEspera,
			EmpleadoHospital[] empleadoHospital) {
		this.nombre = nombre;
		this.habitaciones = habitacion;
		this.salaDeEspera = salaDeEspera;
		this.empleadosHospital = empleadoHospital;
	}

	public static Hospital abrirHospital() {

		Habitacion habitacion1 = new Habitacion(null);
		Habitacion habitacion2 = new Habitacion(null);

		Habitacion[] habitaciones = { habitacion1, habitacion2 };

		String[] sintomasLeves = { "dolor de cabeza", "cansancio", "congestión nasal" };
		String[] sintomasModerados = { "fiebre", "tos seca", "dolor muscular" };
		String[] sintomasGraves = { "dificultad para respirar", "dolor en el pecho", "pérdida del conocimiento" };

		Paciente paciente1 = new Paciente("Ana", 28, sintomasLeves);
		Paciente paciente2 = new Paciente("Carlos", 45, sintomasModerados);
		Paciente paciente3 = new Paciente("María", 60, sintomasGraves);

		Paciente[] salaDeEspera = { paciente1, paciente2, paciente3 };

		Enfermero enfermero1 = new Enfermero("Laura", 30, "Turno de noche", 3);

		Doctor doctor1 = new Doctor("Dr. Gómez", 45, "Turno de mañana", "General");

		EmpleadoHospital[] empleadoHospital = { enfermero1, doctor1 };

		return new Hospital("Hospital Central", habitaciones, salaDeEspera, empleadoHospital);

	}

	public void ficharEmpleados() {

		for (EmpleadoHospital empleadoHospital : empleadosHospital) {
			empleadoHospital.fichar();
		}
	}

	public void horaDeComer() {

		for (Habitacion habitacion : habitaciones) {
			if (habitacion != null) {
// TODO
			}
		}

		for (Paciente paciente : salaDeEspera) {
			if (paciente != null) {
				paciente.comer();
			}
		}

		for (EmpleadoHospital empleadoHospital : empleadosHospital) {
			if (empleadoHospital != null) {
				empleadoHospital.comer();
			}
		}
	}

	public void pasarConsultas() {

		EmpleadoHospital[] empleadosHospital = this.empleadosHospital;

		Doctor doctor = null;

		Enfermo enfermoAux = null;

		for (EmpleadoHospital empleadoHospital : empleadosHospital) {
			if (empleadoHospital instanceof Doctor) {
				doctor = (Doctor) empleadoHospital;
			}
		}

		for (Paciente paciente : salaDeEspera) {

			if (paciente != null) {

				enfermoAux = doctor.diagnosticarPaciente(paciente);
			}

			if (enfermoAux != null) {

				boolean habitacionDisponible = false;

				for (Habitacion habitacion : habitaciones) {
					if (habitacion != null) {
						habitacion.setEnfermo(enfermoAux);
						habitacionDisponible = true;
						break;
					}
				}

				if (!habitacionDisponible) {
					log.info("No hay habitaciones disponibles, has curarte tu solo");
				}

			}

		}
	}
}
