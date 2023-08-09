package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class logout extends Base_page
{
	 static By by_profile=By.xpath("//div[@class='x78zum5 x1n2onr6']");
	 static By by_logout=By.xpath("//span[.='Log out']");
	 
	 static WebElement pro()
	 {
		  return driver.findElement(by_profile);
	 }
	
	  static WebElement log()
	 {
		return driver.findElement(by_logout);
	 }
	 
	 
	 public static void profile2()
	 {
		 pro().click();
	 }
	 
	 public static void logout1()
	 {
		 log().click();
	 }
}
