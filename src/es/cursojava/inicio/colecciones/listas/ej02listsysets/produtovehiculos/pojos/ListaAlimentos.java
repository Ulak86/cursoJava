package es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos.productos.Alimentos;

public class ListaAlimentos {

	private List<Alimentos> listaAlimentos;

	public ListaAlimentos(AlimentoConCantidad alimentoConCantidad) {

		int numero = alimentoConCantidad.getCantidad();
		Alimentos alimento = alimentoConCantidad.getAlimento();

		List<Alimentos> alimentos = new ArrayList<>();

		for (int i = 0; i > numero; i--) {
			alimentos.add(alimento);
		}

	}

	public List<Alimentos> getListaAlimentos() {
		System.out.println(this);
		return listaAlimentos;
	}

	public void setListaAlimentos(List<Alimentos> listaAlimentosSuper) {
		this.listaAlimentos = listaAlimentosSuper;
	}
	
}
