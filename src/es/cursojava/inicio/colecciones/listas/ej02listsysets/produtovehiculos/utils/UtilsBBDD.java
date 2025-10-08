package es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.utils;

import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.interfaces.Consultable;
import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.interfaces.Deletable;
import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.interfaces.Updatable;
import es.cursojava.inicio.interfaces.e02encendiblesyapagables.Insertable;

public class UtilsBBDD {

	public static void insertarObjeto(Insertable obj) {
		obj.insert();
	}
	
	public static void consultarObjeto(Consultable obj) {
		obj.select();
	}
	
	public static void updateObjeto(Updatable obj) {
		obj.update();
	}
	
	public static void deleteObjeto(Deletable obj) {
		obj.delete();
	}
}
