package genericClasses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PairTest {
	/**
	 * sends a list of messages
	 * 
	 * @param ArrayList
	 */

	private static final Logger logger = LoggerFactory.getLogger(PairTest.class);

	public static void main(String[] args) {
		String[] words = { "mary", "had", "a", "little", "lamb" };
		Pair<String> mm = ArrayAlgNew.minmax(words);
		logger.info("min" + mm.getFirst());
		logger.info("max" + mm.getSecond());
	}
}
