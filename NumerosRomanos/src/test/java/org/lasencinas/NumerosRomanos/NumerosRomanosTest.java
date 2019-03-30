package org.lasencinas.NumerosRomanos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.swing.JOptionPane;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.NumerosRomanos.logica.NumerosRomanos;

public class NumerosRomanosTest {

    private NumerosRomanos numeroRomano = null;

    @Before
    public void init() {
	numeroRomano = new NumerosRomanos();
    }

    @Test
    public void comprobacionTeclado() {
	String numeroTeclado = JOptionPane.showInputDialog("Escribe un número romano");
	numeroRomano = new NumerosRomanos(numeroTeclado);
	boolean numRomano = numeroRomano.comprobarNumero();
	assertEquals(numRomano, numeroRomano.comprobarNumero());

    }

    @Test
    public void comprobacionNumeroValido() {

	String numValido = "XXX";
	numeroRomano = new NumerosRomanos(numValido);
	assertTrue("El número es válido", numeroRomano.comprobarNumero());
    }
    
    @Test
    public void comprobacionNumeroNoValido() {

	String numValido = "XXXX";
	numeroRomano = new NumerosRomanos(numValido);
	assertFalse("El número no es válido", numeroRomano.comprobarNumero());
    

}
}
