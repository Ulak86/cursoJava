package es.cursojava.inicio.oo.herencia.ejercicios.e16BandaDeMusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tambor extends Instrumento {

	private static final Logger log = LoggerFactory.getLogger(Guitarra.class);

	private String material;

	public Tambor(String nombre, String tipo, boolean afinado, String material) {
		super(nombre, tipo, true);
		this.material = material;
	}

	public void afinar() {
		setAfinado(true);
		log.info("Afinando tambor");
	}

	public void aporrear() {
		log.info("Aporreando tambor");
	}
	
	
}
