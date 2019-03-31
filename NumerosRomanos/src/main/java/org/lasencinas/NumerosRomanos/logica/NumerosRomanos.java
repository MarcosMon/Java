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

    // --------------------Lógica----------------------//

    public boolean comprobarNumero() {

	String secuenciaNumValido = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

	pattern = Pattern.compile(secuenciaNumValido);

	matcher = pattern.matcher(getNumeroTeclado());

	return matcher.matches();

    }

    public void calcularResultado() {

	int resultado = 0;

	String secuencia = "(CM|CD)|(IX|IV)|(XC|XL)";

	String ultimoNumero = "" + getNumeroTeclado().charAt(longitudNumero() - 1);

	int valorUltimoNumero = NumeracionRomana.valueOf(ultimoNumero).getNumeroDecimal();

	if (comprobarNumero()) {

	    for (int i = 0; i < longitudNumero() - 1; i++) {

		String numero = "" + getNumeroTeclado().charAt(i);

		int numeros = NumeracionRomana.valueOf(numero).getNumeroDecimal();

		String comprobarSecuencia = getNumeroTeclado().substring(i, i + 2);

		pattern = Pattern.compile(secuencia);

		matcher = pattern.matcher(comprobarSecuencia);

		if (!matcher.matches()) {

		    resultado += numeros;

		} else {

		    resultado -= numeros;
		}

	    }
	    setResultado(resultado + valorUltimoNumero);

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