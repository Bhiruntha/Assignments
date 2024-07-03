package assignmentweek2day4List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntersectionArray {

	public static void main(String[] args) {
		int Array1 [] = {3, 2, 11, 4, 6, 7};
		int Array2 [] = {1, 2, 8, 4, 9, 7};
		
		List <Integer> List1 =new ArrayList <Integer>();
		List <Integer> List2 =new ArrayList <Integer>();
		List <Integer> Output =new ArrayList <Integer>();
		
		for(Integer element1:Array1)
		{
			List1.add(element1);
		}
		
		for(Integer element2 :Array2)
		{
			List2.add(element2);
		}
		
		Collections.sort(List1);
		System.out.println("Elements in List1 after sorting : " +List1);
		
		Collections.sort(List2);
		System.out.println("Elements in List2 after sorting : " +List2);
		
		int Count = List1.size();
		System.out.println("Count of Elements : " +Count);
		
		for ( int i=0;i<Count;i++)
			{
			for (int j=0;j<Count;j++)
				{
			if (List1.get(i) == List2.get(j))
				Output.add(List1.get(i));
				}
			}
				
		System.out.println("Equal values of both array : " +Output);		
		}
	}

