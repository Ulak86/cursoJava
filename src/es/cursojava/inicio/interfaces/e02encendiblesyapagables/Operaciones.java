package es.cursojava.inicio.interfaces.e02encendiblesyapagables;

public class Operaciones {

	public static void selectObject(Consultable consultable) {
		consultable.select();
	}
	
	public static void insertObject(Insertable insertable) {
		insertable.insert();
	}
	
	public static void updateObject(Updateable updateable) {
		updateable.update();
	}
	
	public static void deleteObject(Deleteable deleteable) {
		deleteable.delete();
	}

}
