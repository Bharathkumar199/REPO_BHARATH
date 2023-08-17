package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_page 

{
   static WebDriver driver;
   
   public static void amazon()
	{
    driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_0cc31a74ccce6b8bd234c48133f7e00f4427f2ae9bcf6f83e12e2a41&mfadid=adm");
	 driver.manage().window().maximize();
	}
}
