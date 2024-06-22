package assignmentweek1day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		 {
			 // Initialize the WebDriver (ChromeDriver)
			 ChromeDriver driver=new ChromeDriver();
			 
			 //Load the URL http://leaftaps.com/opentaps/.
			 driver.get("http://leaftaps.com/opentaps");
			 
			 //Maximize the browser window.
			 driver.manage().window().maximize();
			 
			 //Inspect Username field and enter username value
			 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			 
			 //Inspect Password field and enter password value 
			 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			 
			 //Click the "Login" button.
			 driver.findElement(By.className("decorativeSubmit")).click();
			 
			 //Wait for 10 ms
			 Thread.sleep(10);
			 
			 //Click on the "CRM/SFA" link.
			 driver.findElement(By.linkText("CRM/SFA")).click();
			 
			 //Click on the "Accounts" tab.
			 driver.findElement(By.linkText("Accounts")).click();
			 
			 //Click on the "Create Account" button.
			 driver.findElement(By.linkText("Create Account")).click();
			 
			 //Inspect accountName field and enter accountName value
			 driver.findElement(By.id("accountName")).sendKeys("NILA Account2");

			 //Inspect numberEmployees field and enter numberEmployees value
			 driver.findElement(By.id("numberEmployees")).sendKeys("1000");
			 
			//Inspect SiteName field and enter SiteName value
			 driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
			 
			 //Inspect description field and enter description value
			 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
			 
			//Wait for 10 ms
			 Thread.sleep(10);
			 
			 // Click the "Create Account" button
			 driver.findElement(By.className("smallSubmit")).click();
			 
			//Wait for 10 ms
			 Thread.sleep(1000);
			 
			 //Verify that the Title is displayed correctly
			 String PageTitleName= driver.getTitle();
			 System.out.println("PageTitleName is :  "+PageTitleName);
			 
			 if(PageTitleName.equals("Account Details | opentaps CRM"))
			 {
			//Display the message in console
			 System.out.println("PageTitleName displayed correctly") ;
			 }
			 else
			 {
			 System.out.println("PageTitleName is not displayed correctly") ;	
			 }		
			 
			//Wait for 10 ms
			 Thread.sleep(1000);
			 
			 //Close browser
			 driver.close();
	}
	}
}