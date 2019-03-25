package org.lasencinas.arnoldEnumType.main;

import java.util.EnumSet;

public enum Planeta {

    /*
     * Se obtiene la gravedad de cada Planeta mediante la multiplicación de
     * gravitación universal 'G'(6.67400e-11) con el resultado de la división entre
     * el radio y la masa del planeta. Ejemplo G *(Radio/Masa)
     */
    MERCURY(3.702), VENUS(8.87), EARTH(9.807), MARS(3.711), JUPITER(24.79), SATURN(10.44), URANUS(8.69), NEPTUNE(11.15),
    PLUTON(0.62);

    // Gravedad de la Tierra.
    public static final double T = 9.807;

    private double gravedad = 0f;

    // Constructor
    private Planeta(double gravedad) {

	setGravedad(gravedad);
    }

    public double getGravedad() {
	return this.gravedad;
    }

    public void setGravedad(double gravedad) {
	this.gravedad = gravedad;
    }

    /*
     * El resultado de la división de peso / Gravedad terráquea, se multiplica por
     * la gravedad del Planeta en cuestión.
     */
    public double pesoSuperficie(double peso) {
	return masaHumano(peso) * getGravedad();
    }

    // Division del peso humano por la gravedad Terráquea
    public double masaHumano(double peso) {
	return peso / T;
    }

    // Comprende el rango de Mercurio a Marte, ambos incluidos
    public static EnumSet<Planeta> getPlanetasTerrestres() {
	return EnumSet.range(MERCURY, MARS);
    }

    // Se obtiene los planetas restantes.
    public static EnumSet<Planeta> getGigantesGaseosos() {
	return EnumSet.complementOf(getPlanetasTerrestres());
    }

}