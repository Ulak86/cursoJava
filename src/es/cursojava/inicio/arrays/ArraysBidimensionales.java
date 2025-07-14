package es.cursojava.inicio.arrays;

public class ArraysBidimensionales {
	
	public static void main(String[] args) {
		
//		definicion de array bidimensional
//		en el primer [] se define el numero de filas
//		en el segundo [] el de columnas
		
		int [][] numeros = new int [2][3];
		numeros [1][2]=10;
		System.out.println(numeros[1][1]);
		System.out.println(numeros[1][2]);		
		
//		numero de filas
		
		System.out.println(numeros.length);
		
//		posicion en memoria del primer array del array bidimensional
		
		System.out.println(numeros[0]);
		
//		lo siguiente lo hace para demostrarnos que un array bidimensional
//		esta formado por arrays unidimensionales
		
		int [] fila0 = numeros[0];
		System.out.println(fila0.length);
		System.out.println(numeros[0].length);		
		
//		recorrer un array bidimensional
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Fila" + i);
			
			for (int j = 0; j < numeros[i].length; j++) {
				
				System.out.println("\tColumna: " +j);
			}
			
		}
		
		
		for (int i = 0; i < numeros.length; i++) {
			
//			System.out.println("Fila" + i);
			
			for (int j = 0; j < numeros[i].length; j++) {
				
//				System.out.println("\tColumna: " +j);
				
				System.out.println("Posicion ("+i+","+j+")");
				System.out.println("\t"+numeros[i][j]);
				
			}
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
//			System.out.println("Fila" + i);
			
			for (int j = 0; j < numeros[i].length; j++) {
				
//				System.out.println("\tColumna: " +j);
				
//				System.out.println("Posicion ("+i+","+j+")");
				System.out.println(numeros[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

}
