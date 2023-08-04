package you_tube1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_page 
{
 static WebDriver driver;
 
 public static void yt()
	{
     driver=new ChromeDriver();
	 driver.get("https://www.youtube.com/");
	 driver.manage().window().maximize();
	}
}
