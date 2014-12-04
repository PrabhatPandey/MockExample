package Vizury;

public class ModOf {

	public static void main(String[] args) {
		int valueToAdd = 0;
		int index = 0;
		String Input = "2222222222773443333333333312";

		int number = 233;
		System.out.println(getTheMod(Input, number, index, valueToAdd));
	}

	private static int getTheMod(String input, int number, int j, int valueToDevided) {

		int mod = 0;
		while (j < input.length()) {
			String getThisChar = "" + input.charAt(j);
			valueToDevided = valueToDevided * 10 + Integer.parseInt(getThisChar);

			if (valueToDevided < number) {
				getTheMod(input, number, (j + 1), valueToDevided);
				mod = valueToDevided;
			} else {
				mod = valueToDevided % number;
				valueToDevided = mod;
				while (input.length() > j) {
					getTheMod(input, number, (j + 1), valueToDevided);
					break;
				}
			}
			j++;
		}
		return mod;
	}
}