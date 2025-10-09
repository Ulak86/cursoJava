package es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model;

public abstract class Producto {

	protected String nombre;
	protected double precioUnitario;

	abstract boolean caducado();

	public Producto(String nombre, double precioUnitario) {
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioUnitario=" + precioUnitario + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

}
