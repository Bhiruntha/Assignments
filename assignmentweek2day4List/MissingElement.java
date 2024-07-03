package assignmentweek2day4List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 4, 10, 6, 8 };
		Arrays.sort(array);
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int array1 : array) {
			list1.add(array1);

		}
		
		int lastValue = list1.get(list1.size() - 1);
		System.out.println("Last Element " +list1.get(list1.size() - 1));
		
		list2.add(list1.get(0));
		System.out.println("First Number Added :" +list2);
		
		for (int i = list1.get(0); i <= lastValue - 1; i++) {
			list2.add(i + 1);
			if (i == lastValue) {
				break;
			}

		}
		System.out.println("Elements in List1 :" +list1);
		System.out.println("Elements in List2 :" +list2);
		
		list2.removeAll(list1);
		System.out.println("Missing Numbers : " +list2);

	}

}
