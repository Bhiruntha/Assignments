package assignmentweek2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the WebDriver (ChromeDriver)
		 ChromeDriver driver=new ChromeDriver();
		 
		 //Load the URL https://en-gb.facebook.com/
		 driver.get("https://en-gb.facebook.com/");
		 
		 //Maximize the browser window.
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Click on the Create new account button.
		 driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		 
				 
		 // Enter the First name.
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("crmsfa");
		 
		 // Enter the Surname.
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("crmsfa1");
		 
		 //Enter the Mobile number.
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("999999123");
		 
		 //Enter the New password.
		 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("lkajmkk");
		 
		 
		 // Handle all three dropdowns in Date of birth
		 WebElement DOBDate =driver.findElement(By.name("birthday_day"));
		 Select DOBDateChk= new Select(DOBDate);
		 DOBDateChk.selectByVisibleText("15");
		 
		 WebElement DOBMonth =driver.findElement(By.name("birthday_month"));
		 Select DOBMonthChk= new Select(DOBMonth);
		 DOBMonthChk.selectByVisibleText("Jan");
		 
		 WebElement DOBYY =driver.findElement(By.name("birthday_year"));
		 Select DOBYYChk= new Select(DOBYY);
		 DOBYYChk.selectByVisibleText("1983");
		 
			 
		 //Select the radio button in Gender
		 driver.findElement(By.xpath("//input[@class='_8esa']")).click();
		 
		  		 
	}

}
