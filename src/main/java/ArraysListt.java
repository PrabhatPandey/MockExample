import java.util.Arrays;

public class ArraysListt {

	public static void main(String[] args) {

		String[] aee = new String[] { "Prabaht", "Pandey" };

		String[] arr = new String[10];
		System.out.println(arr.length);
		String temp = null;

		for (String aStr : arr) {
			aStr = "";
		}

		int i = 0;

		for (String str : aee) {

			char[] aChar = str.toCharArray();

			Arrays.sort(aChar);

			 temp = aChar.toString();
			 
			 System.out.println(String.valueOf(aChar));

			arr[i] = String.valueOf(aChar);
			i++;
		}

		for (int j = 0; j < arr.length; j++) {

			System.out.println("?" + arr[i]);

		}

	}
}
