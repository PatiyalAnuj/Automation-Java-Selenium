package locators.traditional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName 
{
	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//By.className
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
		Thread.sleep(1000);
		//close driver
		driver.close();// TODO Auto-generated method stub
	}
}
