//Rehacer el ejercicio del menú con (1. Pintar cuadrado; 2.Validar email....) 
//usando los métodos del ejercicio anterior y por cada opción del menú generar 
//un método para ejecutarlo.

//9. Pintar el menu hasta que se puse la opción de salir. 
//
//	1. Pintar Cuadrado
//	2. Validar email
//	3. Añadir Alumno
//	4. Salir
//
//	Elige una opción
//
//Si se pulsa la opción 1, solicitar el tamaño de los lados de un cuadrado y pintar el cuadrado de la siguiente manera:
//Por ejemplo si el tamaño es 4:
//
//		****
//		*  *
//		*  *
//		****

package es.cursojava.inicio.metodos.ejercicios;

import java.util.Scanner;

public class E5AplicacionMenu {

	public static void main(String[] args) {

		String opcionesMenu = "1. Pintar Cuadrado\n2. Validar email\n3. Colegio\n4. Salir\n";
		int selectedOption = E4UtilidadesConsola.pideDatoNumerico(opcionesMenu);

		switch (selectedOption) {
		case 1 -> cuadrado();
		case 2 -> validarmail();
		case 3 -> anadirAlumno();
		case 4 -> System.out.println("Adios");
		default -> System.out.println("La opcion seleccionada no existe.");
		}
		
	}

	public static void cuadrado() {

		int tamanoCuadrado = E4UtilidadesConsola.pideDatoNumerico("De que tamano quieres el cuadrado");

		for (int i = 0; i < tamanoCuadrado; i++) {
			for (int j = 0; j < tamanoCuadrado; j++) {
				if (i == 0 || i == (tamanoCuadrado - 1))
					System.out.print("* ");
				else if (j == 0 || j == (tamanoCuadrado - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

	public static void validarmail() {
		String email = E4UtilidadesConsola.pideDatoCadena("Escribe la direccion de mail que quieres comprobar");
		String mensajeError = "";

		email = email.trim();

		if (email.isEmpty()) {
			mensajeError = "El email no puede estar en blanco";
		} else {
			if (email.contains(" ")) {
				mensajeError = "El email no puede tener espacios en blanco\n";
			}

			if (!email.contains("@")) {
				mensajeError += "El email no tiene arroba\n";
			} else if (email.indexOf("@") != email.lastIndexOf("@")) {
				mensajeError += "El email no puede tener más de 1 arroba\n";
			} else {
				String dominio = email.substring(email.indexOf("@") + 1);
				System.out.println("dominio: " + dominio);

				if (!dominio.contains(".")) {
					mensajeError += "El dominio del email debe contener al menos un punto \n";
				} else {// Si contiene punto
					int posicionPunto = dominio.indexOf(".");
					if (posicionPunto < 2) {
						mensajeError += "La separación entre la @ y el primer punto debe ser superior a 2 caracteres \n";
					}

					int posicionUltimoPunto = dominio.lastIndexOf(".");
					int longitudDominio = dominio.length() - 1;
					if (longitudDominio - posicionUltimoPunto < 2 || longitudDominio - posicionUltimoPunto > 6) {
						mensajeError += "Después del último punto solo puede haber entre 2 y 6 caracteres \n";
					}
				}

			}

		}

		if (mensajeError.isEmpty()) {
			System.out.println("El email " + email + " es valido");
		} else {
			System.out.println(mensajeError);
		}

	}

	public static void anadirAlumno() {
		String colegio[][] = new String[2][];
		colegio[0] = new String[4];
		colegio[1] = new String[2];
		// colegio[1][1] = "Andrés";

		Scanner scan = new Scanner(System.in);
		int opcion = 0;

		do {
			String opcionesMenu1 = "1. Insertar Alumnos\n2. Mostrar Alumnos\n3. Buscar Alumno\n4. Borrar Alumno\n5. Salir\n\nIntroduce una opción";
			opcion = E4UtilidadesConsola.pideDatoNumerico(opcionesMenu1);

			switch (opcion) {
			case 1 -> {
				boolean hayHueco = false;
				for (int i = 0; i < colegio.length; i++) {
					for (int j = 0; j < colegio[i].length; j++) {
						if (colegio[i][j] == null) {

							String nombre = E4UtilidadesConsola.pideDatoCadena("Introduce el nombre "
									+ "del alumno para el aula "
									+ i + " y el puesto " + j);
							colegio[i][j] = nombre;
							
							hayHueco = true;
						}
					}
				}
				if (!hayHueco) {
					System.out.println("No hay puestos libres");
				}

			}
			case 2 -> {

				int numAula = 1;
				for (String[] aula : colegio) {
					System.out.println("Alumnos del aula " + numAula);
					for (String alumno : aula) {
						if (alumno != null) {
							System.out.println("\t" + alumno);
						} else {
							System.out.println("\tvacio");
						}
					}
					numAula++;
				}
			}
			case 3 -> {
				
				String opcionesMenu3 = "Introduce nombre a buscar";
				String busqueda = E4UtilidadesConsola.pideDatoCadena(opcionesMenu3);

				boolean encontrado = false;
				for (int i = 0; i < colegio.length; i++) {
					for (int j = 0; j < colegio[i].length; j++) {
						String nombreAlumno = colegio[i][j];

						if (nombreAlumno != null && nombreAlumno.contains(busqueda)) {
							System.out.println("El alumno " + nombreAlumno + " está en el aula" + (i + 1)
									+ " en el puesto " + (j + 1));
							encontrado = true;
						}

					}

				}
				if (!encontrado) {
					System.out.println("No se han encontrado alumnos con " + busqueda);
				}

			}
			case 4 -> {
				
				String opcionesMenu3 = "Introduce nombre a buscar";
				String nombre = E4UtilidadesConsola.pideDatoCadena(opcionesMenu3);

				boolean encontrado = false;
				for (int i = 0; i < colegio.length; i++) {
					for (int j = 0; j < colegio[i].length; j++) {
						String nombreAlumno = colegio[i][j];

						if (nombre.equals(nombreAlumno)) {
							colegio[i][j] = null;
							encontrado = true;
						}

					}

				}
				if (!encontrado) {
					System.out.println("No se han encontrado alumnos con " + nombre);
				}

			}
			case 5 -> {
				System.out.println("Adios!!");
			}
			default -> {
				System.out.println("Opción incorrecta");
			}
			}

		} while (opcion != 0);

	}

}
