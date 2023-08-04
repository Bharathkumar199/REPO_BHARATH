package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_page 
{
   static WebDriver driver;
   
   public static void w3()
   {
	   driver=new ChromeDriver();
	   driver.get("https://profile.w3schools.com/");
	   driver.manage().window().maximize();
	   
   }
}
