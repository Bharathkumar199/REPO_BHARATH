package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class logout extends base_class
{
	static By by_pro=By.xpath("//img[@class='oxd-userdropdown-img']");
	static By by_lo1=By.xpath("(//a[@class='oxd-userdropdown-link' and  //a[.='Logout']])[4]");
	
	 static WebElement pro1()
	{
		return driver.findElement(by_pro);
	}
	 static WebElement lo1()
	{
		return driver.findElement(by_lo1);
	}
	
	public static void drop()
	{
		pro1().click();
	}
	
	public static void lg()
	{
		lo1().click();
	}
	
}
