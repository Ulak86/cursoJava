package es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {

	private List<ProdAlimenticio> carrito;

	public Cliente(String nombre, int edad, List<ProdAlimenticio> carrito) {
		super(nombre, edad);
		this.carrito = new ArrayList<ProdAlimenticio>();
	}

	public void anadirAlCarrito(List<ProdAlimenticio> pAL) {
		
//		for (ProdAlimenticio prodAlimenticio : pAL) {
//			System.out.println(prodAlimenticio);
//		}
		
		for (ProdAlimenticio pA : pAL) {
			carrito.add(pA);
		}
		
//		for (ProdAlimenticio prodAlimenticio : pAL) {
//			System.out.println(prodAlimenticio);
//		}
		
//		System.out.println(carrito.size());
		
	}
	@Override
	public String toString() {
		return "==============================================================\nCliente [getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + ", carrito=" + carrito + "]\n==============================================================";
	}

	public List<ProdAlimenticio> getCarrito() {
		return carrito;
	}

	public void setCarrito(List<ProdAlimenticio> carrito) {
		this.carrito = carrito;
	}

}
