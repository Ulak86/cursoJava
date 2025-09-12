package es.cursojava.inicio.oo.ejercicios.e10TiendaRopa;

public class E15Tienda {

	private String nombre;
 
	public E15Tienda(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		
		E14Maniqui[] maniquies2 = abrirTienda();
		
		E10Boton boton2 = new E10Boton("violeta", 2, "circular");
		E10Boton[] botones2 = { boton2, boton2 };
		
		E11Pantalon pantalon2 = new E11Pantalon("verde", 49.99, "XXL", boton2);
		E12Camisa camisa2 = new E12Camisa("negro", 39.99, "XL", botones2);
		E13Vestido vestido2 = new E13Vestido("marron", 45.55, "S");
		
		vestirManiquies(maniquies2, pantalon2, camisa2, vestido2);
		
		mostrarEscaparate(maniquies2);
		
		cerrarTienda(maniquies2);


	}

	public static E14Maniqui[] abrirTienda() {

		E15Tienda tienda = new E15Tienda("Tienda de ropa");

		E10Boton boton = new E10Boton("azul", 3, "cuadrado");
		E10Boton[] botones = { boton, boton };

		E11Pantalon pantalon1 = new E11Pantalon("azul", 39.99, "XL", boton);
		E12Camisa camisa1 = new E12Camisa("blanco", 29.99, "L", botones);
		E13Vestido vestido1 = new E13Vestido("rojo", 35.55, "M");

		E14Maniqui maniqui1 = new E14Maniqui(pantalon1, camisa1);

		E14Maniqui maniqui2 = new E14Maniqui(vestido1);

		E14Maniqui maniqui3 = new E14Maniqui();

		E14Maniqui[] maniquies = { maniqui1, maniqui2, maniqui3 };
		
		return maniquies;

	}

	public static void vestirManiquies(E14Maniqui[] maniquies, E11Pantalon pantalon, E12Camisa camisa, E13Vestido vestido) {
		for (int i = 0; i < maniquies.length; i++) {
			if ((maniquies[i].getCamisa() == null) && (maniquies[i].getVestido() == null)) {
				if (i % 2 == 0) {
					maniquies[i].vestir(pantalon, camisa);
				} else {
					maniquies[i].vestir(vestido);
				}

			}
		}
	}

	public static void mostrarEscaparate(E14Maniqui[] maniquies) {
		double precioTotal = 0;
		for (E14Maniqui e14Maniqui : maniquies) {
			if (e14Maniqui.getCamisa() != null) {
				precioTotal = precioTotal + e14Maniqui.getCamisa().getPrecio() + e14Maniqui.getPantalon().getPrecio();
				e14Maniqui.mostrarInfoManiquiCamisaYPantalon();
			} else if (e14Maniqui.getVestido() != null) {
				precioTotal = precioTotal + e14Maniqui.getVestido().getPrecio();
				e14Maniqui.mostrarInfoVestido();
			}
			System.out.println("El precio total es: " + precioTotal);
		}
	}
	
	public static void cerrarTienda(E14Maniqui[] maniquies) {
		System.out.println("La tienda cierra");
		for (int i = 0; i < maniquies.length; i++) {
			maniquies[i].desvestir();
		};
	}
}
