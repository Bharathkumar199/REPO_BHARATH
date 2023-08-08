package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class time extends base_page
{
	static By by_time=By.xpath("//span[.='Time']");
	static By by_name=By.xpath("//input[@placeholder='Type for hints...']");
	static By by_su1=By.xpath("//button[@type='submit']");
	static By by_das=By.xpath("(//span[.='Dashboard'])[1]");
	
	
	
	static WebElement ele_time=driver.findElement(by_time);
	static WebElement ele_name=driver.findElement(by_name);
	static WebElement ele_su1=driver.findElement(by_su1);
	static WebElement ele_das=driver.findElement(by_das);
	
	public static void time1()
	{
		ele_time.click();
	}
	
	public static void nmae()
	{
		ele_name.sendKeys("SWAPNA  PARLAPU");
	}
	
	public static void su1()
	{
		ele_su1.click();
	}
	
	public static void das()
	{
		ele_das.click();
	}
}
