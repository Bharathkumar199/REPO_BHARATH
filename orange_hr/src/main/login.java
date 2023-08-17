package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login extends base_page
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
	 
	 public static void un() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 un1().sendKeys("Admin");
	 }
	 
	 public static void pw() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 pw1().sendKeys("admin123");
	 }
	 
	 public static void submit() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 login().click(); 
	 }
}
