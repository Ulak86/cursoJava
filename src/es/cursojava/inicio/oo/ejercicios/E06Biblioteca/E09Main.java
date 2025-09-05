package es.cursojava.inicio.oo.ejercicios.E06Biblioteca;

public class E09Main {
	public static void main(String[] args) {
		
		E07Direccion direccion1 = new E07Direccion("Calle1", "Madrid", 12);
		
		E08Biblioteca biblioteca1 = new E08Biblioteca("Biblio1", direccion1, 10);
		
		E06Libro libro1 = new E06Libro("El gato volador", "Rigoberta Menchu", "111222NHB");
		E06Libro libro2 = new E06Libro("El perro volador", "Rigoberto Mencho", "3334444NHB");
		E06Libro libro3 = new E06Libro("El sapo volador", "Jacobo Gonzalez", "555666NHB");
		
		biblioteca1.agregarLibro(libro1);
		biblioteca1.agregarLibro(libro2);
		biblioteca1.agregarLibro(libro3);
		
		biblioteca1.mostrarInfoBiblioteca();
		
		biblioteca1.mostrarLibros();
		
	}

}
