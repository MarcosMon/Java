package org.lasencinas.figuras.circulo;

import org.lasencinas.figuras.figurageometrica.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    private double radio = 0;
    private String nombre;
    private final double PI = Math.PI;
    
    public Circulo() {
	
    }

    public Circulo(double radio) {
	super();
	setLado(radio);

    }

    public Circulo(String nombre, double radio) {
	super(nombre);
	setLado(radio);
    }

    private void setLado(double radio) {
	this.radio = radio;
    }

    public double getLado() {
	return this.radio;
    }
    @Override
    public double area() {
	return PI * Math.pow(getLado(), 2);

    }
}
