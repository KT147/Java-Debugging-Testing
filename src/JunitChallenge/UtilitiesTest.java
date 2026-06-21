package JunitChallenge;

import static org.junit.Assert.*;

public class UtilitiesTest {

	Utilities utilities = new Utilities();

	@org.junit.Test
	public void everyNthChar() {
		char[] charArray = {'h', 'e', 'l', 'l', 'o'};
		char[] charsExpected = {'e', 'l'};
		assertArrayEquals(charsExpected, utilities.everyNthChar(charArray, 2));
	}

	@org.junit.Test
	public void everyNthChar2() {
		char[] charArray = {'h', 'e', 'l', 'l', 'o'};
		assertArrayEquals(charArray, utilities.everyNthChar(charArray, charArray.length + 1));
	}

	@org.junit.Test
	public void removePairs() {
		assertEquals( "ABCDEF", utilities.removePairs("ABBCDEEF"));
		assertEquals( "ABCABDEF", utilities.removePairs("ABCCABDEEF"));
		assertEquals( null, utilities.removePairs(null));
		assertEquals( "A", utilities.removePairs("A"));
		assertEquals( "", utilities.removePairs(""));
	}

	@org.junit.Test
	public void removePairs2() {
		assertEquals( "ABCDEF", utilities.removePairs("ABCDEFF"));
		assertEquals( "AB8EFG", utilities.removePairs("AB88EFFG"));
		assertEquals( "123456", utilities.removePairs("112233445566"));
		assertEquals( "ZYZQB", utilities.removePairs("ZYZQQB"));
		assertEquals( "A", utilities.removePairs("A"));
	}

	@org.junit.Test
	public void converter() {
		assertEquals(300, utilities.converter(10,5));
	}

	@org.junit.Test(expected = ArithmeticException.class)
	public void converter_arithmeticException() {
		utilities.converter(10,0);
	}

	@org.junit.Test
	public void nullIfOddLength() {
		assertNull( utilities.nullIfOddLength("AAA"));
		assertNotNull(utilities.nullIfOddLength("AAAA"));
	}

}
