package locators.traditional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();// open chrome browser
		driver.get("https://www.google.co.in/"); // navigate to google website
		//By.id
		// find element By.id
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium"); 
		
		//close driver/window
		driver.close();
	}
}
