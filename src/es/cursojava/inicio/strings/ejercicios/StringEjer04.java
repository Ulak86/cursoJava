//Ejercicio 4
//==============================
//Escribe un programa que reciba un String con varias words separadas por espacios y determine cuál es la word más larga.

//
package es.cursojava.inicio.strings.ejercicios;

public class StringEjer04 {

	public static void main(String[] args) {

		String text = "Enasdadsadsadas d un lugarf de La Mancha";
		String word = "";
		String maxWord = "";

		text = text.strip();

		text = (" " + text);

		while (text.length() > 0) {

			int spacePos = text.lastIndexOf(" ");

			word = text.substring(spacePos + 1, text.length());

			if (word.length() > maxWord.length()){
				
				maxWord = word;
				
				}

			if (maxWord.length() > text.length() - 1) {

				break;

			} else {
				
				text = text.substring(0, spacePos);

			}
		}

		System.out.println(maxWord);
	}

}
//
//		int longitud = text.length();
//
//		int tamaño = 0;
//		int tamañoMax = 0;
//		String word = "";
//
////		boolean espacio = false;
//
//		for (int i = longitud - 1; i > 0; i--) {
//
//			if (text.charAt(i) != ' ') {
//
//				tamaño++;
//
//			} else if (text.charAt(i) == ' ') {
//
//				if (tamaño > tamañoMax) {
//					
//					tamañoMax = tamaño;
//					tamaño = 0;
//					
//					word = text.substring(text.length(),i);
//					
//					if (word.length>tamañoMax
//				}
//				
//			}
//
//		}
//	}
//}
//
////		System.out.println("Escribe una frase y pulsa enter");
////		Scanner scan = new Scanner(System.in);
////		String text = scan.nextLine();
////
////		int contadorA = 0, contadorB = 0, position1 = 0, position2 = 0;
////////		String word = "";
////
////		for (int i = text.length(); i >= 0; i--) {
////			
////			if (text.charAt(i-1) != ' ') {
////				contadorB++;
////			} else if (text.charAt(i-1) == ' ') {
////				contadorB = 0;
////			}
////			
////		}
////		for (int i = text.length(); i > 0; i--) {
////			if (text.charAt(i - 1) != ' ') {
////				contadorB++;
////				if (contadorA < contadorB) {
////					contadorA = contadorB;
////					contadorB = 0;
////				}
////			}
////		
////		}
////		System.out.println("La word mas larga tiene " + contadorA + " letras");
////
//////			("La segunda e está en " + cadena.indexOf("e", cadena.indexOf("e") + 1));
//////		
//////		int position1 = 0, position2 =0;
//////		
//////		position2 = text.indexOf(" ");
//////		
//////		String word = (text.substring(position1, position2));
//////		
//////		System.out.println(word);
////
////	}
////}
