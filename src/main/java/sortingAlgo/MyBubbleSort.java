package sortingAlgo;

public class MyBubbleSort {

	// logic to sort the elements
	// Coding is wrong although it sorts the array anyway
	// Look it up in the internet.
	public static void bubble_srt(int array[]) {
		for (int i : array) {
			System.out.print(" " + i);
		}
		int n = array.length;
		int k;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k]) {
					swapNumbers(i, k, array);
				}
			}
			printNumbers(array);
		}
	}

	private static void swapNumbers(int i, int j, int[] array) {
		System.out.println(" ");
		System.out.println("Swapping these two" + array[i] + " . " + array[j]);
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubble_srt(input);
	}
}