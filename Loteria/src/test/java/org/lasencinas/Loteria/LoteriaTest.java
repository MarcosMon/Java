package org.lasencinas.Loteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LoteriaTest {
    
    
    @Test
    public void comprobarNumeros() {
	
    Loteria loteria = new Loteria();
    loteria.calculartNumerosAleatorios();
    loteria.mostrarResultados();
    assertEquals(3,loteria.getNumerosAleatorios());
    }
}
