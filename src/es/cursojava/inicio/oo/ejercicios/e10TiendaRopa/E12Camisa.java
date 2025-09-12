package es.cursojava.inicio.oo.ejercicios.e10TiendaRopa;

public class E12Camisa {

	private String color;
	private double precio;
	private String talla;
	private E10Boton[] botones;

	public E12Camisa(String color, double precio, String talla, E10Boton[] botones) {
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		this.botones = botones;
	}

	public double getPrecio() {
		return precio;
	}

	public void mostrarInfoCamisa() {
		System.out.println("Color: " + color + " Precio: " + precio + " Talla: " + talla + "\nBotones: ");
		for (E10Boton e10Boton : botones) {
			e10Boton.mostrarInfoBoton();
		System.out.println("\n");
		}
	}

}
