package es.cursojava.inicio.interfaces.e02encendiblesyapagables;

public abstract class Vehiculo {

	private int id;

	public Vehiculo(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
