package assignmentweek2day3;

public class MethodOverridingLogin extends MethodOverriding {

		
	public void performCommonTasks()
	{
		System.out.println("Inside performCommonTasks method of Login Page");
		
	}
	
	
public static void main(String[] args) {
	MethodOverridingLogin L1 =new MethodOverridingLogin();
	L1.findElement();
	L1.clickElement();
	L1.enterText();
	L1.performCommonTasks();
}
}