//Ejercicio 3
//====================================================================================
//Escribe un único método en Java que sirva para realizar los siguientes cálculos 
//sobre un rectángulo a partir de la base y la altura proporcionadas por el usuario:
//
//+ Calcular el área del rectángulo. Area=base×altura
//+ Calcular el perímetro del rectángulo. Perímetro=2×(base+altura)
//+ Calcular la diagonal del rectángulo (utilizando el teorema de Pitágoras). 
//Diagonal= (raíz cuadrada)base2+altura2
// 
//​Devolver todos los datos en un único return
//
//En el main pintar la información devuelta por el método

package es.cursojava.inicio.metodos.ejercicios;

import java.util.Arrays;

public class E3RectanguloCalculadora {

	public static double[] MethodE3RectanguloCalculadora(double baseDentro, double alturaDentro) {

		double area = baseDentro * alturaDentro;
		double perimetro = 2 * (baseDentro * alturaDentro);
		double diagonal = Math.sqrt((baseDentro * baseDentro) + (alturaDentro * alturaDentro));

		double[] caracteristicasDelTriangulo = { area, perimetro, diagonal };

		return caracteristicasDelTriangulo;
	}

	public static void main(String[] args) {

		MethodE3RectanguloCalculadora(23.00, 12.00);
		double[] output = (MethodE3RectanguloCalculadora(23.00, 12.00));
		System.out.println(Arrays.toString(output));
		System.out.println(Arrays.toString(MethodE3RectanguloCalculadora(23.00, 12.00)));

	}
}
