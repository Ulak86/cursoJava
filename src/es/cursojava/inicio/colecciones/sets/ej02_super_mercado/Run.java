package es.cursojava.inicio.colecciones.sets.ej02_super_mercado;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.Cliente;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.ProdAlimenticio;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.SuperMercado;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.util.CobrarCompra;
import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.util.Consola;
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