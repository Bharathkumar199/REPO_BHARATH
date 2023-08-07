package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login extends base_page
{ 
	 static By by_un=By.xpath("//input[@name='username']");
	 static By by_pw=By.xpath("//input[@name='password']");
	 static By by_login=By.xpath("//button[@type='submit']");
	 
	 static WebElement ele_un=driver.findElement(by_un);
	 static WebElement ele_pw=driver.findElement(by_pw);
	 static WebElement ele_login=driver.findElement(by_login);
	 
	 public static void un()
	 {
		 ele_un.sendKeys("Admin");
	 }
	 
	 public static void pw()
	 {
		 ele_pw.sendKeys("admin123");
	 }
	 
	 public static void submit()
	 {
		 ele_login.click(); 
	 }
}
