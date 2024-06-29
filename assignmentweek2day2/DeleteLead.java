package assignmentweek2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

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
			 
			 //Click "Find leads."
			 driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			 
			 //Click on the "Phone" tab.
			 driver.findElement(By.xpath("//span[text()='Phone']")).click();
			 
			 // Enter the phone number
			 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9500768884");
					 
			 //Click the "Find leads" button.
			  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			  
			  //Delay
			  Thread.sleep(1000);
			  
			  //Capture the lead ID of the first resulting lead.
			  String  PhoneNumber= driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).getText();
			  System.out.println("Selected PhonemNumber : " + PhoneNumber);
			  
			  //Click the first resulting lead.
			  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
			  
			  //Click the "Delete" button.
			  driver.findElement(By.xpath("//a[text()='Delete']")).click();
			  
			  //Delay
			  Thread.sleep(1000);
			  
			  //Click "Find leads."
			  driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			  
			  //Delay
			  Thread.sleep(1000);
				 
			  //Click on the "Phone" tab.
			  driver.findElement(By.xpath("//span[text()='Phone']")).click();
				 
			  // Enter the phone number
			  driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNumber);
			  
			  //Click the "Find leads" button.
			  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			  
			  //Delay
			  Thread.sleep(1000);
			  
			  //Verify the message displayed
			  
			  Boolean DisplayedMsg= driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
			  
			  System.out.println("\"'No records to display' Message displayed : " +DisplayedMsg );
			  
			  //Delay
			  Thread.sleep(1000);
			  
			  //Close browser
			  driver.close();
	}
	}
}