package assignmentweek2day4List;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		
		//- Launch the URL https://www.ajio.com/
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		//- In the search box, type as "bags" and press enter
		WebElement search=driver.findElement(By.name("searchVal"));
		search.sendKeys("Bags");
		search.sendKeys(Keys.ENTER);
		
		//To the left of the screen under "Gender" click on "Men
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(2000);
		
		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(2000);
		
		// Print the count of the items found. 
		String Count = driver.findElement(By.xpath("(//div[@class='filter']/div)[1]/Strong")).getText();
		System.out.println("Count of Items : " +Count);
		
		//Get the list of name of the products displayed in the page and print the list.
		List<WebElement> Name = driver.findElements(By.xpath("//div[@class='brand']/Strong"));
		for (WebElement Names : Name)
		{
		    System.out.println("Bag Name :" + Names.getText());
		  
		}
		
		//Get the list of name of the products displayed in the page and print the list.
		List<WebElement> Brand = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (WebElement Brands : Brand)
		{
		    System.out.println("Brand Name :" + Brands.getText());		
		}
		
	}
}


