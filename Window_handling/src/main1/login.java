package main1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login extends base_page
{
	static By by_login=By.xpath("//a[.='Login']");
	static By by_eun=By.xpath("//input[@id='loginuseridUser']");
	static By by_x=By.xpath("(//i[@class='fa fa-close'])[2]");
	
	
	// Webelement
	
	public static WebElement ele_login()
	{
		return driver.findElement(by_login);
	}
	
	
	public static WebElement ele_eun()
	{
		return driver.findElement(by_eun);
	}
	
	public static WebElement ele_x()
	{
		return driver.findElement(by_x);
		
	}
	
	//actions
	
	public static void login()
	{
		ele_login().click();
	}
	

	public static void un()
	{
		ele_eun().sendKeys("bharath");
	}
	
	public static void x()
	{
		ele_x().click();
	}
	
}
