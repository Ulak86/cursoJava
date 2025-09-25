package es.cursojava.inicio.oo.ejercicios.e06Biblioteca;

public class E08Biblioteca {

	private String nombre;
	private E07Direccion direccion;
	private E06Libro[] libros;

	public E08Biblioteca(String nombre, E07Direccion direccion, int capacidadLibreria) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.libros = new E06Libro[capacidadLibreria];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public E07Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(E07Direccion direccion) {
		this.direccion = direccion;
	}

	public E06Libro[] getLibros() {
		return libros;
	}

	public void agregarLibro(E06Libro libro) {
		boolean bibliotecaLlena = true;
		for (int i = 0; i < libros.length; i++) {
			E06Libro e06Libro = libros[i];
			if (e06Libro == null) {
				libros[i] = libro;
				bibliotecaLlena = false;
				break;
			}
		}
		if (bibliotecaLlena) {
			System.out.println("La biblioteca esta llena, no se pudo añadir el libro");
		}
	}

	public void mostrarLibros() {
		System.out.println("\nLibros:");
		for (E06Libro e06Libro : libros) {
			if (e06Libro != null) {
				e06Libro.mostrarInfo();
			}
		}
	}

	public void mostrarInfoBiblioteca() {
		System.out.println("\nDireccion: ");
		this.direccion.mostrarDireccion();
		mostrarLibros();
	}
}
