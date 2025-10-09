package es.cursojava.inicio.colecciones.sets.ej02_super_mercado.util;

import java.util.Scanner;

import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.SuperMercado;

public class Consola {

	/**
	 * Permite al usuario seleccionar un producto y la cantidad que desea añadir al
	 * carrito. Devuelve un array con dos valores: {idProducto, cantidadProducto}.
	 * Si el usuario introduce 0 como ID (para finalizar seleccion), devuelve
	 * {-1,0}. Tiene control de valores de entrada.
	 * 
	 * @param sc (Scanner)
	 * @param sM (SuperMercado)
	 * @return int [2] {i, j} -- cuando se selecciona un producto devuelve
	 *         {[0-(stock.size-1)),[0 -(listaProdAlimento.size))}.
	 */
	public static int[] selectPA(Scanner sc, SuperMercado sM) {

		int idP = -2; // ID producto
		int ctP = 0; // cantidad de producto

		// Seleccion ID producto
		boolean a = false;
		System.out.println("\nIntroduce el ID del producto que deseas añadir al carrito (0 para finalizar):");
		do {
			idP = sc.nextInt() - 1;
			sc.nextLine();
			if ((idP < -1) || idP >= sM.getStock().size()) {
				System.out.println("ID fuera de rango, intentalo de nuevo.");
			} else {
				a = !a;
			}
		} while (!a);

		// Retorno cuando se selecciona finalizar
		if (idP == -1) {
			return new int[] { -1, 0 };
		}

		// Seleccion cantidad producto
		boolean b = false;
		if (idP != -1) {
			int i = sM.getStock().get(idP).size();
			System.out.println("Introduce el número de unidades que deseas añadir (max " + i + "):");

			do {
				ctP = sc.nextInt();
				sc.nextLine();
				if (ctP <= i && ctP > 0) {
					b = !b;
				} else {
					System.out.println("Cantidad de unidades no válida, inténtalo de nuevo.");
				}
			} while (!b);
		}
//		System.out.println(idP + " " + ctP);
//		System.out.println();
		return new int[] { idP, ctP };
	};
}