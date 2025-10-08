package es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos;

import java.util.List;

import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos.productos.Alimentos;

public class Cliente {

	private String nombre;
	private List<Alimentos> carrito;

	public Cliente(String nombre, List<Alimentos> carrito) {
		this.nombre = nombre;
		this.carrito = carrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alimentos> getCarrito() {
		return carrito;
	}

	public void setCarrito(List<Alimentos> carrito) {
		this.carrito = carrito;
	}

}
