package es.cursojava.inicio.interfaces.e03metodosdepago;

public class Main {

	public static void main(String[] args) {
		
		Pagos[] pagos = InicializadorApp.inicializar();
		
		for (Pagos pago : pagos) {
			double monto = 0.10 + (Math.random() * (100.00 - 0.10));
			monto = Math.floor(monto * 100) / 100.0;
			pago.procesarPago(monto);
		}

	}

}
  