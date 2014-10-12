package ProjectX;

import java.io.IOException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuckYeah {
	private static final Logger logger = LoggerFactory.getLogger(FuckYeah.class);
	private static float totalTime = 0;

	public static void main(String[] args) throws IOException {
		gameBegins();
		logger.info("total number of Tries " + (1 / totalTime));
	}

	private static int gameBegins() {
		logger.info("Lets startThe Game");
		ArrayList<String> aArrayList = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			int randomNumber = (int) (Math.random() * 200);
			aArrayList.add(String.valueOf(randomNumber));
		}
		int thisSum = 0;
		for (String str : aArrayList) {
			thisSum += Integer.valueOf(str);
		}
		logger.info("This is the final sum :" + thisSum);
		if (thisSum <= 1400) {
			totalTime++;
			gameBegins();
		}
		return thisSum;
	}
}
