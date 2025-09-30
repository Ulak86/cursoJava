package es.cursojava.inicio.interfaces.e03metodosdepago;

public class InicializadorApp {

	public static Pagos[] inicializar() {

		PagoTarjetaCredito pagoTarjetaCredito = new PagoTarjetaCredito();
		PagoPayPal pagoPayPal = new PagoPayPal();
		PagoCriptomoneda pagoCriptomoneda = new PagoCriptomoneda();

		return new Pagos[] { pagoTarjetaCredito, pagoPayPal, pagoCriptomoneda };
	}

}
