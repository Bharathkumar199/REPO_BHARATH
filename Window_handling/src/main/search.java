package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class search extends base_page
{
	static By by_search=By.xpath("//input[@id='twotabsearchtextbox']");
	static By by_click=By.xpath("//input[@id='nav-search-submit-button']");
	static By by_mob=By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]");
	
	
	static WebElement ele_search()
	{
		return driver.findElement(by_search);
	}
	static WebElement ele_click()
	{
		return driver.findElement(by_click);
	}
	static WebElement ele_mob()
	{
		return driver.findElement(by_mob);
	}
	
	//actions
	
	public static void sear()
	{
		ele_search().sendKeys("redmi mobiles");
	}
	
	public static void cli()
	{
		ele_click().click();

	}
	
	public static void mob()
	{
		 ele_mob().click();
	}
}
