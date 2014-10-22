package anonymousClasses;

import javax.swing.JOptionPane;

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		TalkingClockIn clock = new TalkingClockIn();
		clock.start(10000, true);

		JOptionPane.showInternalMessageDialog(null, "Quit Program?");
		System.exit(0);
	}

}
