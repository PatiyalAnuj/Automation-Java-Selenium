package locators.traditional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver = new ChromeDriver(); // opens chrome browser
		driver.get("https://www.google.co.in/");
		//By.tagName
		driver.findElement(By.tagName("textarea")).sendKeys("Selenium"); // find element
		Thread.sleep(1000); // waits for 1 second
		//close driver
		driver.close();
	}
}
