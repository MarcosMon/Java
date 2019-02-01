package org.lasencinas.bowlingGame;

public class ScoreCard {

    private String tiradas = "";
    private int puntuacionTotal = 0;
    private int STRIKE = 10;
    private int SPARE = 10;
    private int posicionUno = 1;
    private int posicionDos = 2;

    public static String symbols = "-123456789X/";

    // ------------Constructores------------------//

    ScoreCard() {

    }

    public ScoreCard(String tiradas) {
	this.tiradas = tiradas;
    }
    
    /*---------------- Getters and Setters -------------------------*/

    public String getTiradas() {
	return this.tiradas;
    }

    public int getPuntuacionTotal() {
	return this.puntuacionTotal;
    }

    public void setPuntuacion(int puntuacion) {
	this.puntuacionTotal = puntuacion;
    }
    
    /*---------------- Métodos -------------------------*/

    public int longitudCarton() {
	return getTiradas().length();
    }

    public int bolosDerribados(char bolos) {
	return symbols.indexOf(bolos);
    }

    public int recuentoLanzamientos(int tirada) {
	return bolosDerribados(getTiradas().charAt(tirada));

    }

    public int derribo(int bola) {
	return getTiradas().charAt(bola);
    }

    public void calcularPuntuacion() {
	int puntuacion = 0;
	int posicionesTarjeta = 0;

	for (int bola = 0; bola < longitudCarton(); bola++) {

	    if (derribo(bola) == 'X') {
		posicionesTarjeta++;
		if (posicionesTarjeta < 19) {
		    if (recuentoLanzamientos(bola + posicionUno) == 'X') {

			puntuacion += STRIKE + recuentoLanzamientos(bola + posicionUno)
				+ recuentoLanzamientos(bola + posicionDos);
		    }

		    else if (derribo(bola + posicionDos) == '/') {
			puntuacion += STRIKE + SPARE;
		    } else {

			puntuacion += STRIKE + recuentoLanzamientos(bola + posicionUno)
				+ recuentoLanzamientos(bola + posicionDos);
		    }

		} else {
		    puntuacion += STRIKE;
		}

	    } else if (derribo(bola) == '/') {
		if (posicionesTarjeta < 19) {

		    puntuacion += SPARE + recuentoLanzamientos(bola + posicionUno) - recuentoLanzamientos(bola - 1);
		} else {
		    puntuacion += SPARE - recuentoLanzamientos(bola - 1);
		}
	    } else {
		puntuacion += recuentoLanzamientos(bola);
	    }

	    posicionesTarjeta++;
	}
	setPuntuacion(puntuacion);
    }

    public void mostrarPuntuacionTotal() {
	System.out.println("Tu puntuación total es de: " + getPuntuacionTotal() + " Puntos");
    }

}
