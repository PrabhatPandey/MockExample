package ProjectX;

import java.io.IOException;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuckYeah {
	private static final Logger logger = LoggerFactory.getLogger(FuckYeah.class);
	private static float totalTime = 0;

	public static void main(String[] args) throws IOException {
		logger.info("Lets startThe Game");
		gameBegins();
		logger.info("total number of Tries " + totalTime);
	}

	private static int gameBegins() {
		ArrayList<String> aArrayList = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			int randomNumber = (int) (Math.random() * 200);
			aArrayList.add(String.valueOf(randomNumber));
		}
		int thisSum = 0;
		for (String str : aArrayList) {
			try {
				thisSum += Integer.valueOf(str);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		if (thisSum <= 1) {
			totalTime++;
			gameBegins();
		}
		return thisSum;
	}
}
