package es.cursojava.inicio.interfaces.e03metodosdepago;

public class ProcesarPagos {

	public static void realizarPago(Pagos metodoPago, double monto) {
		metodoPago.procesarPago(monto);
	}
}
