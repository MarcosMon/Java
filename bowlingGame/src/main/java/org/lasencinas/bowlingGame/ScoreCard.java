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
	public int getsemiPleno(String cadena) {
		int total=0;
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == '/') {
				total+=10 + symbols.indexOf(cadena.charAt(i+1));
			}
		}
		return total;
		
	}
	public int simpleStrike(String cadena) {
		int total=0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'X') {
				int ok = symbols.indexOf(cadena.charAt(i+2));
				total+=10 +  symbols.indexOf(cadena.charAt(i+1) + ok );
			}
			else {
				total+= symbols.indexOf(cadena.charAt(i));
			}
	
		}
		return total;
	}
	
}