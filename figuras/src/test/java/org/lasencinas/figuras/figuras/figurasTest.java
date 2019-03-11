package org.lasencinas.figuras.figuras;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lasencinas.figuras.circulo.Circulo;
import org.lasencinas.figuras.cuadrado.Cuadrado;
import org.lasencinas.figuras.elipse.Elipse;
import org.lasencinas.figuras.rectangulo.Rectangulo;

public class figurasTest {

    @Test
    public void comprobarCirculo() {

	Circulo circulo1 = new Circulo(7);
	Circulo circulo2 = new Circulo("circulo", 5);
	
	double areaCirculo1 = 153.93804002589985;
	double areaCirculo2 = 78.53981633974483;
	
	String nombreDeSerie = "Desconocido";
	String circulo = "circulo";

	assertEquals(areaCirculo1, circulo1.area(), 0);
	assertEquals(nombreDeSerie, circulo1.getNombre());

	assertEquals(areaCirculo2, circulo2.area(), 0);
	assertEquals(circulo, circulo2.getNombre());
    }

    @Test
    public void comprobarElipse() {

	Elipse elipse1 = new Elipse(3, 4);
	Elipse elipse2 = new Elipse("elipse", 7, 5);
	
	double areaElipse1 = 37.69911184307752;
	double areaElipse2 = 109.95574287564276;
	
	String nombreDeSerie = "Desconocido";
	String elipse = "elipse";

	assertEquals(areaElipse1, elipse1.area(), 0);
	assertEquals(nombreDeSerie, elipse1.getNombre());

	assertEquals(areaElipse2, elipse2.area(), 0);
	assertEquals(elipse, elipse2.getNombre());

    }

    @Test
    public void comprobarRectangulo() {

	Rectangulo rectangulo1 = new Rectangulo(4, 5);
	Rectangulo rectangulo2 = new Rectangulo("rectangulo", 6, 5);

	double areaRectangulo1 = 20.0;
	double areaRectangulo2 = 30.0;

	String nombreDeSerie = "Desconocido";
	String rectangulo = "rectangulo";

	assertEquals(areaRectangulo1, rectangulo1.area(), 0);
	assertEquals(nombreDeSerie, rectangulo1.getNombre());

	assertEquals(rectangulo, rectangulo2.getNombre());
	assertEquals(areaRectangulo2, rectangulo2.area(), 0);

    }

    @Test
    public void comprobarCuadrado() {

	Cuadrado cuadrado1 = new Cuadrado(2);
	Cuadrado cuadrado2 = new Cuadrado("cuadrado", 4);

	double areaCuadrado1 = 4.0;
	double areaCuadrado2 = 16.0;
	
	String nombreDeSerie = "Desconocido";
	String cuadrado = "cuadrado";

	assertEquals(areaCuadrado1, cuadrado1.area(), 0);
	assertEquals(nombreDeSerie, cuadrado1.getNombre());

	assertEquals(areaCuadrado2, cuadrado2.area(), 0);
	assertEquals(cuadrado, cuadrado2.getNombre());

    }
}
