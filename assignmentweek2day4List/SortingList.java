package assignmentweek2day4List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		
		String Arr[]= {"HCL","WIPRO","Aspire Systems","CTS"};
		
		List <String> listSorting =new ArrayList <String> ();	
		
		for(String Element:Arr)
		{
			listSorting.add(Element);
		}
			
		Collections.sort(listSorting);
		
		System.out.println("Sorted List Output : " +listSorting);
		
		Collections.reverse(listSorting);
		
		System.out.println("Reversed list output :" +listSorting);
		}
	}
