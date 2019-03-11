package org.lasencinas.figuras.rectangulo;

import org.lasencinas.figuras.figurageometrica.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {

    private  String nombre = null;
    private  int ladoUno=0;
    private  int ladoDos=0;

    public Rectangulo(int lado1, int lado2) {
	super();
	setLadoUno(lado1);
	setLadoDos(lado2);
	
    }
    public Rectangulo(String nombre, int lado1, int lado2) {
	super(nombre);
	setLadoUno(lado1);
	setLadoDos(lado2);
    }
    

    private void setLadoDos(int lado2) {
	this.ladoDos = lado2;
    }
    
    public int getLadoDos() {
	return this.ladoDos;
    }
    
    public int getLadoUno() {
	return this.ladoUno;
    }

    private void setLadoUno(int lado1) {
	this.ladoUno = lado1;
    }

    @Override
    public double area() {
	return getLadoUno()*getLadoDos();
    }
    

}
