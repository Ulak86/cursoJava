package es.cursojava.inicio.arrays;

import java.util.Arrays;

public class TeoriaArrays {

	public static void main(String[] args) {

//		Esto es un array de strings unidemsional de tamaño 4:

		String[] colores = new String[4];

//		Guarda "Azul" en la posición 0 del array.

		colores[0] = "Azul";

//		Muestra el valor en la posición 1 del array.

		System.out.println(colores[1]);

//		Asigna "Verde" a la primera posición del array 'colores'.
		colores[1] = "Verde";

//		Daria error out of bound:
//		System.out.println(colores[4]);

//		Asigna "Naranja" a la última posición del array 'colores'.
		colores[colores.length - 1] = "Naranja";

//		Declara un array de tipo double con 15 posiciones (valores inicializados a 0.0).
		double[] notas = new double[15];

//		Imprime el valor en la posición 0 del array 'notas' (por defecto es 0.0).
		System.out.println(notas[0]);

//		Declara e inicializa un array de enteros con valores específicos.
		int[] numeros = {7, 4, 2, 4, 5, 29};

//		Imprime el valor en la posición 4 del array 'numeros' (valor esperado: 5).
		System.out.println(numeros[4]);
		
//		Intenta imprimir el array 'numeros' directamente,
//		pero esto no mostrará los valores del array, sino su referencia en memoria.
		System.out.println(numeros);

//		Para imprimir los valores reales, usa Arrays.toString() que convierte el array en una cadena legible.
		System.out.println(Arrays.toString(numeros));

	}

}
