package InnerClasses;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

/**
 * @author prabhat
 *
 */
public class TalkingClock {

	private int interval;
	private boolean beep;

	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}

	public void start() {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	};

	public class TimePrinter implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Date now = new Date();
			System.out.println("At the tone , the time is :" + now);
			if (beep)
				Toolkit.getDefaultToolkit().beep();
		}
	}
}
