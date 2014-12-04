package programmingquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AnaGrams {

	private static ArrayList<String> anotherLinkedList;

	public static void main(String[] args) {

		String[] arr = { "bat", "tar", "xyz", "tab", "tar" };

		//
		ArrayList<String> aLinkedList = new ArrayList<String>();
		String[] sortedAlphabaticaly = sortAphabatically(arr, aLinkedList);

		anotherLinkedList = putThemTogether(aLinkedList, arr, sortedAlphabaticaly);

		// System.out.println(anotherLinkedList);

	}

	private static ArrayList<String> putThemTogether(ArrayList<String> aLinkedList, String[] arr,
			String[] sortedAlphabaticaly) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (sortedAlphabaticaly[i].compareTo(sortedAlphabaticaly[j]) > 0) {

					String temp = sortedAlphabaticaly[i];

					String aTemp = arr[i];

					sortedAlphabaticaly[i] = sortedAlphabaticaly[j];

					arr[i] = arr[j];

					sortedAlphabaticaly[j] = temp;

					arr[j] = aTemp;

				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

		return aLinkedList;

	}

	public static String[] sortAphabatically(String[] arr, ArrayList<String> aLinkedList) {

		for (String str : arr) {

			String aString = str;

			char[] aChar = aString.toCharArray();

			Arrays.sort(aChar);

			aLinkedList.add(String.valueOf(aChar));
		}

		Iterator<String> itr = aLinkedList.iterator();
		while (itr.hasNext()) {
			System.out.println("?" + itr.next().toString().toString());
		}
		arr = aLinkedList.toArray(new String[0]);

		return arr;
	}
}