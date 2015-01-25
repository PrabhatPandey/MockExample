package threading;

public class simpleOddNumbers implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {

			if (i % 2 == 0) {

				System.out.println("This is an even number: " + i);
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
