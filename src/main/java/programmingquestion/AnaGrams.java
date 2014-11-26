//package programmingquestion;
//
//import java.util.Arrays;
//import java.util.Hashtable;
//import java.util.LinkedList;
//import java.util.List;
//
//public class AnaGrams {
//
//	public static void main(String[] args) {
//
//		List<String> newList = new LinkedList<String>();
//		List<String> newList2 = new LinkedList<String>();
//
//		String z = "bat";
//		String y = "abt";
//		
//		
//		Hashtable<String, Integer> nnn = new Hashtable<String, Integer>();
//		
//		String[] str = { "xyz", "bat", "atb", "tac", "cat", "tab" };
//
//		for (int j = 0; j < str.length; j++) {
//			System.out.println(newList2.add(str[j].toString()));
//		}
//
////		System.out.println(newList2);
////		System.out.println(newList);
//		sortTheArray(newList2, newList);
//
//	}
//
//	private static void sortTheArray(List str, List newList) {
//
//		for (int i = 0; i < str.size(); i++) {
//			
//			for (int j = i + 1; j < str.size(); j++) {
//				
//				
//				Arrays.sort(str.get(i).toString().toCharArray());
//				Arrays.sort(str.get(j).toString().toCharArray());
//				System.out.println("str"+strr);
////				System.out.println("??"+str.get(i).toString());
//				
//				if (str.get(i).toString().equals(str.get(j).toString())) {
////					System.out.println("This :" + str.get(i).toString() + "Matches" + str.get(j).toString());
//					newList.add(str.get(i));
//				}
//
//			}
//
//		}
//
////		System.out.println("?" + newList);
//
//	}
//}
