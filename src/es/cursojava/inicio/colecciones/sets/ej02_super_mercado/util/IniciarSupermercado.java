package es.cursojava.inicio.colecciones.sets.ej02_super_mercado.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.Cliente;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.ProdAlimenticio;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.SuperMercado;

public class IniciarSupermercado {

	public static SuperMercado iniciarSupermercado() {

		return generarSuperMercado();

	}

	private static SuperMercado generarSuperMercado() {
		return new SuperMercado("SuperAlimentacion", generarStock(), generarClientes());
	}

	private static Set<Cliente> generarClientes() {

		Cliente c1 = new Cliente("Ana Pérez", 34, null);
		Cliente c2 = new Cliente("Luis García", 16, null);
		Cliente c3 = new Cliente("Carlos Ruiz", 45, null);

		Set<Cliente> cS = new HashSet<>();

		cS.add(c1);
		cS.add(c2);
		cS.add(c3);

		return cS;
	}

	private static List<List<ProdAlimenticio>> generarStock() {
		ProdAlimenticio pA1 = new ProdAlimenticio("Plátano", 1.25, LocalDate.of(2025, 10, 30));
		ProdAlimenticio pA2 = new ProdAlimenticio("Leche entera", 1.10, LocalDate.of(2025, 11, 15));
		ProdAlimenticio pA3 = new ProdAlimenticio("Pan integral", 1.35, LocalDate.of(2025, 10, 10));
		ProdAlimenticio pA4 = new ProdAlimenticio("Cerveza", 2.75 , LocalDate.of(2035, 12, 31));
		
		List<ProdAlimenticio> pAL1 = generarListaProductos(pA1, 5);
		List<ProdAlimenticio> pAL2 = generarListaProductos(pA2, 7);
		List<ProdAlimenticio> pAL3 = generarListaProductos(pA3, 4);
		List<ProdAlimenticio> pAL4 = generarListaProductos(pA4, 1);

		List<List<ProdAlimenticio>> stock = new ArrayList<List<ProdAlimenticio>>();

		stock.add(pAL1);
		stock.add(pAL2);
		stock.add(pAL3);
		stock.add(pAL4);

		return stock;
	};

	private static List<ProdAlimenticio> generarListaProductos(ProdAlimenticio pA, int num) {

		List<ProdAlimenticio> pAL = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			pAL.add(pA);
		}

		return pAL;

	}
}
