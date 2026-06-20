package JunitChallenge;

import static org.junit.Assert.*;

public class UtilitiesTest {

	Utilities utilities = new Utilities();

	@org.junit.Test
	public void everyNthChar() {
		fail("Failed");
	}

	@org.junit.Test
	public void removePairs() {
		assertEquals( "ABCDEF", utilities.removePairs("ABBCDEEF"));

	}

	@org.junit.Test
	public void converter() {
		fail("Failed");
	}

	@org.junit.Test
	public void nullIfOddLength() {
		fail("Failed");
	}

}
