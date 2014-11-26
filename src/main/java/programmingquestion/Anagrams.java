package programmingquestion;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] main) {

		String aString = "Ram";
		String bString = "maR";

		char[] aChar = aString.toCharArray();
		char[] bChar = bString.toCharArray();

		Arrays.sort(aChar);
		Arrays.sort(bChar);

		System.out.println((aChar));
		System.out.println((bChar));

		if (Arrays.equals(aChar, bChar)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("NOPE");
		}
	}
}
