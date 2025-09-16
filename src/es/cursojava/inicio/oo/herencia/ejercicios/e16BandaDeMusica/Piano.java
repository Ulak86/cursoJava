package es.cursojava.inicio.oo.herencia.ejercicios.e16BandaDeMusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Piano extends Instrumento {

	private static final Logger log = LoggerFactory.getLogger(Piano.class);

	private int numeroOctavas;
	private String tipoPiano;
	
	public Piano(String nombre, String tipo, boolean afinado, int numeroOctavas, String tipoPiano) {
		super(nombre, tipo, afinado);
		this.numeroOctavas = numeroOctavas;
		this.tipoPiano = tipoPiano;
	}
	
	public void afinar () {
		super.afinar();
		log.info("Afinando piano");
	}
	

}
