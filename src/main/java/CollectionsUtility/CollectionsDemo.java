package CollectionsUtility;

import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
		Random newRandom = new Random(0);

		for (int i = 0; i < 10; i++) {

			System.out.println(i + " th random number is " + (newRandom.nextInt(10)));

		}

		Vector<String> vector = new Vector<String>();
		vector.add("1");
		vector.add("2");
		vector.add("3");
		vector.add("4");
		vector.add("5");

		String[] newIntArray = new String[] { "she", "never", "Loved", "Coding", "The", "she" };
		List<String> aList = Arrays.asList(newIntArray);
		System.out.println("Before swap: " + aList);
		// swap the elements
		Collections.swap(aList, 0, 4);
		Collections.reverse(aList);
		Collections.shuffle(aList);
		Collections.replaceAll(aList, "44", "89");
		System.out.println(Collections.max(aList));
		System.out.println(Collections.disjoint(aList, vector));
		System.out.println(Collections.frequency(aList, "she"));
		Collections.rotate(aList, -1);
		System.out.println(aList);
		System.out.println("After swap: " + aList);
	}
}