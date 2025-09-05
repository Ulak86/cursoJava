package es.cursojava.inicio.oo.ejercicios.e03tienda;

public class E04UtilidadesTienda {

	public static double calcularValorInventario(E03Producto[] productos) {
		double valorTotal = 0;

		for (E03Producto e03Producto : productos) {
			valorTotal = valorTotal + e03Producto.calcularValorTotal();
		}

		return valorTotal;

	}
}
