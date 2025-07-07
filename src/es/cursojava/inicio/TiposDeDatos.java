package es.cursojava.inicio;

import java.util.Scanner;

/*import java.util.Scanner lo he obtenido al hacer click sobre el error al declarar
 *Scanner scan = new Scanner(System.in);
 *otra via para hacerlo es el atajo ctrl+shift+o
 *este atajo tambien te elimina las que hayas importado y que no estes usando
 *hay que importarla porque no esta en el paquete lang 
 *el paquete lang y los paquetes que nosotros mismos creemos son los unicos  
 *que no tenemos que importar 
 */


public class TiposDeDatos {

	public static void main(String[] args) {
		//***************************************
		//Tipos primitivos
		//***************************************
		
		// Son los unicos que se definen con palabras que empuiezan con minuscula
		// Son los datos mas pequeños y no se pueden realizar operaciones dentro mas alla de definirlos
		
		//Enteros
		//byte	8	-128 	127
		//short	16	-32.768	32.768
		//int	32	-2^31	2^31-1
		//long	64  -22^63	22^63-1
		
		byte edad = 10;
		short numero2 = 123;
		int numero = 2300;
		long numero3 = 1890;
		
		//Java permite usar _ para separar numeros visualmente, no tiene ninguna otra implicacion y es para facilitar la lectura al codificador
		//ejemplo long numero3 = 1_890_230_000;
		
		

		//Tipos decimales
		double decimal1 = 9.7;
		float decimal2 = 9.7f;
		
		//destacar la necesidad de usar la f al final de la declaracion de un float
		
		//Caracteres
		char caracter = ' ';
				
		//Booleano
		boolean esMayorEdad = 8!=3;
		
		System.out.println("10" + edad + numero2);
		
		//***************************************
		//Tipos objeto
		//***************************************
		// Recordar que un tipo de dato que se define con una palabra que empieza con mayuscula es una clase
		// Sobre un objeto si se pueden realizar acciones y para ello se usan metodos
		
		String nombre = "Jose Luis";
		nombre.toUpperCase();
		
		//En la linea anterior hemos convertido el objeto String nombre a mayusculas
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tus apellidos");
		//imprimira Introduce tus apellidos 
		String apellidos = scan.nextLine();
		//la consola se quedara esperando un input y cuando se lo des lo almacenara en la variable apellidos
		System.out.println(nombre + " " + apellidos);
		
		System.out.println("Introduce tu altura");
		double altura = scan.nextDouble();
		
		System.out.println(nombre + " " + apellidos + " " + altura);
	}

}
