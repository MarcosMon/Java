package org.lasencinas.bowlingGame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ScoreCardTest {

	private ScoreCard card = null;
	
	@Before
	public void init() {
		 card = new ScoreCard();
	}
	

	@Test
	public void TotalScoreHittingPinsTest() {

		// Hitting pins total = 60
		String pins = "12345123451234512345";
		int total = 60;

		card = new ScoreCard(pins);

		card.calcularPuntuacion();

		assertEquals(total, card.getPuntuacionTotal());
	}

	@Test
	public void TotalScoreHittingPinsFailTest() {

		// test symbol -

		String pins = "9-9-9-9-9-9-9-9-9-9-";
		int total = 90;
		 card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());

		pins = "9-3561368153258-7181";
		total = 82;
		card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());
	}

	@Test
	public void TotalScoreSpareTest() {
		/* 	
		 * If in two tries he knocks them all down, this is called
		 * a “spare” and his score for the frame is ten plus the
		 * number of pins knocked down on his next throw (in
		 * his next turn).
		 * If he gets a spare or strike in the last (tenth) frame,
		 * the bowler gets to throw one or two more bonus balls,
		 * respectively. - These bonus throws are taken as part of
		 * the same turn. If the bonus throws knock down all the
		 * pins, the process does not repeat: the bonus throws are
		 * only used to calculate the score of the final frame.
		 */

		String pins = "5/5/5/5/5/5/5/5/5/5/5";
		int total = 150;
		 card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());

		pins = "9-3/613/815/-/8-7/8/8";
		total = 131;
		card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());
	}

	@Test
	public void TotalScoreStrikeTest() {
		/* If on his first try in the frame he knocks down all the
		 * pins, this is called a “strike”. His turn is over, and his
		 * score for the frame is ten plus the simple total of the
		 * pins knocked down in his next two rolls.
		 * If he gets a spare or strike in the last (tenth) frame,
		 * the bowler gets to throw one or two more bonus balls,
		 * respectively. - These bonus throws are taken as part of
		 * the same turn. If the bonus throws knock down all the
		 * pins, the process does not repeat: the bonus throws are
		 * only used to calculate the score of the final frame.
		 */

		String pins = "X9-9-9-9-9-9-9-9-9-";
		int total = 100;
		 card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());

		// two extra final rolls
		pins = "9-9-9-9-9-9-9-9-9-X9-";
		total = 100;
		card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());

		pins = "X9-X9-9-9-9-9-9-9-";
		total = 110;
		card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());

		// two strikes in a row is a double
		pins = "XX9-9-9-9-9-9-9-9-";
		total = 120;
		card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());

		// three strikes in a row is a triple
		pins = "XXX9-9-9-9-9-9-9-";
		total = 141;
		card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());

		// two strikes in extra rolls
		pins = "9-9-9-9-9-9-9-9-9-XXX";
		total = 111;
		card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());

		// 12 strikes is a “Thanksgiving Turkey”.
		pins = "XXXXXXXXXXXX";
		total = 300;
		card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());

		// spare in extra roll
		pins = "8/549-XX5/53639/9/X";
		total = 149;
		card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());

		// spare in extra roll
		pins = "X5/X5/XX5/--5/X5/";
		total = 175;
		card = new ScoreCard(pins);
		card.calcularPuntuacion();
		assertEquals(total, card.getPuntuacionTotal());

	}
}

