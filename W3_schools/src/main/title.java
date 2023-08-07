package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class title extends base_page
{
	static By by_UN=By.xpath("//a[text()='Profile']");
	
	static WebElement ele_tit=driver.findElement(by_UN);
	
	public static void tit() throws InterruptedException
	{
		Thread.sleep(2000);
		ele_tit.click();
	}
}
