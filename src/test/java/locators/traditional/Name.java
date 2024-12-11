package locators.traditional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws Exception 
	{
		ChromeDriver driver = new ChromeDriver(); // opens chrome browser
		driver.get("https://www.google.co.in/"); // navigates to google web
		//maximize the window
		driver.manage().window().maximize();
		
		//By.name
		driver.findElement(By.name("q")).sendKeys("Selenium"); // find element 
		
		Thread.sleep(1000); // waits for 1 second
		//close driver
		driver.close();	

	}
}
