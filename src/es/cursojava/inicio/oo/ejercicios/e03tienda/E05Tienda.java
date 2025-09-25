package es.cursojava.inicio.oo.ejercicios.e03tienda;

public class E05Tienda { 
	

	public static void main(String[] args) {

		E03Producto producto1 = new E03Producto("reloj", 30.25, 3);
		E03Producto producto2 = new E03Producto("movil", 200.55, 2);
		E03Producto producto3 = new E03Producto("pantalla", 399.99, 1);

		E03Producto[] productos = { producto1, producto2, producto3 };
		
		for (E03Producto e03Producto : productos) {
			e03Producto.mostrarInfo();
		}
		
		double valorTotal =  E04UtilidadesTienda.calcularValorInventario(productos);
		
		System.out.println("\nEl valor total del inventario es: "+ valorTotal);
	}
}

