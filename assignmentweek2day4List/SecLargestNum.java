package assignmentweek2day4List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecLargestNum {

	public static void main(String[] args) {
		//Create List to store all values
		List <Integer> number =new ArrayList <Integer>();
		number.add (3);
		number.add (2);
		number.add (11);
		number.add (4);
		number.add (6);
		number.add (7);
		System.out.println("Before Sorting : " + number);
		
		//Sort the List
		Collections.sort(number);
		
		System.out.println("After Sorting : " + number);
		
		Integer Count = number.size();
		
		System.out.println("Count of Elements : " + Count);
		
	    Integer SecondLarget= Count-2;
	    
	    //Print Second Largest Number
	    
		System.out.println("Second Largest Number : " + number.get(SecondLarget));
	}

}
