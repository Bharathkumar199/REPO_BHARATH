package you_tube1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class search extends base_page
{
	 static By by_id=By.xpath("//input[@id='search']");
	 static By by_search=By.xpath("//button[@class='style-scope ytd-searchbox']");
	 
	 
	 
	 static WebElement id1()
	 {
		return driver.findElement(by_id);
	 }
	 
	 static WebElement ele()
	 {
		 return driver.findElement(by_search);
	 }
	
	 
	 
	 public static void search2()
	 {
		 id1().sendKeys("natu natu song");
	 }
	 
	 public static void search_icon()
	 {
		 ele().click();
	 }
}
