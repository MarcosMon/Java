package org.lasencinas.NumerosRomanos.logica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosRomanos {

    String numeroTeclado = "";

    // -----------------Constructores-----------------------

    public NumerosRomanos() {
    }

    public NumerosRomanos(String numeroTeclado) {

	this.numeroTeclado = numeroTeclado;
    }

    // ------------Getters & Setters----------------//

    public String getNumeroTeclado() {
	return numeroTeclado;
    }

    public void setNumeroTeclado(String numeroTeclado) {
	this.numeroTeclado = numeroTeclado;
    }

    // --------------------Lógica----------------------//

    public boolean comprobarNumero() {

	String secuenciaNumValido = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

	Pattern pattern = Pattern.compile(secuenciaNumValido);

	Matcher matcher = pattern.matcher(getNumeroTeclado());

	return matcher.matches();

    }

}