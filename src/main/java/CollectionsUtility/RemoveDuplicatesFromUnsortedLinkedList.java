package CollectionsUtility;

import java.util.Hashtable;
import java.util.LinkedList;

public class RemoveDuplicatesFromUnsortedLinkedList {

	public static void main(String[] args) {

		LinkedList<String> aLinkedList = new LinkedList<String>();
		aLinkedList.add("RAMU");
		aLinkedList.add("DOES");
		aLinkedList.add("SPEAK");
		aLinkedList.add("Tamil");
		aLinkedList.add("DOES");
		aLinkedList.add("RAMU");
		removeDuplicates(aLinkedList);
		// delete_duplicated1(aLinkedList);
	}

	private static void removeDuplicates(LinkedList aLinkedList) {
		Hashtable<String, Boolean> aHashtable = new Hashtable<String, Boolean>();
		for (int i = 0; i < aLinkedList.size(); i++) {
			if (aHashtable.containsKey((aLinkedList.get(i)))) {
				aLinkedList.remove(i);
				i--;
			} else {
				System.out.println("Adding this element" + aLinkedList.get(i));
				aHashtable.put(aLinkedList.get(i).toString(), true);
			}
		}
	}
}
