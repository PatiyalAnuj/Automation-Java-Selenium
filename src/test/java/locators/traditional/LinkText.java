package locators.traditional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText 
{
	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver = new ChromeDriver(); // opens chrome browser
		driver.get("https://www.selenium.dev/"); // navigate to the selenium web
		
		//By.linkText
		driver.findElement(By.linkText("Documentation")).click(); // finds element
		Thread.sleep(1000); // waits for 1 second
		//close driver
		driver.close();
	}
}
