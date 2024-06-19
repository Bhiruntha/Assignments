package assignmentsweek1day2;

public class PrintFibSeries {

	public static void main(String[] args) {
		
		// Print Fibonacci series 
		int numb1 = 0;
		int numb2 = 1;
		
		System.out.println("The Fibonacci series are :\n"+ numb1 +"\n" +numb2 );
		
		for(int i=1;i<=10;i++)
		{
			int temp= numb1 + numb2;
			
			System.out.println(temp);
			numb1=numb2;
			numb2=temp;
		}
	}
}

