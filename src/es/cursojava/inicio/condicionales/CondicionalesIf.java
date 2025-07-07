package es.cursojava.inicio.condicionales;

public class CondicionalesIf {

	public static void main (String [] args) {
		
//		En la siguiente se castea (de casting), el int hace que se quede con el entero
		int numero = (int) (Math.random()*10);
		System.out.println(numero);
		
//		si hiciera lo siguiente siempre me devolveria un cero
//		int numero = (int) Math.random()*10;
		
//		Un else deja de evaluar en cuanto se cumple una condicion
//		En el siguiente un 6 daria Es mayor que 5, vamos, la segunda condicion jamas se ejecutaria
//		Si un if solo tiene una condicion y no se cumple el programa sigue por la siguiente linea 
//		de codigo
//		Y en este caso el else final nunca va a entrar porque siempre se cumple alguna de las anteriores		

		
		if (numero>=5) {
			System.out.println(numero + " es mayor que 5");
		} else if (numero>=5 && numero<7) {
			System.out.println(numero + " es mayor que 5 y menor que 7");
		} else if (numero>=2 || numero<5) {
			System.out.println(numero + " es mayor que 2 y menor que 5 ");	
		}else
		 {
			System.out.println(numero + " es menor que 5");
		}
		

		// usando if evaluar si un numero es par
		
		
		if (numero%2==0) {
			System.out.println("el numero es par");
		} else 
			System.out.println("el numero es impar");
		
	}
	
}
