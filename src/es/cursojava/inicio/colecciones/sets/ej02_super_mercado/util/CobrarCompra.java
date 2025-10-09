package es.cursojava.inicio.colecciones.sets.ej02_super_mercado.util;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.Cliente;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.ProdAlimenticio;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.SuperMercado;

public class CobrarCompra {
	
	public static void cobrarCompra(SuperMercado sM, Scanner sc) {

		Set<Cliente> cS = new HashSet<>(sM.getClientes());

		for (Cliente c : cS) {

			double total = 0;
			double subtotal = 0;
			List<ProdAlimenticio> carrL = c.getCarrito();

			Set<ProdAlimenticio> carrSinDupliS = new HashSet<>();
			for (ProdAlimenticio pA : carrL) {
				carrSinDupliS.add(pA);
			}
//			System.out.println(cA.size());
//			System.out.println(cASinDuplicados.size());

			System.out.println();
			for (ProdAlimenticio pAS : carrSinDupliS) {
				int cantidad = 0;
				for (ProdAlimenticio pAL : carrL) {
					if (pAS.getNombre().equals(pAL.getNombre())) {
						cantidad++;
					}
				}
				subtotal = pAS.getPrecioUnitario() * cantidad;
				total += subtotal;
				System.out.printf("Producto: %-15s | Cant: %-3d | Precio: %6.2f € | Subtotal: %7.2f €%n",
						pAS.getNombre(), cantidad, pAS.getPrecioUnitario(), subtotal);

			}
			System.out.println("--------------------------------------------------");
			System.out.printf("TOTAL A PAGAR por %-15s: %7.2f €%n", c.getNombre(), total);

		}

	}

}
