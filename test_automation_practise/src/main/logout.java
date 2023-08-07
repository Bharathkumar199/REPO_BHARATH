package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class logout extends base_page
{
	 static By by_logout=By.xpath("//a[text()='Log out']");
	 
	 
	 static WebElement ele_lougot=driver.findElement(by_logout);
	 
	 public static void lg()
	 {
	    ele_lougot.click();
	 }
}
