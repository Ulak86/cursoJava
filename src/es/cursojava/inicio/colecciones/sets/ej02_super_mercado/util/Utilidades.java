package es.cursojava.inicio.colecciones.sets.ej02_super_mercado.util;

import es.cursojava.inicio.colecciones.sets.ej02_super_mercado.model.SuperMercado;

public class Utilidades {

	public static void bienVenidoAlSuper(SuperMercado sC) {
	    System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++");
	    System.out.println("Bienvenido al supermercado " + sC.getNombre());
	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	}

	public static void hasPasadoALaZonaDeCajas() {
	    System.out.println("\n+++++++++++++++++++++++++++++++");
	    System.out.println("Has pasado a la zona de cajas");
	    System.out.println("+++++++++++++++++++++++++++++++");
	}
	
	public static void vuelvaPronto() {
	    System.out.println("\n+++++++++++++++++++++++++++++++");
	    System.out.println("Vuelva pronto!");
	    System.out.println("+++++++++++++++++++++++++++++++");
	}

}
