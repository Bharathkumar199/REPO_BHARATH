package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class title extends base_page
{
	
	
	static By by_pro=By.xpath("//iframe[@id='classic-menu']");
	static By by_UN=By.xpath("//a[text()='Profile']");
	static By by_pt=By.xpath("//a[@title='Home']");
	
  public static WebElement ele_pro()
	{
		WebElement framw= driver.findElement(by_pro);
		System.out.println(framw);
		driver.switchTo().frame(framw);
		return framw;
	}
  
  public static WebElement ele_tit()
	{
		return driver.findElement(by_UN);
	}
	
	
	public static WebElement ele_pt()
	 {
		WebElement fram= driver.findElement(by_pt);
		System.out.println(fram);
		//driver.switchTo().frame(fram);
		return fram;
	 }
	  
	
	//  ACTIONS
	
	
	
	  public static void tit() throws InterruptedException
	{
		
		ele_tit().click();
	}
	  
	  public static void cl()
	  {
		  ele_pt().click();
	  }
}
