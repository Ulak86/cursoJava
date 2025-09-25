package es.cursojava.inicio.oo.herencia.ejercicios.e16BandaDeMusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuitarraElectrica extends Guitarra {

	private static final Logger log = LoggerFactory.getLogger(GuitarraElectrica.class);
	
	private int potencia;
		
	public GuitarraElectrica(String nombre, String tipo, boolean afinado, int numCuerdas, int potencia) {
		super(nombre, tipo, afinado, numCuerdas);
		this.potencia = potencia;
	}

	public void tocar() {
		log.info("Tocando muy alto");
	}
}
