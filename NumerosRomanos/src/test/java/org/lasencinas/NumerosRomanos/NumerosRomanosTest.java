package org.lasencinas.NumerosRomanos;

import javax.swing.JOptionPane;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumerosRomanosTest {

    @Test
    public void comprobacionTeclado() {
	String numeroTeclado = JOptionPane.showInputDialog("Escribe un número romano");
	NumerosRomanos numeroRomano = new NumerosRomanos(numeroTeclado);
	boolean numRomano = numeroRomano.comprobarNumero();
	assertEquals(numRomano,numeroRomano.comprobarNumero());
	
    }

}
