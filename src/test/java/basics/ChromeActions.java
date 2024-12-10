package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeActions 
{
    private ChromeDriver driver;
    void openchrome()
    {
        // opening chrome browser
        driver = new ChromeDriver(); // open chrome browser
        
        // navigating to the url
        driver.get("https://www.selenium.dev/"); // navigate to the url

        // maximizing window
        driver.manage().window().maximize();
    
        // put implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // click on documentation
        driver.findElement(By.xpath("//span[text()='Documentation']")).click();
       
        // closing the current window
        driver.close(); // closing current window
    }
    public static void main(String[] args) {
        ChromeActions cActions = new ChromeActions();
        cActions.openchrome();
    }
}
