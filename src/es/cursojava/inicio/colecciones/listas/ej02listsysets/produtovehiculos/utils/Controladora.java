package es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos.AlimentoConCantidad;
import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos.ListaAlimentos;
import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos.productos.Alimentos;
import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos.productos.Platano;
import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos.productos.Pollo;
import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos.productos.Queso;
import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos.productos.Tarta;

public class Controladora {

	public static void controladora() {

		Set<List<Alimentos>> stock = generarListaSuperMercado();
		mostrarStock(stock);
	}

	private static Set<List<Alimentos>> generarListaSuperMercado() {

		Set<List<Alimentos>> listaDeSuperMercado = new HashSet<>();

		System.out.println(listaDeSuperMercado.size());
		
		listaDeSuperMercado.add(new ListaAlimentos(
				new AlimentoConCantidad(new Platano(1, "Plátano de Canarias", 1, "2025-11-01"), 10)).getListaAlimentos());
		
		System.out.println(listaDeSuperMercado.size());
		
		listaDeSuperMercado
				.add(new ListaAlimentos(new AlimentoConCantidad(new Pollo(2, "Pechuga de Pollo", 5, "2025-10-15"), 5)).getListaAlimentos());
		
		System.out.println(listaDeSuperMercado.size());
		listaDeSuperMercado
		
				.add(new ListaAlimentos(new AlimentoConCantidad(new Queso(3, "Queso Manchego", 6, "2025-12-01"), 3)).getListaAlimentos());
		System.out.println(listaDeSuperMercado.size());
		
		listaDeSuperMercado
		
				.add(new ListaAlimentos(new AlimentoConCantidad(new Tarta(4, "Tarta de Queso", 9, "2025-10-20"), 2)).getListaAlimentos());
		System.out.println(listaDeSuperMercado.size());
		
		return listaDeSuperMercado;
	}

	public ListaAlimentos generarListaCompraDeCliente() {
		return null;
	}

	private static void mostrarStock(Set<List<Alimentos>> stock) {

		System.out.println(stock.size());
		
//		for (List<Alimentos> list : stock) {
//
//			System.out.println("==========Mostrando nombre de la lista de alimentos==========");
//			System.out.println(list.getClass());
//			System.out.println("==========Mostrando stock de esa lista==========");
//			System.out.println(list.size());
//		}

	}

}
