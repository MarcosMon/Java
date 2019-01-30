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
	@Test
	public void Test5() {
		String tiradas = "9-3/613/815/-/8-7/8/8";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 131;
		assertEquals(total, card.getPuntuacionTotal());
	} 
	@Test
	public void test6() {
		String tiradas = "9-3561368153258-7181";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 82;
		assertEquals(total, card.getPuntuacionTotal());
	}
	@Test
	public void test7() {
		String tiradas = "X9-9-9-9-9-9-9-9-9-";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 100;
		assertEquals(total, card.getPuntuacionTotal());
	} 
	@Test
	public void test8() {
		String tiradas = "9-9-9-9-9-9-9-9-9-X9-";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 100;
		assertEquals(total, card.getPuntuacionTotal());
	} 
	@Test
	public void test9() {
		String tiradas = "X9-X9-9-9-9-9-9-9-";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 110;
		assertEquals(total, card.getPuntuacionTotal());
	} 
	@Test
	public void test10() {
		String tiradas = "XX9-9-9-9-9-9-9-9-";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 120;
		assertEquals(total, card.getPuntuacionTotal());
	}
	@Test
	public void test11() {
		String tiradas = "XXX9-9-9-9-9-9-9-";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 141;
		assertEquals(total, card.getPuntuacionTotal());
	} 
	@Test
	public void test12() {
		String tiradas = "9-9-9-9-9-9-9-9-9-XXX";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 111;
		assertEquals(total, card.getPuntuacionTotal());
	} 
	@Test
	public void test13() {
		String tiradas = "X5/X5/XX5/--";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 135;
		assertEquals(total, card.getPuntuacionTotal());
	} 
	@Test
	public void test14() {
		String tiradas = "X5/X5/XX5/--5/X5/";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 175;
		assertEquals(total, card.getPuntuacionTotal());
	}
	@Test
	public void test15() {
		String tiradas = "8/549-XX5/53639/9/X";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 149;
		assertEquals(total, card.getPuntuacionTotal());
	}
	@Test
	public void test16() {
		String tiradas = "XXXXXXXXXXXX";
		card = new ScoreCard(tiradas);
		card.calcularPuntuacion();
		int total = 300;
		assertEquals(total, card.getPuntuacionTotal());
	}
}

