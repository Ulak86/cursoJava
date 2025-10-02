package es.cursojava.inicio.colecciones.listas;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.inicio.oo.herencia.e21Hospital.Persona;

public class Ejemplo01Listas {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();
		lista.add("Amarillo");
		lista.add(100.5);
		lista.add(new Persona());
		for (int i = 0; i < 10000; i++) {
			lista.add(new Persona());
		}

		for (Object object : lista) {
			if (object instanceof Persona) {
				Persona p = (Persona) object;
				p.getNombre();
			}
		}

		List<Persona> lista2 = new ArrayList();
		lista2.add(new Persona());
		for (int i = 0; i < 10000; i++) {
			lista2.add(new Persona());
		}

		for (Object object : lista2) {
			if (object instanceof Persona) {
				Persona p = (Persona) object;
				p.getNombre();
			}
		}
	}
}
