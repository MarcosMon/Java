package org.lasencinas.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;
import org.lasencinas.Arrays.Arrays;

public class ArraysTest {
    
    
    
    @Test
    public void  ArraysTest() {
	Arrays calculos = new Arrays();
	
	calculos.calcularValoresLista();
	calculos.imputarImparesYPares();
	calculos.calcularMediaImpares();
	calculos.mostrarPosicionYNumero();
	calculos.calcularSumaEnteros();
	int cantidadMaxNumeros = 24;
	
	assertEquals(25, calculos.getLongitudLista());
	 
	assertEquals(cantidadMaxNumeros, calculos.getCantidadNumerosImpares(),cantidadMaxNumeros - calculos.getCantidadNumerosImpares());
	 
	assertEquals(cantidadMaxNumeros, calculos.getCantidadNumerosPares(),cantidadMaxNumeros - calculos.getCantidadNumerosPares());
	 
	assertEquals(1250, calculos.getSumaEnteros(),1250 - calculos.getSumaEnteros());
	 
	assertEquals(1225, calculos.getSumaImpares(),1225 - calculos.getSumaImpares());
	 
	assertEquals(49, calculos.getMediaImpares(),49 - calculos.getMediaImpares());

	 
	 


	 
    }



}
