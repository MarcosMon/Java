package org.lasencinas.bowlingGame;

import static org.junit.Assert.*;

import org.junit.Test;


public class ScoreCardTest {

	
	@Test
	/*always hitting pins without getting spares or strikes, a total score of 60.*/
	public void sampleGames() {
		String symbols = "12345123451234512345";
		ScoreCard card = new ScoreCard();
		int total = 60;
		assertEquals(total, card.getScore(symbols));
	}
	@Test
	/*heartbreak - 9 pins down each round, giving a score of 90.*/
	public void heartBreak () {
		String symbols = "9-9-9-9-9-9-9-9-9-9-";
		ScoreCard card = new ScoreCard();
		int total = 90;
		assertEquals(total, card.getScore(symbols));
	}

}
