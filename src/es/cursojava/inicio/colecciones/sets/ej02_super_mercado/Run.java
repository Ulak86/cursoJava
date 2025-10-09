package es.cursojava.inicio.colecciones.sets.ej02_super_mercado;

import java.util.Scanner;

import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.SuperMercado;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.util.CobrarCompra;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.util.DelEstanteAlCarro;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.util.IniciarSupermercado;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.util.Utilidades;

public class Run {

	static Scanner sc = new Scanner(System.in);

	public static void run() {

		SuperMercado s = IniciarSupermercado.iniciarSupermercado();
		Utilidades.bienVenidoAlSuper(s);
		DelEstanteAlCarro.delEstanteAlCarro(s, sc);
		Utilidades.hasPasadoALaZonaDeCajas();
		CobrarCompra.cobrarCompra(s, sc);
		Utilidades.vuelvaPronto();
		
		sc.close();
	}

}