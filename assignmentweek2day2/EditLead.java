package assignmentweek2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		 {
			 // Initialize the WebDriver (ChromeDriver)
			 ChromeDriver driver=new ChromeDriver();
			 
			 //Load the URL http://leaftaps.com/opentaps/.
			 driver.get("http://leaftaps.com/opentaps");
			 
			 //Maximize the browser window.
			 driver.manage().window().maximize();
			 
			//Inspect Username field and enter username value
			 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
			 
			 //Inspect Password field and enter password value 
			 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			 
			 //Click the "Login" button.
			 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			 
			 //Wait for 10 ms
			 Thread.sleep(10);

			 //Click on the "CRM/SFA" link.
			 driver.findElement(By.linkText("CRM/SFA")).click();
			 
			 //Click on the "Leads" tab.
			 driver.findElement(By.linkText("Leads")).click();
			 
			 //Click on the "Create Lead" button.
			 driver.findElement(By.linkText("Create Lead")).click();
			 
			//Inspect CompanyName field and enter CompanytName value
			 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("IBM");
			 
			 //Inspect FirstName field and enter FirstName value
			 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Siva");

			 //Inspect LastName field and enter LastName value
			 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ram");
			 
			 //Enter the FirstName (Local) Field Using Xpath.
			 driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Gopi");
			 
			//Enter the Department Field Using any Locator of Your Choice.
			 driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("CSE");
			 
			//Enter the Description Field Using any Locator of your choice.
			 driver.findElement(By.id("createLeadForm_description")).sendKeys("Small Description of Company");
			 
			//Enter your email in the E-mail address Field using the locator of your choice.
			 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcd@gmail.com");
			 
			//Select State/Province as NewYork Using Visible Text.
			 WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			 Select StateDD= new Select(State);
			 StateDD.selectByVisibleText("New York");
			 				 
			
			 // Click the "Create Lead" button
			 driver.findElement(By.name("submitButton")).click();
			 
			 //Verify that the Title is displayed correctly
			 String PageTitleName= driver.getTitle();
						 
			 if(PageTitleName.equals("View Lead | opentaps CRM"))
			 {
			 //Display the message in console
			 System.out.println("PageTitleName 'View Lead | opentaps CRM' displayed correctly") ;
			 }
			 else
			 {
			 System.out.println("PageTitleName 'View Lead | opentaps CRM' is not displayed correctly") ;	
			 }		
			 				 
			 //Click on the edit button.
			 driver.findElement(By.xpath("//a[text()='Edit']")).click();
			 
			 //Delay
			 Thread.sleep(1000);
			
			 //Clear the Description Field.
			 driver.findElement(By.id("updateLeadForm_description")).clear();
			 
			 //Fill the Important Note Field with Any text
			 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Update Important Value");
			 
			 //Click on the update button.
			 driver.findElement(By.xpath("//input[@value='Update']")).click();
			
			 //Get the Title of the Resulting Page.
			 PageTitleName= driver.getTitle();
			 System.out.println("PageTitleName : " + PageTitleName);
			 		
			 if(PageTitleName.equals("View Lead | opentaps CRM"))
			 {
			 //Display the message in console
			 System.out.println("PageTitleName 'View Lead | opentaps CRM' displayed correctly") ;
			 }
			 else
			 {
			 System.out.println("PageTitleName 'View Lead | opentaps CRM' is not displayed correctly") ;	
			 }		
			 				
			 //Close browser
			 driver.close();
	}
	}
}