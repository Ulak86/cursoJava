package es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos;

import java.util.List;
import java.util.Set;

public class SuperMercado {

	private String nombre;
	private Set<List<ListaAlimentos>> stock;
	private Set<Cliente> clientes;

	public SuperMercado(String nombre, Set<List<ListaAlimentos>> stock, Set<Cliente> clientes) {
		this.nombre = nombre;
		this.stock = stock;
		this.clientes = clientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<List<ListaAlimentos>> getStock() {
		return stock;
	}

	public void setStock(Set<List<ListaAlimentos>> stock) {
		this.stock = stock;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
