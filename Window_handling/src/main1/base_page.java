package main1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class base_page 
{
   static WebDriver driver;
   
   public static void irtc()
   {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
//	   Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
//			   .pollingEvery(Duration.ofSeconds(4));
	   driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	   
	   driver.get("https://www.irctc.co.in/nget/train-search");
	   
	   
   }
   
   
   

}
