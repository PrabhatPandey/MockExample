package programmingquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteRepeatedChar {

	public static void main(String[] args) {

		// String name = "BPRABHAT";

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter user name : ");
		String name = null;
		try {
			name = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		boolean[] checker = new boolean[256];
		StringBuffer newStr = new StringBuffer(name);
		for (boolean bol : checker) {
			bol = false;
		}
		for (int i = -1; i < newStr.length(); i++) {
			for (int j = i + 1; j < newStr.length(); j++) {
				int value = newStr.charAt(j);
				if (checker[value]) {
					newStr.deleteCharAt(j);
				}
				checker[value] = true;
			}
		}
		System.out.println(newStr);
	}
}
