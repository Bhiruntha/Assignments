package assignmentweek1day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// Find the missing number in array
		
		int arr[] = {1,4,3,2,7};
		Arrays.sort(arr);
		
		for (int i = 0; i <= arr.length+1; i++) {
			 
			if(arr[i] != i+1) {
				System.out.println("The missing Number " +(i+1));
				break;
			}
			
		}
	}

}
	
