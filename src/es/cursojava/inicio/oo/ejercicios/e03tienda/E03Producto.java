package es.cursojava.inicio.oo.ejercicios.e03tienda;

public class E03Producto {

	private String nombre;
	private double precio;
	private int cantidad;
		
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public E03Producto(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public void mostrarInfo() {
		System.out.println("\nNombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nCantidad: " + getCantidad());
	}
	
	public double calcularValorTotal() {
		double valorTotal = getPrecio()*getCantidad();
		return valorTotal;

	}
}
