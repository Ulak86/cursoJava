package es.cursojava.inicio.oo.herencia;


//Mirar el del profesor en lugar de este

public class Animal {

	private String nombre;
	private double peso;
	private long identificador;
	
	public Animal() {
		
	}
	
	public Animal(String nombre, double peso, long identificador) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.identificador = identificador;
	}

	public void comer() {
		System.out.println("El animal" + this.nombre + " esta comiendo");
	}
	
}
