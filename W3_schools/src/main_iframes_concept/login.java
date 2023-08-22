package main_iframes_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login extends base_page
{
	static By by_UN=By.xpath("//input[@id='modalusername']");
	static By by_Pass=By.xpath("//input[@id='current-password']");
	static By by_Login=By.xpath("//span[text()='Log in']");
	
	public static WebElement ele_UN()
	{
		WebElement ele=driver.findElement(by_UN);
		return ele;
	}
	static WebElement ele_Pass()
	{
		WebElement pa=driver.findElement(by_Pass);
		return pa;
	}
	static WebElement ele_Login()
	{
		WebElement log=driver.findElement(by_Login);
		return log;
	}
	
	// ACTIONS
	
	public static void un() throws InterruptedException
	{
		Thread.sleep(2000);
		ele_UN().sendKeys("bompallibharath@gmail.com");
	}
	
	public static void pw() throws InterruptedException
	{
		Thread.sleep(2000);
		 ele_Pass().sendKeys("Bharath*1419");
	}
	
	public static void login1() throws InterruptedException
	{
		Thread.sleep(2000);
		 ele_Login().click();
	}
}
