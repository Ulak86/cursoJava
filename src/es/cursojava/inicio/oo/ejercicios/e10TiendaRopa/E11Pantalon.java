package es.cursojava.inicio.oo.ejercicios.e10TiendaRopa;

public class E11Pantalon {

	private String color;
	private double precio;
	private String talla;
	private E10Boton boton;

	public E11Pantalon(String color, double precio, String talla, E10Boton boton) {
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		this.boton = boton;
	}

	public double getPrecio() {
		return precio;
	}

	public void mostrarInfoPantalon() {
		System.out.println(
				"Color: " + color + " Precio: " + precio + " Talla: " + talla + " Boton: ");
		this.boton.mostrarInfoBoton();
		System.out.println("\n");
	}

}
