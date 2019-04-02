package org.lasencinas.NumerosRomanos.main;

import javax.swing.JOptionPane;

import org.lasencinas.NumerosRomanos.logica.NumerosRomanos;

public class Main {

    public static void main(String[] args) {
	
	String numeroTeclado = JOptionPane.showInputDialog("Escribe un número romano");
	
	NumerosRomanos numeroRomano = new NumerosRomanos(numeroTeclado);

	numeroRomano.calcularResultado();
	
	System.out.println(numeroRomano.toString());

    }

}
