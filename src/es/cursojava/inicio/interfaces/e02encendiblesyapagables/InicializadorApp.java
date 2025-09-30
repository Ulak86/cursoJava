package es.cursojava.inicio.interfaces.e02encendiblesyapagables;

public class InicializadorApp {

	private static int id = 1;

	public static void Iniciar() {
		Encendible[] encendibles = crearEncendiblesyApagables();
		Pan pan = InicializadorApp.crearPan();
		Bicicleta bicicleta = crearBicicleta();
		encenderYApagar(encendibles);

		for (Encendible encendible : encendibles) {
			if (encendible instanceof Batidora) {
				Batidora auxBatidora = (Batidora) encendible;
				Operaciones.updateObject(auxBatidora);
				Operaciones.insertObject(auxBatidora);
				Operaciones.selectObject(auxBatidora);
			} else if (encendible instanceof Coche) {
				Coche auxCoche = (Coche) encendible;
				Operaciones.updateObject(auxCoche);
				Operaciones.insertObject(auxCoche);
				Operaciones.selectObject(auxCoche);
			}
		}

		Operaciones.selectObject(pan);
		Operaciones.deleteObject(bicicleta);
		Operaciones.insertObject(bicicleta);
		Operaciones.updateObject(bicicleta);

	}

	public static Encendible[] crearEncendiblesyApagables() {

		Batidora batidora = new Batidora("Bosh", 49.99, id++, "Enero 2024");

		Coche coche = new Coche(id++, "Combustion");

		return new Encendible[] { batidora, coche };
	}

	public static Pan crearPan() {

		Pan pan = new Pan("Baguette", 0.99, id++, "Pasado mañana");

		return pan;
	}

	public static Bicicleta crearBicicleta() {

		Bicicleta bibicleta = new Bicicleta(id++, 16);

		return bibicleta;

	}

	public static void encenderYApagar(Encendible[] encendibles) {

		for (Encendible encendible : encendibles) {
			encendible.encender();
			((Apagable) encendible).apagar();
		}

	}

}
