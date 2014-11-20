import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Repetition {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Prabhat");
		list.add("Is");
		list.add("a");
		list.add("Great");
		list.add("Coder");
		list.add("Is");
		list.add("Not");
		list.add("Prabhat");
		list.add("Great");
		findRepition(list);
	}

	private static void findRepition(ArrayList<String> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Iterator<String> iter = list.iterator();
			while (iter.hasNext()) {
				String temp = list.get(i);
				String nextElement = iter.next();
				if (temp.equals(nextElement)) {
					count++;
//					list.remove(temp);
				}// If
				iter.remove();
			}// while
			System.out.println(list.get(i) + " ==> " + count);
			count = 0;
		}// for

	}
}