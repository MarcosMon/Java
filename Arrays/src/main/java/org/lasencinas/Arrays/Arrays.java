package org.lasencinas.Arrays;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class Arrays {
    int[] lista = new int[25];
    Random numerosAleatorios = new Random();
    double[] arrayCalculos = new double[4];
    int sumaImpares = 0;
    int numeroInferior = 0;
    int cantidadNumerosPares = 0;
    int cantidadNumerosImpares = 1;
    int mediaNumerosImpares = 2;
    int sumaEnteros = 3;

    public Arrays() {

    }

    public int[] getValoresLista() {
	return this.lista;
    }

    public int getLongitudLista() {
	return lista.length;
    }

    public double[] getCalculosArray() {
	return arrayCalculos;
    }


    public int getSumaImpares() {
	return this.sumaImpares;
    }
    
    public double getMediaImpares() {
	return arrayCalculos[mediaNumerosImpares];
    }

    public double getCantidadNumerosPares() {

	return arrayCalculos[cantidadNumerosPares];
    }

    public double getCantidadNumerosImpares() {
	return arrayCalculos[cantidadNumerosImpares];
    }

    public double getSumaEnteros() {
	return arrayCalculos[sumaEnteros];
    }
    
    public void setSumaImpares(int Impar) {
	this.sumaImpares += Impar;
    }

    public void setSumaEnteros(double numero) {
	arrayCalculos[sumaEnteros] += numero;
    }

    public void setCantidadNumerosPares(double Par) {
	arrayCalculos[cantidadNumerosPares] += Par;
    }

    public void setCantidadNumerosImpares(double Impar) {
	arrayCalculos[cantidadNumerosImpares] += Impar;
    }

    public void setValoresLista(int numAleatorio, int posicion) {
	this.lista[posicion] = numAleatorio;
    }

    public void calcularValoresLista() {

	// damos valores a lista
	for (int posicion = 0; posicion < getLongitudLista(); posicion++) {
	    setValoresLista(numerosAleatorios.nextInt(26) + 25, posicion);
	}

    }

    public void setMediaImpares(double calculo) {
	arrayCalculos[mediaNumerosImpares] = calculo;
    }

    public void imputarImparesYPares() {

	for (int posicion = 0; posicion < getLongitudLista(); posicion++)
	    if (getValoresLista()[posicion] % 2 == 0) {
		setCantidadNumerosPares(+1);
	    } else {
		setCantidadNumerosImpares(+1);
		setSumaImpares(getValoresLista()[posicion]);

	    }
    }

    public void calcularSumaEnteros() {
	for (int posicion = 0; posicion < getLongitudLista(); posicion++) {
	    if (posicion == 0) {
		numeroInferior = getValoresLista()[posicion];
	    } else if (getValoresLista()[posicion] < numeroInferior) {
		numeroInferior = getValoresLista()[posicion];
	    }
	}
	for (int numero = 1; numero <= numeroInferior; numero++) {
	    setSumaEnteros(numero);
	}
    }

    public void calcularMediaImpares() {
	setMediaImpares(getSumaImpares() / getCantidadNumerosImpares());
    }

    public void mostrarPosicionYNumero() {
	for (int posicion = 0; posicion < getLongitudLista(); posicion++) {
	    System.out.println("Posicion " + posicion + " de la lista =" + getValoresLista()[posicion]);
	}
    }

    public void mostrarInformacion() {
	System.out.println();

	System.out.println("Numero de elementos pares: " + getCantidadNumerosPares());
	System.out.println("Numero de elementos impares: " + getCantidadNumerosImpares());
	System.out.println("Media impares: " + getMediaImpares());
	System.out.println("Suma de lso enteros comprendidos entre 1 y el minimo de la lista: " + getSumaEnteros());
    }

}
