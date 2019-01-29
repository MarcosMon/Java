package org.lasencinas.bowlingGame;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ScoreCardTest {

	private ScoreCard card = null;
	
	@Before
	public void init() {
		 card = new ScoreCard();
	}
	
	@Test
	/*always hitting pins without getting spares or strikes, a total score of 60.*/
	public void sampleGames() {
		String tiradas = "12345123451234512345";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 60;
		assertEquals(total, card.getPuntuacionTotal());
	}

	@Test
	/*heartbreak - 9 pins down each round, giving a score of 90.*/
	public void heartBreak () {
		String tiradas = "9-9-9-9-9-9-9-9-9-9-";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 90;
		assertEquals(total, card.getPuntuacionTotal());
	}
	@Test
	public void semiPlenos() {
		String tiradas = "5/5/5/5/5/5/5/5/5/5/-";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total=145;
		assertEquals(total, card.getPuntuacionTotal());
	}
	@Test
	public void semiPleno() {
		String tiradas = "5/5/5/5/5/5/5/5/5/5/5";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total=150;
		assertEquals(total, card.getPuntuacionTotal());
	}
	@Test
	public void simpleStrike() {
		String tiradas = "12X51X4512X512345";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 92;
		assertEquals(total, card.getPuntuacionTotal());
	} 
}

