package es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SuperMercado {

	private String nombre;
	private List<List<ProdAlimenticio>> stock;
	private Set<Cliente> clientes;

	public SuperMercado(String nombre, List<List<ProdAlimenticio>> stock, Set<Cliente> clientes) {
		this.nombre = nombre;
		this.stock = stock;
		this.clientes = clientes;
	}

	public void mostrarStock() {

		int i = 1;
		System.out.printf("%-5s %-15s %5s%n", "ID", "Producto", "Stock");
		System.out.println("---------------------------");

		for (List<ProdAlimenticio> l : stock) {
			if (!l.isEmpty()) {
				System.out.printf("%-5d %-15s %5d%n", i++, l.getFirst().getNombre(), l.size());
			}
		}

	}


	public List<ProdAlimenticio> reducirStock(int[] prodYCant) {
		
		int prod = prodYCant[0];
		List<ProdAlimenticio> pAL = new ArrayList<>();
		
		for (int i = prodYCant[1]; i > 0; i--) {
			pAL.add(stock.get(prod).removeLast());
		}
		
		if (stock.get(prod).isEmpty()) {
			List<List<ProdAlimenticio>> it = stock;
			it.remove(prod);
			mostrarStock();
		}
		
		return pAL;
		
	}

	@Override
	public String toString() {
		return "SuperMercado [nombre=" + nombre + ", stock=" + stock + ", clientes=" + clientes + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<List<ProdAlimenticio>> getStock() {
		return stock;
	}

	public void setStock(List<List<ProdAlimenticio>> stock) {
		this.stock = stock;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
