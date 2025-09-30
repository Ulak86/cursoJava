package es.cursojava.inicio.interfaces.e03metodosdepago;

public class Main {

	public static void main(String[] args) {
		
		Pagos[] pagos = InicializadorApp.inicializar();
		
		for (Pagos pago : pagos) {
			pago.procesarPago(10.99);
		}

	}

}
  