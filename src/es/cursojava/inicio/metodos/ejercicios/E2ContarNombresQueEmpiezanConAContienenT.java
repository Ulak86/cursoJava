//En una clase 
//+ Escribe un método que reciba un array de Strings con nombres y 
//devuelva el número de nombres que empiecen por A y contengan una t
//+ Desde el main generar el array con los nombres y llamar al método anterior,
//indicar cuantos nombres cumplen esa condición.

package es.cursojava.inicio.metodos.ejercicios;

public class E2ContarNombresQueEmpiezanConAContienenT {

	public static void nombresQueEmpiezanPorAYContienenUnaT(String[] contenedor) {

		int nombresQueEmpiezanPorAYContienenUnaT = 0;
		for (int i = 0; i < contenedor.length; i++) {
			if (contenedor[i].startsWith("a") && contenedor[i].contains("t")) {
				nombresQueEmpiezanPorAYContienenUnaT++;
			}

		}

		System.out.println(nombresQueEmpiezanPorAYContienenUnaT);

	}

	public static void main(String[] args) {

		String[] arrayConNombres = { "antonio", "marcos", "atomico", "astrohungaro", "miguel", "marta", "luisa",
				"antonomasia" };

		System.out.println("El numero de nombres que empiezan por A y contienen T es");
		
		nombresQueEmpiezanPorAYContienenUnaT(arrayConNombres);
		
		

	}

}
