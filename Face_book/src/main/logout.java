package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class logout extends Base_page
{
	 static By by_profile=By.xpath("//div[@class='x78zum5 x1n2onr6']");
	 static By by_logout=By.xpath("//span[.='Log out']");
	 
	 static WebElement ele_Icon=driver.findElement(by_profile);
	 static WebElement ele_Icon1=driver.findElement(by_logout);
	 
	 public static void profile2()
	 {
		 ele_Icon.click();
	 }
	 
	 public static void logout1()
	 {
		 ele_Icon1.click();
	 }
}
