
public class HolaMundo {
	
	public static void main (String [] args ) {
		
		System.out.println("Hola nubdi desde Getafe Madrid");
		
		//Comentario de linea

		System.out.println("Cambio que no existia");
		/*
		 * Comentario
		 * de
		 * Bloque
		 * 
		 */
		
		//Declarar una variable
		//1o Indico el tipo y nombre de la variable (notacion camelCase)
		//2o Inicio la variable
		
		int numero; //Iniciar
		numero = 9; //Declarar
		
		//En la siguiente se declara e inicia directamente
		
		int edad = 24; //Iniciar y declarar
		
		System.out.println(numero);
		
		//System.out.println imprime por la consola
		
		System.out.println("10" + numero + edad);
		
		//Aqui concatena cadenas, convirtiendo numero y edad a cadena de texto
		
		System.out.println(numero + edad);
		
		//Aqui suma los valores numero y edad
		
		System.out.println("resultado: " + (numero + edad));
		
		//Lo parentesis mas anidadados son lo primero a ejecutar 
		
	}

}
