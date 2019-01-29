package org.lasencinas.bowlingGame;

public class ScoreCard {
	
	private String tiradas = "";
	private int puntuacionTotal=0;
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
		this.puntuacionTotal=puntuacion;
	}
	
	public void calcularPuntuacion() {
		int puntuacion = 0;
		
		for (int i = 0; i < getTiradas().length(); i++) {
			 
				if (getTiradas().charAt(i) == 'X') {
					int segundaTirada = symbols.indexOf(getTiradas().charAt(i+2));
					puntuacion+=10 +  symbols.indexOf(getTiradas().charAt(i+1) + segundaTirada);
				}
				else if(getTiradas().charAt(i) == '/') {
					int tiradaAnterior = symbols.indexOf(getTiradas().charAt(i-1));
					if (i < 19) {
						puntuacion+=10 + symbols.indexOf(getTiradas().charAt(i+1)) - tiradaAnterior;
				}
					else {
						puntuacion+=10  - tiradaAnterior;
					}
				}
				else {
					puntuacion+=symbols.indexOf(getTiradas().charAt(i));
				}
				
		}
		setPuntuacion(puntuacion);
	}
		

	}	
