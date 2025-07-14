package es.cursojava.inicio.arrays;

import java.util.Iterator;
import java.util.Scanner;

public class EjerciArrays02 {

	public static void main(String[] args) {

//		crear array int 4x4

		int[][] matriz = new int[4][4];

//		pedir datos para todas las posciones

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				System.out.println("Dame el valor a asignar a la fila " + i + " columna " + j);
				Scanner scan = new Scanner(System.in);
				matriz[i][j] = scan.nextInt();

			}

		}
//		mostrar todos los datos	
		
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				System.out.print(matriz[i][j]+"\t");

			}
			
			System.out.println();
			System.out.println();
		}
		
//		mostrar los datos de la diagonal
		
		
		for (int i = 0; i < matriz.length; i++) {

			System.out.print(matriz[i][i]+", ");

			}
		
		System.out.println();
		

//		invertir la diagonal. modificar el array original invirtiendo los datos de la diagonal
		
		int[] subMatriz = new int[matriz.length];
		
		for (int i = matriz.length-1, j= 0; i >= 0; i--, j++) {
			
			subMatriz [j] = matriz [i][i];

			}
		
		
		for (int i = 0; i < matriz.length; i++) {
			
			matriz [i][i] = subMatriz [i];

			}
		
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				System.out.print(matriz[i][j]+"\t");

			}
			
			System.out.println();
			System.out.println();
		}
	
	}

}
