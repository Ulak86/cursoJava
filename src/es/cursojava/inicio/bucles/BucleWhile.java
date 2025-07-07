package es.cursojava.inicio.bucles;

public class BucleWhile {

	public static void main(String[] Args) {

		int numero = 10;
		while (numero > 0) {
			System.out.println(numero);
			if (numero % 3 == 0) {
				continue;

			}

			numero--;
		}
	}

}
