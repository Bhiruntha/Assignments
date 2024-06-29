package assignmentweek2day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithCheckboxes {
	

	public static void main(String[] args) throws InterruptedException {
		 {
			 // Initialize the WebDriver (ChromeDriver)
			 ChromeDriver driver=new ChromeDriver();
			 
			 //Load the URL http://leaftaps.com/opentaps/.
			 driver.get("https://leafground.com/checkbox.xhtml");
			 
			 //Maximize the browser window.
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			 //Click on the "Basic Checkbox.
			 driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
						 		 		 
			 //Click on the "Notification Checkbox.
			 driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']//div[2]")).click();
			 
						
			 // Verify  the displayed message 
			 WebElement expectedMsg = driver.findElement(By.xpath("//div[@class = 'ui-growl-message']/span[text() = 'Checked']"));
	         boolean displayed = expectedMsg.isDisplayed();
	         System.out.println("The Expected message 'Checked' displayed "+displayed);
						 
			 // Click on your favorite language (assuming it's related to checkbox.
			 driver.findElement(By.xpath("//label[@for='j_idt87:basic:0']/preceding-sibling::div/div[2]")).click();
			 
						 
			 // Click on the "Tri-State Checkbox."
			 driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
			 
			// driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
			 
			 Thread.sleep(5000);
			 
			 //Verify which tri-state option has been chosen			 
			 String TriChkBoxValue =driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText();
			 System.out.println("The TriState Checkbox value : " + TriChkBoxValue);
			 
			 
			 
			 //Click on the "Toggle Switch.
			 driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
			 
			 //- Verify that the expected message is displayed in "Toggle Switch
			  			 
			 String ToggleSwitchvalue =driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
			 System.out.println("The ToggleSwitch value : " + ToggleSwitchvalue);
			 
			 //- Verify if the Checkbox is disabled.
			 boolean checkboxstatus= driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).isEnabled();
			 System.out.println("The checkbox Enabled status  : " + checkboxstatus);
			 
			 //Select multiple options on the page
			 driver.findElement(By.xpath("//ul[@data-label ='Cities']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//li[@data-item-value = 'London']//div[2]")).click();
			 driver.findElement(By.xpath("//li[@data-item-value = 'Berlin']/div/div[2]")).click();
			 

			 //Close  multiple options on the page
			 driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
			 
			 //Close Browser
			 driver.close();
			 
		 }
		 }
		}
	