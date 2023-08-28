package package_utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_page 
{
	static  WebDriver driver;
	public static void facebook()
	{
     driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
