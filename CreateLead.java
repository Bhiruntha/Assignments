package assignmentweek1day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
			 
			 //Click on the "Leads" tab.
			 driver.findElement(By.linkText("Leads")).click();
			 
			 //Click on the "Create Lead" button.
			 driver.findElement(By.linkText("Create Lead")).click();
			 
			 //Inspect FirstName field and enter FirstName value
			 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhiruntha");

			 //Inspect LastName field and enter LastName value
			 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Palani");
			 
			//Inspect CompanyName field and enter CompanytName value
			 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
			 
			//Inspect Title field and enter Title value
			 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Project Manager");
			 
			//Wait for 10 ms
			 Thread.sleep(10);
			 
			 // Click the "Create Lead" button
			 driver.findElement(By.name("submitButton")).click();
			 
			 //Verify that the Title is displayed correctly
			 String PageTitleName= driver.getTitle();
			 System.out.println("PageTitleName is :  "+PageTitleName);
			 
			 if(PageTitleName.equals("View Lead | opentaps CRM"))
			 {
			//Display the message in console
			 System.out.println("PageTitleName displayed correctly") ;
			 }
			 else
			 {
			 System.out.println("PageTitleName is not displayed correctly") ;	
			 }		
			 
			//Wait for 10 ms
			 Thread.sleep(50);
			 
			 //Close browser
			 driver.close();
	}
	}
}