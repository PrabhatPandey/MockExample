package threading;

public class SimpleEvenNumbers implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {

			if (i % 2 != 0) {

				System.out.println("This is an Odd number: " + i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}
