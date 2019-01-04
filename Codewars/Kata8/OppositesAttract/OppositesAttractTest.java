import static org.junit.Assert.*;

import org.junit.Test;

public class OppositesAttractTest {

	@Test
	public void testOddAndEven() {
		assertEquals(true, OppositesAttract.isLove(1, 4));
	}
	
	@Test
	public void testEvenAndEven() {
		assertEquals(false, OppositesAttract.isLove(2, 2));

	}

	
	@Test
	public void testOddAndOdd() {
		assertEquals(false, OppositesAttract.isLove(4, 4));

	}
	
	@Test
	public void testEvenAndOdd() {
		assertEquals(true, OppositesAttract.isLove(0, 1));

	}
}
