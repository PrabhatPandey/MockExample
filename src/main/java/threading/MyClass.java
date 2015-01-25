package threading;

public class MyClass {

	public static void main(String[] args) {

		Runnable r = new simpleOddNumbers();
		Runnable z = new SimpleEvenNumbers();

		Thread t = new Thread(r);
		Thread x = new Thread(z);

		x.start();
		t.start();
	}
}
