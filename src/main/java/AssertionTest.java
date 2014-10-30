public class AssertionTest {

	public static void main(String[] args) {

		System.out.print("Started");

		System.out.print("Is this a Number:" + returnAnIdenticalTwin());

	}

	public static int returnAnIdenticalTwin() {

		int aNumber = (int) (Math.random() * 100);

		assert aNumber >= 0;

		return aNumber;
	}

}