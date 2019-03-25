package org.formacion.isp;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestProcesadorTexto {

	@Test
	public void test_simple() {
		
		ProcesadorTexto procesador = new ProcesadorTexto();
		
		procesador.agregarPalabra("No");
		procesador.agregarPalabra("himporta");
		procesador.agregarPalabra("la");
		procesador.agregarPalabra("hortografia");
		
		assertEquals("No himporta la hortografia", procesador.textoToString());
	}
	
	@Test
	public void test_con_idioma() {
		
		ProcesadorTexto procesador = new ProcesadorTexto();
		
		procesador.agregarPalabra("Tengo");
		procesador.agregarPalabra("hambre");
		
		assertEquals("Tengo hambre", procesador.textoToString());
		
		assertTrue(procesador.correcto(Idioma.ES));
	}
}
