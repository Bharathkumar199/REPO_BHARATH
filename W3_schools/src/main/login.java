package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login extends base_page
{
	static By by_UN=By.xpath("//input[@id='modalusername']");
	static By by_Pass=By.xpath("//input[@id='current-password']");
	static By by_Login=By.xpath("//span[text()='Log in']");
	
	static WebElement ele_UN=driver.findElement(by_UN);
	static WebElement ele_Pass=driver.findElement(by_Pass);
	static WebElement ele_Login=driver.findElement(by_Login);
	
	public static void un()
	{
		ele_UN.sendKeys("bompallibharath@gmail.com");
	}
	
	public static void pw()
	{
		 ele_Pass.sendKeys("Bharath@1419");
	}
	
	public static void login1()
	{
		 ele_Login.click();
	}
}
