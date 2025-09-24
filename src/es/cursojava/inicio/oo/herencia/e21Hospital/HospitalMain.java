package es.cursojava.inicio.oo.herencia.e21Hospital;

public class HospitalMain {

	public static void main(String[] args) {

		Hospital hospital = Hospital.abrirHospital();

		hospital.ficharEmpleados();

		hospital.horaDeComer();

		hospital.pasarConsultas();

		hospital.horaDeComer();

	}
}
