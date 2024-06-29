package assignmentweek2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		 {
			 // Initialize the WebDriver (ChromeDriver)
			 ChromeDriver driver=new ChromeDriver();
			 
			 //Load the URL https://leafground.com/button.xhtml.
			 driver.get("https://leafground.com/button.xhtml");

			 //Maximize the browser window.
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			 
			 //Check if the button with the text ‘Confirm if the button is disabled’ is disabled
			 Boolean enabled= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
			 
			 System.out.println("‘Confirm if the button is disabled’ is Enabled : " +enabled) ;
			 
			 //Find and print the position of the button with the text ‘Submit.’
			 Point Position= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getLocation();
			 System.out.println("Position of the button with the text ‘Submit.’ : " +Position) ;
			 
			 //Find and print the background color of the button with the text ‘Find the Save button color.’
			 String BGColour= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color");
			 System.out.println("Background color of the button with the text ‘Find the Save button color.’ : " +BGColour) ;
			 
			 //Find and print the height and width of the button with the text ‘Find the height and width of this button.’
			 Dimension HtWt= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
			 System.out.println("Height and width of the button with the text ‘Find the height and width of this button.’ : " +HtWt) ;
			 
			 //Click on the button with the text ‘Click and Confirm title.’
			 driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
			 
			 //Verify that the title of the page is ‘dashboard.’
			 System.out.println("Title is : " + driver.getTitle());
			 
			 if(driver.getTitle().equals("Dashboard"))
			 {
			//Display the message in console
			 System.out.println("Title 'Dashboard' is displayed correctly") ;
			 }
			 else
			 {
			 System.out.println("Title 'Dashboard' is not displayed correctly") ;	
			 }	
			 driver.close();
			}

}
}
