package es.cursojava.inicio.oo.ejercicios.e10TiendaRopa;

public class E14Maniqui {

	private static int idCount;
	private int id;
	private E11Pantalon pantalon;
	private E12Camisa camisa;
	private E13Vestido vestido;

	
	
	public static int getIdCount() {
		return idCount;
	}

	public int getId() {
		return id;
	}

	public E11Pantalon getPantalon() {
		return pantalon;
	}

	public E12Camisa getCamisa() {
		return camisa;
	}

	public E13Vestido getVestido() {
		return vestido;
	}

	public E14Maniqui() {
		this.id = idCount++;	
	}
	
	public E14Maniqui(E11Pantalon pantalon, E12Camisa camisa) {
		this.pantalon = pantalon;
		this.camisa = camisa;
		this.id = idCount++;
	}

	public E14Maniqui(E13Vestido vestido) {
		desvestir();
		this.vestido = vestido;
		this.id = idCount++;
	}
	
	public void vestir (E11Pantalon pantalon, E12Camisa camisa) {
		desvestir();
		this.pantalon = pantalon;
		this.camisa = camisa;
	}
	
	public void vestir (E13Vestido vestido) {
		desvestir();
		this.vestido = vestido;
	}
	
	public void desvestir () {
		this.pantalon = null;
		this.camisa = null;
		this.vestido = null;
	}
	
	public void mostrarInfoManiquiCamisaYPantalon () {
		System.out.println("Maniqui id: " + this.id + "\nCamisa: ");
		this.camisa.mostrarInfoCamisa();
		System.out.println("Pantalon:");
		this.pantalon.mostrarInfoPantalon();
	}
	
	public void mostrarInfoVestido () {
		System.out.println("Maniqui id: " + this.id + "\nVestido:\n");
		this.vestido.mostrarInfoVestido();
	}
	
}
