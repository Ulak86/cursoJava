package es.cursojava.inicio.interfaces.e02encendiblesyapagables;

public abstract class Alimentos extends Producto {

	private String fechaCaducidad;

	public Alimentos(String nombre, double precio, int id, String fechaCaducidad) {
		super(nombre, precio, id);
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}


}
