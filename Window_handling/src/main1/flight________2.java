package main1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class flight________2 extends base_page
{
	static By by_flight=By.xpath("//a[.=' FLIGHTS ']");
	static By by_pop=By.xpath("//button[.='Later']");
	
	
	
	public static WebElement ele_flight()
	{
		return driver.findElement(by_flight);
	}
	
	public static WebElement ele_pop()
	{
		return driver.findElement(by_pop);
	}
	
	
	public static void fli()
	{
		ele_flight().click();
		
	}
	
	public static void later() throws InterruptedException
	{
		System.out.println(driver.getTitle());
		Set<String>c=driver.getWindowHandles();
		String arr[] = c.toArray(new String[c.size()]);
		driver.switchTo().window(arr[3]);
		System.out.println(driver.getTitle()+"  flight");
		Thread.sleep(6000);
		
		ele_pop().click();
		
	}
	
}




