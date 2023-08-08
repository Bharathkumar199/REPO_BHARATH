package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class logout extends base_page
{
	static By by_pro=By.xpath("//img[@class='oxd-userdropdown-img']");
	static By by_lo1=By.xpath("(//a[@class='oxd-userdropdown-link' and  //a[.='Logout']])[4]");
	
	static WebElement ele_pro=driver.findElement(by_pro);
	static WebElement ele_lo1=driver.findElement(by_lo1);
	
	public static void pro()
	{
		ele_pro.click();
	}
	
	public static void lg()
	{
		ele_lo1.click();
	}
}
