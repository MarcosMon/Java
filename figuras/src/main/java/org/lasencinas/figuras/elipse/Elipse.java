package org.lasencinas.figuras.elipse;

import org.lasencinas.figuras.figurageometrica.FiguraGeometrica;

public class Elipse extends FiguraGeometrica {
    
    private final double PI = Math.PI;

    private double semiejeMenor = 0d;
    
    private double semiejeMayor = 0d;

    public Elipse(String nombre, int semiejeMenor, int semiejeMayor) {
	super(nombre);
	setSemiejeMenor(semiejeMenor);
	setSemiejeMayor(semiejeMayor);
    }

    public Elipse(int semiejeMenor, int semiejeMayor) {
	super();
	setSemiejeMenor(semiejeMenor);
	setSemiejeMayor(semiejeMayor);
	
    }

    public double getSemiejeMenor() {
	return semiejeMenor;
    }

    public void setSemiejeMenor(double semiejeMenor) {
	this.semiejeMenor = semiejeMenor;
    }

    public double getSemiejeMayor() {
	return semiejeMayor;
    }

    public void setSemiejeMayor(double semiejeMayor) {
	this.semiejeMayor = semiejeMayor;
    }

    @Override
    public double area() {
	
	return PI * getSemiejeMayor() * getSemiejeMenor();
    }

}
