package programmingquestion;

public class ReverseCStypleString {

	public static void main(String[] args) {

		// Write code to reverse a C-Style String

		String newString = "a%cd ";
		char[] array = newString.toCharArray();
		for (int i = 0; i < (array.length - i - 1); i++) {
			char temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		System.out.println(newString);
	}
}
