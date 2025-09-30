package es.cursojava.inicio.interfaces.e03metodosdepago;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PagoTarjetaCredito implements Pagos {

	private static final Logger log = LoggerFactory.getLogger(PagoTarjetaCredito.class);

	@Override
	public void procesarPago(double monto) {
		log.info("Pago realizado con tarjeta {}", monto);

	}

}
