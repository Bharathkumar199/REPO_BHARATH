package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login extends base_page
{
	static By by_sign=By.xpath("//a[@id='nav-link-accountList']");
	static By by_UN=By.xpath("//input[@id='ap_email']");
	static By by_count=By.xpath("//span[@id='continue']");
	static By by_PW=By.xpath("//input[@id='ap_password']");
	static By by_submit=By.xpath("//input[@id='signInSubmit']");
	
	


	static WebElement ele_login=driver.findElement(by_sign);


	static WebElement ele_UN=driver.findElement(by_UN);
	static WebElement ele_count=driver.findElement(by_count);
	static WebElement ele_PW=driver.findElement(by_PW);
	static WebElement ele_submit=driver.findElement(by_submit);
	
	
	public static void sig() throws InterruptedException
	{
		Thread.sleep(2000);
		ele_login.click();
	}
	
	public static void cou() throws InterruptedException
	{
		Thread.sleep(2000);

	 ele_UN.sendKeys("9573917465");
	}
	
	public static void co() throws InterruptedException
	{
		Thread.sleep(2000);

		ele_count.click();
	}
	 
	public static void p() throws InterruptedException
	{
		Thread.sleep(2000);

		ele_PW.sendKeys("bharath@1419");
	}
	 
	public static void sub() throws InterruptedException
	{		Thread.sleep(2000);

		ele_submit.click();
	}
	 
}
