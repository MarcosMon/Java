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

    @Test
    public void comprobarResultadosCorrectos() {
	
	// ----------Primer Caso-----------//
	String numValido = "MDCCLXXXIX";
	numeroRomano = new NumerosRomanos(numValido);
	int total = 1789;
	numeroRomano.calcularResultado();
	assertEquals(total, numeroRomano.getResultado());
	
	// ----------Segundo Caso-----------//
	String numValidoDos = "MCDXCII";
	numeroRomano = new NumerosRomanos(numValidoDos);
	int totalDos = 1492;
	numeroRomano.calcularResultado();
	assertEquals(totalDos, numeroRomano.getResultado());
	
	// ----------Tercer Caso-----------//
	String numValidoTres = "MMMDCCCLXXXVIII";
	numeroRomano = new NumerosRomanos(numValidoTres);
	int totalTres = 3888;
	numeroRomano.calcularResultado();
	assertEquals(totalTres, numeroRomano.getResultado());

	// ----------Cuarto Caso-----------//
	String numValidoCuatro = "MMDCCLXXVII";
	numeroRomano = new NumerosRomanos(numValidoCuatro);
	int totalCuatro = 2777;
	numeroRomano.calcularResultado();
	assertEquals(totalCuatro, numeroRomano.getResultado());
	
	// ----------Quinto Caso-----------//
	String numValidoCinco = "CDXLIV";
	numeroRomano = new NumerosRomanos(numValidoCinco);
	int totalCinco = 444;
	numeroRomano.calcularResultado();
	assertEquals(totalCinco, numeroRomano.getResultado());

	// ----------Sexto Caso-----------//
	String numValidoSeis = "CDXXXIX";
	numeroRomano = new NumerosRomanos(numValidoSeis);
	int totalSeis = 439;
	numeroRomano.calcularResultado();
	assertEquals(totalSeis, numeroRomano.getResultado());

	// ----------Séptimo Caso-----------//
	String numValidoSiete = "MMMCMXCIX";
	numeroRomano = new NumerosRomanos(numValidoSiete);
	int totalSiete = 3999;
	numeroRomano.calcularResultado();
	assertEquals(totalSiete, numeroRomano.getResultado());

	// ----------Octavo Caso-----------//
	String numValidoOcho = "MMMDCCLXXXIX";
	numeroRomano = new NumerosRomanos(numValidoOcho);
	int totalOcho = 3789;
	numeroRomano.calcularResultado();
	assertEquals(totalOcho, numeroRomano.getResultado());

	// ----------Noveno Caso-----------//
	String numValidoNueve = "MCMXXXIX";
	numeroRomano = new NumerosRomanos(numValidoNueve);
	int totalNueve = 1939;
	numeroRomano.calcularResultado();
	assertEquals(totalNueve, numeroRomano.getResultado());

	// ----------Décimo Caso-----------//
	String numValidoDiez = "MCMXLV";
	numeroRomano = new NumerosRomanos(numValidoDiez);
	int totalDiez = 1945;
	numeroRomano.calcularResultado();
	assertEquals(totalDiez, numeroRomano.getResultado());

	// ----------Undécimo Caso-----------//
	String numValidoOnce = "MCMLXXV";
	numeroRomano = new NumerosRomanos(numValidoOnce);
	int totalOnce = 1975;
	numeroRomano.calcularResultado();
	assertEquals(totalOnce, numeroRomano.getResultado());

	// ----------DuoDécimo Caso-----------//
	String numValidoDoce = "CDLXXVI";
	numeroRomano = new NumerosRomanos(numValidoDoce);
	int totalDoce = 476;
	numeroRomano.calcularResultado();
	assertEquals(totalDoce, numeroRomano.getResultado());

    }
}
