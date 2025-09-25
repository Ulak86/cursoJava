package es.cursojava.inicio.oo.herencia.ejercicios.e16BandaDeMusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BandaDeMusicaMain {

	private static final Logger log = LoggerFactory.getLogger(Guitarra.class);
	
	private Instrumento[] banda = new Instrumento[4];

	public BandaDeMusicaMain() {
		banda[0] = new Guitarra("Guitarrita1", "Cuerdas", false, 6);
		banda[1] = new GuitarraElectrica("Guitarrita2", "Cuerdas", false, 7, 9);
		banda[2] = new Piano("Pianito1", "Cuerda percutida", false, 8, "Pared");
		banda[3] = new Tambor("Tamborin1", "Percusion", false, "Abedul");
	}

	public static void main(String[] args) {
		BandaDeMusicaMain banda = new BandaDeMusicaMain();
		banda.empezarConcierto();
		banda.afinarInstrumentos(banda);
		banda.tocarInstrumentos(banda);
	}

	void empezarConcierto() {
		BandaDeMusicaMain banda = new BandaDeMusicaMain();
	}

	void afinarInstrumentos(BandaDeMusicaMain banda) {
		for (Instrumento instrumento : this.banda) {
			instrumento.afinar();
		}
	}

	void tocarInstrumentos(BandaDeMusicaMain banda) {
		boolean instrumentoDesafinado = false;
		for (Instrumento instrumento : this.banda) {
			if (instrumento.getTipo().equals("Percusion")) {
//				instrumento.aporrear();
			} else {
				((Tambor) instrumento).aporrear();
			}
			if (!(instrumento.isAfinado())) {
				instrumentoDesafinado = true; 
			}
		}
		if (instrumentoDesafinado) {
			log.info("La banda suena mal");
		}
	}

}
