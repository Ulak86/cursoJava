package es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos;

import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos.productos.Alimentos;

public class AlimentoConCantidad {

	Alimentos alimento;
	int cantidad;

	public AlimentoConCantidad(Alimentos alimento, int cantidad) {
		this.alimento = alimento;
		this.cantidad = cantidad;
	}

	public Alimentos getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimentos alimento) {
		this.alimento = alimento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



}
