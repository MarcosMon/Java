package org.lasencinas.bowlingGame;

public class ScoreCard {

    private String tiradas = "";
    private int puntuacionTotal = 0;
    private int STRIKE = 10;
    private int SPARE = 10;
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
	int posicionesTarjeta = 0;
	for (int i = 0; i < getTiradas().length(); i++) {
	    if (getTiradas().charAt(i) == 'X') {
		posicionesTarjeta++;
		if (posicionesTarjeta < 19) {
		    if (getTiradas().charAt(i + 1) == 'X' || getTiradas().charAt(i+2) == 'X') {
			int primeraTirada = symbols.indexOf(getTiradas().charAt(i + 1)*2);
			int segundaTirada = symbols.indexOf(getTiradas().charAt(i + 2));
			puntuacion += 21 + primeraTirada + segundaTirada;
		    }

		    else if (getTiradas().charAt(i + 2) == '/') {
			puntuacion += STRIKE + SPARE;
		    } else {
			int primeraTirada = symbols.indexOf(getTiradas().charAt(i + 1));
			int segundaTirada = symbols.indexOf(getTiradas().charAt(i + 2));

			puntuacion += STRIKE + primeraTirada + segundaTirada;
		    }

		} else {
		    puntuacion += STRIKE;
		}

	    }

	    else if (getTiradas().charAt(i) == '/') {
		int tiradaAnterior = symbols.indexOf(getTiradas().charAt(i - 1));
		
		if (posicionesTarjeta < 19) {
		    puntuacion += SPARE + symbols.indexOf(getTiradas().charAt(i + 1)) - tiradaAnterior;
	        }else {
		    puntuacion += SPARE - tiradaAnterior;
		}
	    } else {
		puntuacion += symbols.indexOf(getTiradas().charAt(i));
	    }
	    posicionesTarjeta += 1;

	}
	setPuntuacion(puntuacion);
    }

}
