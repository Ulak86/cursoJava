package es.cursojava.inicio.oo.herencia.ejercicios.e16BandaDeMusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Instrumento {

	private static final Logger log = LoggerFactory.getLogger(Instrumento.class);

	private String nombre;
	private String tipo;
	private boolean afinado;

	public Instrumento(String nombre, String tipo, boolean afinado) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.afinado = afinado;
		log.info("Instancia de Instrumento creada");
	}

	public void afinar() {
		if (Math.random() > 0.4) {
			this.afinado=true;
		}
		if (afinado) {
			log.info("El instrumento esta afinado");
		} else {
			log.info("El instrumento esta desafinado");
		} 
	}

	public void tocar() {
		log.info("Tocando el instrumento: {}", nombre);
	}

	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}

	public String getTipo() {
		return tipo;
	}
	
	
	
}
