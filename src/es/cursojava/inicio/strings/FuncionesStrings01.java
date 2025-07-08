package es.cursojava.inicio.strings;

public class FuncionesStrings01 {

	public static void main(String[] args) {

		String nombre1 = "Marta";
		String nombre2 = "Eva";
//		La siguiente linea no genera un objeto
		String nombre3 = null;

//		la variable nombre 3 apunte a donde lo hace nombre 2: 
		nombre3 = nombre2;
//		no genera un objeto:
		nombre2 = nombre1;
//		genera un objeto SIN variable asociada con el contenido :
		nombre2.toUpperCase();
//		genera un objeto CON variable asociada con el contenido :
		String nombre4 = nombre2.toUpperCase();
		System.out.println(nombre3.toUpperCase());
		System.out.println(nombre1);

		System.out.println("======================");

//		da una excepcion StringINdexOutOfBoundException:
//		System.out.println(nombre1.charAt(10));

//		nos imprime el ultimo caracter de nombre 1
		System.out.println(nombre1.charAt(nombre1.length() - 1));

//		evalua si nombre 1 contiene "te"
		System.out.println(nombre1.contains("te"));

//		Evalua si el objeto Tenerife contiene el objeto Te
//		Ambos ojetos que crea aqui y destruye al saltar a la proxima linea
		System.out.println("Tenerife".contains("Te"));

//		En el siguiente primero genera un objeto tenerife primero y luego evalua
//		si contiene te
		System.out.println("Tenerife".toLowerCase().contains("te"));

//		Tipico uso (el de endsWith) para identificar tipos de files
		System.out.println(nombre2.endsWith("va"));
		System.out.println(nombre2.endsWith("Ma"));

		String cadena = "Esto es una prueba de Strings";
		System.out.println(cadena.indexOf("e"));
		System.out.println(cadena.lastIndexOf("e"));

		System.out.println(cadena.replace("a", "A"));

		System.out.println("======================");
		cadena = "  e r t  ";
		System.out.println(cadena.isBlank());
		System.out.println(cadena.isEmpty());

		System.out.println("'" + cadena + "'");
		System.out.println("'" + cadena.strip() + "'");
		System.out.println("'" + cadena.replace(" ","") + "'");

		cadena = "Hola Mundo desde Getafe";
		System.out.println(cadena.substring(5));
		System.out.println(cadena.substring(5,12));
		System.out.println(cadena.substring(cadena.lastIndexOf(" ")+1));


	}

}
