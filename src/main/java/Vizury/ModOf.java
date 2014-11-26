package Vizury;


public class ModOf {

	public static void main(String[] args) {
		int remainder = 0;
		int valueToAdd = 0;
		int index = 0;
		String Input = "142000";

		int number = 91;
		System.out.println(getTheMod(Input, number, index, valueToAdd));
	}

	private static int getTheMod(String input, int number, int j, int valueToDevided) {

		int mod = 0;
		for (int i = j; i < input.length(); i++) {

			String getThisChar = "" + input.charAt(i);
			valueToDevided = valueToDevided * 10 + Integer.parseInt(getThisChar);

			if (valueToDevided < number) {
				getTheMod(input, number, (i + 1), valueToDevided);
				mod = valueToDevided;
			} else {
				mod = valueToDevided % number;
				valueToDevided = mod;
				while (input.length() > i) {
					getTheMod(input, number, (i + 1), valueToDevided);
					break;
				}
			}

		}

		return mod;
	}
}