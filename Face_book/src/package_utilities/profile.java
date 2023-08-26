package package_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class profile extends Base_page
{
	 static By by_profile1=By.xpath("//span[text()='B Bharath Kumar']");
	 static By by_about=By.xpath("//span[text()='About']");
	 
	 static WebElement profile()
	 {
		 return driver.findElement(by_profile1);
	 }
	 
	 static WebElement about()
	 {
		return driver.findElement(by_about);
	 }
	
	 
	 public static void profile1()
	 {
		 profile().click();
	 }
	 
	 public static void about1()
	 {
		 about().click();
	 }
	 
}
