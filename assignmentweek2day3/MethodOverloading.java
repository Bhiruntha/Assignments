package assignmentweek2day3;

public class MethodOverloading {

	
	public void sendRequest(String endpoint)
	{
		System.out.println("endpoint Value is : " + endpoint);
		
	}
	
	public void sendRequest(String requestBody,String endpoint,Boolean requestStatus)
	{
		System.out.println("requestBody Value is : " + requestBody);
		
		System.out.println("endpoint Value is : " + endpoint);
		
		System.out.println("requestStatus Value is : " + requestStatus);
	}
	
	
	public static void main(String[] args) {
		MethodOverloading S1 =new MethodOverloading();
		S1.sendRequest("Driver close");
		S1.sendRequest("RequestBody", "Endpoint", true);
		
	}

}
