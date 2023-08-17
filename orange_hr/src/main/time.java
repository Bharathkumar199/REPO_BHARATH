package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class time extends base_page
{
	static By by_time=By.xpath("//span[.='Time']");
	static By by_name=By.xpath("//input[@placeholder='Type for hints...']");
	static By by_su1=By.xpath("//button[@type='submit']");
	static By by_das=By.xpath("(//span[.='Dashboard'])[1]");
	
	
	
	static WebElement time()
	{
		return driver.findElement(by_time);
	}
	static WebElement name()
	{
		return driver.findElement(by_name);
	}
	static WebElement su2()
	{
		return driver.findElement(by_su1);
	}
	static WebElement das1()
	{
		return driver.findElement(by_das);
	}
	
	
	
	//ACTIONS
	
	
	public static void time1() throws InterruptedException
	{
		Thread.sleep(2000);
		time().click();
	}
	
	public static void nmae() throws InterruptedException
	{
		Thread.sleep(2000);
		name().sendKeys("SWAPNA  PARLAPU");
	}
	
	public static void su1() throws InterruptedException
	{
		Thread.sleep(2000);
		su2().click();
	}
	
	public static void das() throws InterruptedException
	{
		Thread.sleep(2000);
		das1().click();
	}
}
