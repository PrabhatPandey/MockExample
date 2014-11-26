package Collections;

import java.nio.file.WatchEvent;
import java.util.EnumSet;

public class Enumeration {
	enum WeekDay {
		MON, TUE, WED, THU, FRI, SAT, SUNDAY
	};

	public static void main(String[] args) {
		EnumSet<WeekDay> always = EnumSet.allOf(WeekDay.class);
		EnumSet<WeekDay> never = EnumSet.noneOf(WeekDay.class);
		EnumSet<WeekDay> workday = EnumSet.range(WeekDay.MON, WeekDay.FRI);
		for (WeekDay str : workday) {
			System.out.println("What is this ?" + str);
		}
	}
}
