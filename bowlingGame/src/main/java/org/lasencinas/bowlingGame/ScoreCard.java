package org.lasencinas.bowlingGame;

public class ScoreCard {

    private String tiradas = "";
    private int puntuacionTotal = 0;
    public static String symbols = "-123456789X/";

    public ScoreCard() {

    }

    public ScoreCard(String tiradas) {
	this.tiradas = tiradas;
    }

    public String getTiradas() {
	return this.tiradas;
    }

    public int getPuntuacionTotal() {
	return this.puntuacionTotal;
    }

    public void setPuntuacion(int puntuacion) {
	this.puntuacionTotal = puntuacion;
    }

    public void calcularPuntuacion() {
	int puntuacion = 0;
	int contar = 0;
	for (int i = 0; i < getTiradas().length(); i++) {

	    if (getTiradas().charAt(i) == 'X') {
		contar++;
		if (contar < 19) {
		    if (getTiradas().charAt(i + 1) == 'X') {
			int primeraTirada = symbols.indexOf(getTiradas().charAt(i + 1) * 2);
			int segundaTirada = symbols.indexOf(getTiradas().charAt(i + 2));
			puntuacion += 21 + primeraTirada + segundaTirada;
		    }

		    else if (getTiradas().charAt(i + 2) == '/') {
			puntuacion += 20;
		    } else {
			int primeraTirada = symbols.indexOf(getTiradas().charAt(i + 1));
			int segundaTirada = symbols.indexOf(getTiradas().charAt(i + 2));

			puntuacion += 10 + primeraTirada + segundaTirada;
		    }

		} else {
		    puntuacion += 10;
		}

	    }

	    else if (getTiradas().charAt(i) == '/') {
		int tiradaAnterior = symbols.indexOf(getTiradas().charAt(i - 1));
		if (contar < 19) {
		    puntuacion += 10 + symbols.indexOf(getTiradas().charAt(i + 1)) - tiradaAnterior;
		} else {
		    puntuacion += 10 - tiradaAnterior;
		}
	    } else {
		puntuacion += symbols.indexOf(getTiradas().charAt(i));
	    }
	    contar += 1;

	}
	setPuntuacion(puntuacion);
    }

}
