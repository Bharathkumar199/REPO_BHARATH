package main1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class profile_bus extends base_page
{
	static By by_bus=By.xpath("//a[text()=' BUSES ']");
	static By by_hotel=By.xpath("//div[@class='Nav-icons IRCTCHotels']");
	
	
	
	
	//Webelement
	
	
	
	public static WebElement ma()
	{
		return driver.findElement(by_bus);
	}
	
	public static WebElement hotel()
	{
		return driver.findElement(by_hotel);
	}

	
	
	
	
	//ACTOINS
	
	
	public static void bu() throws InterruptedException
	{
		ma().click();
		String parent=driver.getWindowHandle();
		System.out.println("parentwindow - " + parent);
		
		Set<String> handle=driver.getWindowHandles();

		for (String handles : handle) 

		{
			System.out.println(handles);
			if(!parent.equals(handles))
			{
				driver.switchTo().window(handles);
				hotel().click();
				Thread.sleep(2000);
			}
		}
	}
	
	
	public static void ho()
	{
		hotel().click();
	}
	
}
