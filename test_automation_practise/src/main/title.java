package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class title extends base_page
{
	 static By by_home=By.xpath("//a[text()='Home']");
	 static By by_practice=By.xpath("//a[text()='Practice']");
	 static By by_Courses=By.xpath("//a[text()='Courses']");
	 
	 
	 static  WebElement ele_home=driver.findElement(by_home);
	 static  WebElement ele_practice=driver.findElement(by_practice);
	 static  WebElement ele_courses=driver.findElement(by_Courses);  
	 
	 
	 public static void search() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 ele_home.click();
		 Thread.sleep(2000);
	 }
	 
	 public static void click() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 ele_practice.click();
		 Thread.sleep(2000);
	 }
	 
	 public static void mob() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 ele_courses.click();
		 Thread.sleep(2000);
	 }
}
