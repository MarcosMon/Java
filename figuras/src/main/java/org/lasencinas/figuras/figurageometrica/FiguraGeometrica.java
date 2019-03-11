package org.lasencinas.figuras.figurageometrica;

public abstract class FiguraGeometrica {

    private String nombre;

    public FiguraGeometrica() {
	this.nombre = "Desconocido";
    }

    public FiguraGeometrica(String nombre) {
	setNombre(nombre);
    }

    private void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getNombre() {
	return this.nombre;
    }

    public abstract double area();

}
