package es.cursojava.inicio.oo.ejercicios.e10TiendaRopa;

public class E10Boton {
	private String color;
	private int tamanio;
	private String forma;

	public E10Boton(String color, int tamanio, String forma) {
		this.color = color;
		this.tamanio = tamanio;
		this.forma = forma;
	}

	public void mostrarInfoBoton () {
		System.out.println("Color: " + color + " Tamanio: " + tamanio + " Forma: " + forma);
	}
}
