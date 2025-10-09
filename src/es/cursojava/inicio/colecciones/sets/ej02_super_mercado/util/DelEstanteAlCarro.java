package es.cursojava.inicio.colecciones.sets.ej02_super_mercado.util;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.Cliente;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.ProdAlimenticio;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.SuperMercado;

public class DelEstanteAlCarro {

	public static boolean delEstanteAlCarro(SuperMercado s, Scanner sc) {
		Set<Cliente> cS = s.getClientes();

		for (Cliente c : cS) {
			System.out.println("\n+++++++++++++++++++++++++++++++");
			System.out.println("Cliente: " + c.getNombre());
			System.out.println("+++++++++++++++++++++++++++++++");

			s.mostrarStock();
			boolean a = false;
			do {
				int[] prodYCant = Consola.selectPA(sc, s);
				if (prodYCant[0] == -1) {
					break;
				}
				List<ProdAlimenticio> pAL = s.reducirStock(prodYCant);

//				for (ProdAlimenticio pA : pAL) {
//					System.out.println(pA);
//				}

				c.anadirAlCarrito(pAL);
			} while (!a);

		}

		return true;

	}

}
