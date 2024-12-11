package locators.traditional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();// opens chrome browser
		driver.get("https://www.saucedemo.com/"); // navigate to web
		
		//find element using cssSelector method
		// '#' --> Represents id Selector
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		//find element using cssSelector method
		// '.' --> Represents class selector
		driver.findElement(By.cssSelector("")).sendKeys("");
		
	}
}
