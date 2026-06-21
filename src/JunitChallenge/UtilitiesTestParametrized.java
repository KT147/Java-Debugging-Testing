package JunitChallenge;

import UnitTesting.BankAccount;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParametrized {

	private Utilities utilities;
	private String input;
	private String expected;

	public UtilitiesTestParametrized(String input, String expected) {
		this.input = input;
		this.expected = expected;
	}

	@org.junit.Before
	public void setup() {
		utilities = new Utilities();
		System.out.println("Running a test...");
	}

	@Parameterized.Parameters
	public static Collection<Object[]> testConditions() {
		return Arrays.asList(new Object[][] {
				{"ABCDEFF", "ABCDEF"},
				{"AB88EFFG", "AB8EFG"},
				{"112233445566", "123456"},
				{"ZYZQQB", "ZYZQB"},
				{"A", "A"}
		});
	}

	@org.junit.Test
	public void removePairs() {
	assertEquals(expected, utilities.removePairs(input));
	}
}
