package InnerClasses;

import javax.swing.JOptionPane;

public class InnerClassTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(100, true);
		clock.start();

		// Keep program running until user selects ok.
		JOptionPane.showMessageDialog(null, "Quit Programm");
		System.exit(0);
	}
}
