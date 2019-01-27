package org.lasencinas.bowlingGame;

public class ScoreCard {
	
	
	public static String symbols = "-123456789X/";
	
	public ScoreCard() {
		
	}
	
	public int getScore(String cadena) {
		int total = 0;
		for (int i = 0; i < cadena.length(); i++) {
			total+=symbols.indexOf(cadena.charAt(i));
		}
		return total;
	}
}