package org.lasencinas.NumerosRomanos.logica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.lasencinas.NumerosRomanos.Enum.NumeracionRomana;

public class NumerosRomanos {

    private String numeroTeclado = "";
    private Pattern pattern;
    private Matcher matcher;
    private int resultado;

    // -----------------Constructores-----------------------

    public NumerosRomanos() {
    }

    public NumerosRomanos(String numeroTeclado) {

	this.numeroTeclado = numeroTeclado;
    }

    // ------------Getters & Setters----------------//

    public String getNumeroTeclado() {

	return numeroTeclado.toUpperCase();
    }

    public int getNumeroArabigo(String numero) {

	return NumeracionRomana.valueOf(numero).getNumeroDecimal();
    }

    public int getResultado() {

	return this.resultado;
    }

    public void setResultado(int resultado) {

	this.resultado = resultado;

    }

    public void setNumeroTeclado(String numeroTeclado) {

	this.numeroTeclado = numeroTeclado;
    }

    public int longitudNumero() {

	return this.getNumeroTeclado().length();
    }

    public void mensajeError() {

	System.out.println("El número introducido no es válido");
    }

    public String secuenciaCalcular() {

	return "(CM|CD)|(IX|IV)|(XC|XL)";
    }

    public String secuenciaValidar() {

	return "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
    }

    public void comprobarCoincidencia(String secuencia, String numeroTeclado) {

	pattern = Pattern.compile(secuencia);
	matcher = pattern.matcher(numeroTeclado);
    }

    // --------------------Lógica----------------------//

    public boolean comprobarNumero() {

	comprobarCoincidencia(this.secuenciaValidar(), this.getNumeroTeclado());

	return matcher.matches();

    }

    public void calcularResultado() {

	String numero, parejasNumeros, ultimoNumero;

	int resultado = 0;

	ultimoNumero = "" + getNumeroTeclado().charAt(longitudNumero() - 1);

	if (comprobarNumero()) {

	    for (int posicion = 0; posicion < longitudNumero() - 1; posicion++) {

		numero = "" + getNumeroTeclado().charAt(posicion);

		parejasNumeros = getNumeroTeclado().substring(posicion, posicion + 2);

		comprobarCoincidencia(secuenciaCalcular(), parejasNumeros);

		if (!matcher.matches()) {

		    resultado += getNumeroArabigo(numero);

		} else {

		    resultado -= getNumeroArabigo(numero);
		}

	    }
	    setResultado(resultado + getNumeroArabigo(ultimoNumero));

	} else {

	    this.mensajeError();
	}

    }

    @Override
    public String toString() {
	return "Has introducido el número romano: " + getNumeroTeclado() + "  El resultado arábigo es: "
		+ getResultado();
    }

}