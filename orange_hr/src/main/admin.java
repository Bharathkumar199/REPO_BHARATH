package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class admin extends base_page 
{
	static By by_admin=By.xpath("//span[.='Admin']");
	static By by_un1=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	static By by_dd1=By.xpath("(//div[@class='oxd-select-text--after'])[1]");
	static By by_dd=By.xpath("(//div[.='ESS'])[1]");
	static By by_hint=By.xpath("//input[@placeholder='Type for hints...']");
	static By by_dd2=By.xpath("(//div[@class='oxd-select-text--after'])[2]");
	
	
	static WebElement ele_admin=driver.findElement(by_admin);
	static WebElement ele_un1=driver.findElement(by_un1);
	static WebElement ele_dd1=driver.findElement(by_dd1);
	static WebElement ele_dd=driver.findElement(by_dd);
	static WebElement ele_hint=driver.findElement(by_hint);
	static WebElement ele_dd2=driver.findElement(by_dd2);
	
	public static void ad()
	{
		ele_admin.click();
	}
	
	public static void un1()
	{
		ele_un1.sendKeys("bharath");
	}
	
	public static void dd1()
	{
		ele_dd1.click();
	}
	
	public static void dd()
	{
		ele_dd.click();
	}
	
	public static void hint()
	{
		ele_hint.sendKeys("xyz  abc");
	}
	
	public static void dd2()
	{
		ele_dd2.click();
	}
}
