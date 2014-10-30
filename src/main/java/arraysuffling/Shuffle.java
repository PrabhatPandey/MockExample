package arraysuffling;

import java.util.ArrayList;

public class Shuffle {
	public static void main(String[] args) {
		int[] anArray = new int[] { 90, 80, 70, 60, 50, 11, 22, 44, 55, 10 };

		ArrayList<Integer> holdTheRandomNumbers = new ArrayList<Integer>();
		int total = 10;
	
		for (int i : holdTheRandomNumbers) {
			System.out.println("" + i);
		}

		for (int i = 1; i < 11; i++) {
			ArrayFilledWithRandomNumbers(total, holdTheRandomNumbers);

			System.out.println("");
			int[] aNewArray = shuffleAndReturn(holdTheRandomNumbers, anArray);
			for (int j : aNewArray) {
				System.out.print(" " + j);
			}
		}
	}

	public static int[] shuffleAndReturn(ArrayList<Integer> aArray, int[] originalArray) {
		int tempRandomNumber = (int) (Math.random() * originalArray.length);	
		
		int temp = originalArray[tempRandomNumber];
		originalArray[tempRandomNumber] = originalArray[aArray.get(0)];
		originalArray[aArray.get(0)] = temp;
		
		aArray.remove(aArray.get(0));
		return originalArray;
	}

	public static ArrayList<Integer> ArrayFilledWithRandomNumbers(int i, ArrayList<Integer> aArray) {
		int j = randomNumberGenerator(i);
		if (!aArray.contains(j)) {
			aArray.add(j);
		} else {
			ArrayFilledWithRandomNumbers(i, aArray);
		}
		return aArray;
	}

	public static int randomNumberGenerator(int i) {
		int randomNumber = (int) (Math.random() * i);
		return randomNumber;
	}
}
