package JunitChallenge;

public class Main {

	public static void main(String[] args) {

		Utilities utilities = new Utilities();

//		System.out.println(utilities.removePairs("ABBCDEEF"));
		char[] charArray = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(utilities.everyNthChar(charArray, 2));
	}
}
