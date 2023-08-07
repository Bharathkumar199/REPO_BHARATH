package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base_page 
{
 static WebDriver driver;
 
 public static void amazon()
	{
     driver=new EdgeDriver();
	 driver.get("https://www.amazon.com/");
	 driver.manage().window().maximize();
	}
}
