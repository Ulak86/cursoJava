package es.cursojava.inicio.oo.ejercicios.e10TiendaRopa;

public class E13Vestido {

	private String color;
	private double precio;
	private String talla;
	
	public E13Vestido(String color, double precio, String talla) {
		this.color = color;
		this.precio = precio;
		this.talla = talla;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void mostrarInfoVestido () {
		System.out.println("Color: " + color + " Precio: " + precio + " Talla: " + talla);
		System.out.println("\n");
	}
}
