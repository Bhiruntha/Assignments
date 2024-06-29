package assignmentweek2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAcountDropDown {

	public static void main(String[] args) throws InterruptedException {
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
		 
		 //Click on the "Accounts" tab.
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/accountsMain']")).click();
		 
		 //Click on the "Create Account" button.
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/createAccountForm']")).click();
		 
		 String GivenAccountName="Nila Account 6";
		 //Inspect accountName field and enter accountName value
		 driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(GivenAccountName);
		 
		 //Inspect description field and enter description value
		 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		 
		 //Select "ComputerSoftware" as the industry
		 WebElement Industry = driver.findElement(By.name("industryEnumId"));
		 Select Industrychk = new Select (Industry);
		 Industrychk.selectByIndex(3);
		 
		 // Select "S-Corporation" as ownership using SelectByVisibleText
		 WebElement Ownership =driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		 Select OwnershipChk = new Select(Ownership);
		 OwnershipChk.selectByVisibleText("S-Corporation");
		 
		 //Select "Employee" as the source using SelectByValue
		 WebElement Source =driver.findElement(By.name("dataSourceId"));
		 Select SourceChk = new Select (Source);
		 SourceChk.selectByValue("LEAD_EMPLOYEE");
		 
		 //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex 
		 WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
		 Select marketingchk = new Select (marketing);
		 marketingchk.selectByIndex(6);
		 
		 //Select "Texas" as the state/province using SelectByValue.
		 WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select statechk = new Select (state);
		 statechk.selectByValue("TX");

		 // Click the "Create Account" button
		 driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		 
		 String Accountname = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		 System.out.println("Accountname is " +Accountname ) ;
		 
		 if(Accountname.contains(GivenAccountName))
		 {
		//Display the message in console
		 System.out.println("Accountname displayed correctly") ;
		 }
		 else
		 {
		 System.out.println("Accountname is not displayed correctly") ;	
		 }		
		 
		//Wait for 10 ms
		 Thread.sleep(1000);
		 
		 //Close the Driver
		 driver.close();
		 
	}

}
