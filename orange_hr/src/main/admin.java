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
	static By by_enabled=By.xpath("(//div[.='Enabled'])[1]");
	static By by_sub=By.xpath("//button[@type='submit']");
	static By by_search=By.xpath("//button[@type='submit']");
	
	
	
	static WebElement admin()
	{
		return driver.findElement(by_admin);
	}
	static WebElement un()
	{
		return driver.findElement(by_un1);
	}
	static WebElement dd3()
	{
		return driver.findElement(by_dd1);
	}
	static WebElement dd4()
	{
		return driver.findElement(by_dd);
	}
	static WebElement hint1()
	{
		return driver.findElement(by_hint);
	}
	static WebElement dd5()
	{
		return driver.findElement(by_dd2);
	}
	static WebElement enabled1()
	{
		return driver.findElement(by_enabled);
	}
	static WebElement sub()
	{
		return driver.findElement(by_sub);
	}
	static WebElement search()
	{
		return driver.findElement(by_search);
	}
	
	
	// ACTIONS
	
	
	public static void ad() throws InterruptedException
	{
		Thread.sleep(3000);
		admin().click();
	}
	
	public static void un1() throws InterruptedException
	{
		Thread.sleep(3000);
		un().sendKeys("bharath");
	}
	
	public static void dd1() throws InterruptedException
	{
		Thread.sleep(3000);
		dd3().click();
	}
	
	public static void dd() throws InterruptedException                                                                                       
	{
		Thread.sleep(3000);
		dd4().click();
	}
	
	public static void hint() throws InterruptedException
	{
		Thread.sleep(2000);
		hint1().sendKeys("xyz  abc");
	}
	
	public static void dd2() throws InterruptedException
	{
		Thread.sleep(3000);
		dd5().click();
	}
	
	public static void enabled() throws InterruptedException
	{
		Thread.sleep(3000);
		enabled1().click();
	}
	
	public static void sub1() throws InterruptedException
	{
		Thread.sleep(3000);
		sub().click();
	}
	
	public static void sear1() throws InterruptedException
	{
		Thread.sleep(3000);
		search().click();
	}
}
