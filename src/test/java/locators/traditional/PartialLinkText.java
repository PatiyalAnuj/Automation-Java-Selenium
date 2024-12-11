package locators.traditional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText 
{
	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver = new ChromeDriver();//open chrome browser
		driver.get("https://www.selenium.dev/");// navigate to selenium website
		driver.findElement(By.partialLinkText("Document")).click(); // find Element By.paritialLinkText
		Thread.sleep(1000);// waiting for 1 second
		driver.close(); // close the window
	}
}
