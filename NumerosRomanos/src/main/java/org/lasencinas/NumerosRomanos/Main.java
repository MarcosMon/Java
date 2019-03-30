package org.lasencinas.NumerosRomanos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	String numeroTeclado = JOptionPane.showInputDialog("Escribe un número romano");
	NumerosRomanos numeroRomano = new NumerosRomanos(numeroTeclado);
	System.out.println(numeroRomano.comprobarNumero());

    }

}
