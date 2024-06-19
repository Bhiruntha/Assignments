package assignmentsweek1day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		// To verify Palindrome Number 
			int r,sum=0,temp; 
			
			int number=454541; //It is the number variable to be checked for palindrome  
		  
			temp=number; 
			
			while(number>0){    
				r=number%10;  //getting remainder  
				sum=(sum*10)+r;    
				number=number/10;    
			}    
			System.out.println("The reversed number is  " + sum + " \n ");  
			
			if(temp==sum)    
				System.out.println(temp + " is palindrome number ");    
			else    
				System.out.println(temp + " not palindrome number "); 
			}  
				}


