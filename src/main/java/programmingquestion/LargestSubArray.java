package programmingquestion;

public class LargestSubArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 0, 1, 0, 1 };

		int[] foundSub = findTheLargestSubarray(arr);
	}

	private static int[] findTheLargestSubarray(int[] arr) {

		int maxsize = -1;
		int sum = 0;
		int fromIndex = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {

				sum = -1;

			} else {

				sum = 1;
			}

			for (int j = i + 1; j < arr.length - 1; j++) {

				if (arr[j] == 0) {

					sum = sum + (-1);

				} else {

					sum = sum + 1;

				}

				if (sum == 0 && maxsize < j - i + 1) {

					fromIndex = i;

					System.out.println("Starting index : " + i);

					maxsize = j - 1 + 1;

					System.out.println("ending index : " + maxsize);

				}

			}

		}

		return arr;

	}
}