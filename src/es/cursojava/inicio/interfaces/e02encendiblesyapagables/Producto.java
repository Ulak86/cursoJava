package es.cursojava.inicio.interfaces.e02encendiblesyapagables;

public abstract class Producto {

	private String nombre;
	private double precio;
	private int id;

	public Producto(String nombre, double precio, int id) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
