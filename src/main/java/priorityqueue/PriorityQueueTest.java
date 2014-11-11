package priorityqueue;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<GregorianCalendar> pq = new PriorityQueue<GregorianCalendar>();
		pq.add(new GregorianCalendar(1906, Calendar.DECEMBER, 9));
		pq.add(new GregorianCalendar(1815, Calendar.DECEMBER, 10));
		pq.add(new GregorianCalendar(1903, Calendar.DECEMBER, 9));
		pq.add(new GregorianCalendar(1910, Calendar.DECEMBER, 9));
		System.out.println("Iterating over elements...");
		for (GregorianCalendar date : pq) {
			System.out.println(date.get(Calendar.YEAR));
			System.out.println("removing the elements");
			while (!pq.isEmpty())
				System.out.println(pq.remove().get(Calendar.YEAR));
		}
		if (pq.isEmpty()) {
			System.out.println("Queue is empty");
		}
	}
}
