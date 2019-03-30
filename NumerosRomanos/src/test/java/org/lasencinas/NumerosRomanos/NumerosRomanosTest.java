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

	// ----------Primer Caso-----------//
	String numValido = "XXX";
	numeroRomano = new NumerosRomanos(numValido);
	assertTrue("El número es válido", numeroRomano.comprobarNumero());

	// ----------Segundo Caso-----------//
	String numValidoDos = "XL";
	numeroRomano = new NumerosRomanos(numValidoDos);
	assertTrue("El número es válido", numeroRomano.comprobarNumero());

	// ----------Tercer Caso-----------//
	String numValidoTres = "CM";
	numeroRomano = new NumerosRomanos(numValidoTres);
	assertTrue("El número es válido", numeroRomano.comprobarNumero());

	// ----------Cuarto Caso-----------//
	String numValidoCuatro = "MMMDCCCLXXXVIII";
	numeroRomano = new NumerosRomanos(numValidoCuatro);
	assertTrue("El número es válido", numeroRomano.comprobarNumero());

	// ----------Quinto Caso-----------//
	String numValidoCinco = "MMDCCLXXVII";
	numeroRomano = new NumerosRomanos(numValidoCinco);
	assertTrue("El número es válido", numeroRomano.comprobarNumero());

	// ----------Sexto Caso-----------//
	String numValidoSeis = "CDXLIV";
	numeroRomano = new NumerosRomanos(numValidoSeis);
	assertTrue("El número es válido", numeroRomano.comprobarNumero());

	// ----------Séptimo Caso-----------//
	String numValidoSiete = "CDXXXIX";
	numeroRomano = new NumerosRomanos(numValidoSiete);
	assertTrue("El número es válido", numeroRomano.comprobarNumero());
    }

    @Test
    public void comprobacionNumeroNoValido() {

	// ----------Primer Caso-----------//
	String numValido = "XXXX";
	numeroRomano = new NumerosRomanos(numValido);
	assertFalse("El número no es válido", numeroRomano.comprobarNumero());

	// ----------Segundo Caso-----------//
	String numValidoDos = "IVIV";
	numeroRomano = new NumerosRomanos(numValidoDos);
	assertFalse("El número no es válido", numeroRomano.comprobarNumero());

	// ----------Tercer Caso-----------//
	String numValidoTres = "IVCM";
	numeroRomano = new NumerosRomanos(numValidoTres);
	assertFalse("El número no es válido", numeroRomano.comprobarNumero());

	// ----------Cuarto Caso-----------//
	String numValidoCuatro = "XIIII";
	numeroRomano = new NumerosRomanos(numValidoCuatro);
	assertFalse("El número no es válido", numeroRomano.comprobarNumero());

	// ----------Quinto Caso-----------//
	String numValidoCinco = "CCMMDX";
	numeroRomano = new NumerosRomanos(numValidoCinco);
	assertFalse("El número no es válido", numeroRomano.comprobarNumero());

	// ----------Sexto Caso-----------//
	String numValidoSeis = "MMMLL";
	numeroRomano = new NumerosRomanos(numValidoSeis);
	assertFalse("El número no es válido", numeroRomano.comprobarNumero());

	// ----------Séptimo Caso-----------//
	String numValidoSiete = "CLMDVXI";
	numeroRomano = new NumerosRomanos(numValidoSiete);
	assertFalse("El número no es válido", numeroRomano.comprobarNumero());

    }
}
