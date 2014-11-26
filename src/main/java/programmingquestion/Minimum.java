package programmingquestion;

public class Minimum {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5 };

		int sum = 112;

		findMinimum(arr, sum);

	}

	private static void findMinimum(int[] arr, int sum) {

		int MinTotal = addAll(arr);

		System.out.println("Min Total" + MinTotal);

		if (sum < MinTotal) {

			doThis(arr, sum);

		} else {

			doThat(arr, sum);
		}
	}

	private static void doThat(int[] arr, int sum) {
		boolean found = false;

		while (!found) {

			for (int i = 0; i < arr.length - 1; i++) {
				// Try this
				arr[i] = arr[i + 1] + arr[i];
				if (arr[i] > sum) {
					
//					doThis(arr, sum);

				} else if (arr[i] < sum) {
				
					for(int k = 0 ;k< arr.length ; k ++ ){
						
						
						
					}
				
				}

			}

		}
	}

	private static void doThis(int[] arr, int sum) {

	}

	private static int addAll(int[] arr) {
		int k = 0;

		for (int i : arr) {
			k = k + k + 1;
		}
		return 0;
	}
}
