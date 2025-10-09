package es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model;

import java.time.LocalDate;

public class ProdAlimenticio extends Producto {

	private LocalDate fechaCaducidad;

	@Override
	boolean caducado() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public ProdAlimenticio(String nombre, double precioUnitario, LocalDate fechaCaducidad) {
		super(nombre, precioUnitario);
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "ProductoAlimenticio [fechaCaducidad=" + fechaCaducidad + ", nombre=" + nombre + ", precioUnitario="
				+ precioUnitario + "]";
	}

}
