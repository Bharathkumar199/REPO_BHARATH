package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login extends base_page
{
	static By by_un=By.xpath("//input[@type='text']");
	static By by_pw=By.xpath("//input[@id='password']");
	static By by_submit=By.xpath("//button[@class='btn']");
	
    
    
	 static WebElement ele_un=driver.findElement(by_un);
	 static WebElement ele_pw=driver.findElement(by_pw);
	 static WebElement ele_submit=driver.findElement(by_submit);
	 
	 public static void accout() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 ele_un.sendKeys("student");
		 Thread.sleep(2000);
	 }
	 
	 public static void login1() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 ele_pw.sendKeys("Password123");
		 Thread.sleep(2000);
	 }
	 
	 public static void countine() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 ele_submit.click();
		 Thread.sleep(2000);

	 }
	 
	 
}
