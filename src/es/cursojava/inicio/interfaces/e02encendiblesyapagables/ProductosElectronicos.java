package es.cursojava.inicio.interfaces.e02encendiblesyapagables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ProductosElectronicos extends Producto implements Encendible, Apagable {

	private static final Logger log = LoggerFactory.getLogger(ProductosElectronicos.class);

	private String fechaFabricacion;

	public ProductosElectronicos(String nombre, double precio, int id, String fechaFabricacion) {
		super(nombre, precio, id);
		this.fechaFabricacion = fechaFabricacion;
	}

	@Override
	public void encender() {
		log.info("Encendiendo {}", this.getClass().getSimpleName());

	}

	@Override
	public void apagar() {
		log.info("Apagando {}", this.getClass().getSimpleName());

	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

}
