package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login extends base_class
{
	 static By by_un=By.xpath("//input[@name='username']");
	 static By by_pw=By.xpath("//input[@name='password']");
	 static By by_login=By.xpath("//button[@type='submit']");
	 
	 
	 static WebElement un1()
	 {
		 return driver.findElement(by_un);
	 }
	 static WebElement pw1()
	 {
		 return driver.findElement(by_pw);
	 }
	 static WebElement login()
	 {
		 return driver.findElement(by_login);
	 }
	 
	
	 public static void loginun( String username)
	 {
		 un1().click();
		 un1().sendKeys(username);
	 }
	 
	 public static void loginpw(String password)
	 {
		 pw1().click();
		 pw1().sendKeys(password);
	 }
	 
	 public static void submit()
	 {
		 login().click();
	 }
}
