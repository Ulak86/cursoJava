package es.cursojava.inicio.oo.herencia.e21Hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doctor extends EmpleadoHospital {

	private static final Logger log = LoggerFactory.getLogger(Doctor.class);

	private String especialidad;

	public Doctor(String nombre, int edad, String turno, String especialidad) {
		super(nombre, edad, turno);
		this.especialidad = especialidad;
	}

	public Enfermo diagnosticarPaciente(Paciente paciente) {

		Enfermo enfermo = null;

		String[] enfermedades = { "Gripe", "Diabetes", "Hipertensión", "Asma", "Bronquitis", "Neumonía",
				"Resfriado común", "Migraña", "Artritis", "Cáncer", "Depresión", "Ansiedad", "Obesidad", "Insomnio",
				"Hepatitis", "Tuberculosis", "Alzheimer", "Parkinson", "Eczema", "Dermatitis", "Anemia", "Osteoporosis",
				"Colesterol alto", "Sinusitis", "Apnea del sueño", "Lumbalgia", "Gastritis", "Colitis", "Cistitis",
				"Varices", "Enfermedad renal", "Tendinitis", "Fibromialgia", "Psoriasis", "Lupus",
				"Síndrome de fatiga crónica", "Esclerosis múltiple", "Migraña crónica", "Alergia", "Cataratas",
				"Glaucoma", "Otitis", "Conjuntivitis", "Hipotiroidismo", "Hipertiroidismo", "Artritis reumatoide",
				"Epilepsia", "Infarto", "Arritmia", "Varicela", "Sarampión", "Rubéola", "Poliomielitis", "Dengue",
				"Zika", "Chikungunya", "Malaria", "Covid-19", "Ébola", "Sida", "Hepatitis B", "Hepatitis C", "Sífilis",
				"Gonorrea", "Herpes", "Cisticercosis", "Toxoplasmosis", "Leucemia", "Linfoma", "Melanoma", "Neuralgia",
				"Trombosis", "Insuficiencia cardíaca", "Cistitis intersticial", "Fibrosis pulmonar", "Hipoglucemia",
				"Hiperglucemia", "Síndrome metabólico", "Amigdalitis", "Faringitis", "Gastritis crónica",
				"Esquizofrenia", "Trastorno bipolar", "Obesidad mórbida", "Hernia", "Cálculos renales",
				"Enfermedad de Crohn", "Colitis ulcerosa", "EPOC", "Síndrome de Down", "Autismo", "Parkinson avanzado",
				"Esclerosis lateral amiotrófica", "Miastenia grave", "Sarcoma", "Cistitis bacteriana", "Neumotórax",
				"Hemofilia", "Síndrome nefrótico", "Hemorragia cerebral" };

		int numeroEstaEnfermo = (int) (Math.random() * 10) + 1;
		int enfermedad = (int) (Math.random() * 100);

		boolean estaEnfermo = false;
		if (numeroEstaEnfermo > 8) {
			estaEnfermo = true;
		}

		if (estaEnfermo) {
			enfermo = new Enfermo(paciente.getNombre(), paciente.getEdad(), enfermedades[enfermedad]);
		} else {
			log.info("El paciente {} es dado de alta", paciente.getNombre());
		}

		paciente = null;
		
		return enfermo;
	}
}
