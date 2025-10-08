package es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.pojos.productos;

import es.cursojava.inicio.colecciones.listas.ej02listsysets.produtovehiculos.interfaces.Insertable;

public abstract class Alimentos extends Producto implements Insertable{

    private String fechaCaducidad;

    public Alimentos(int id, String nombre, int precio, String fechaCaducidad) {
        super(id, nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    

}