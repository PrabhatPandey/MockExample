package anonymousClasses;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

/**
 * @author prabhat
 *
 */
public class TalkingClockIn {
	public void start(int interval, final boolean beep) {
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				if (beep)
					Toolkit.getDefaultToolkit().beep();
			}
		};
		Timer t = new Timer(interval, listener);
		t.start();
	}
}
