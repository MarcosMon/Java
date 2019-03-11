package org.lasencinas.figuras.cuadrado;

import org.lasencinas.figuras.figurageometrica.FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica {

    private double lados = 0d;

    public Cuadrado(double lados) {

	setLados(lados);

    }

    private void setLados(double lados) {
	this.lados = lados;

    }
    public double getLados() {
	return this.lados;
    }

    public Cuadrado(String nombre, double lados) {
	super(nombre);
	setLados(lados);
    }

    @Override
    public double area() {
	return Math.pow(getLados(), 2);
    }

}
