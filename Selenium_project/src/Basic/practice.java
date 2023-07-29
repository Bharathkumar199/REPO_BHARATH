package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice 
{
      public static void main(String[] args) throws InterruptedException 
    {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     driver.get("https://practicetestautomation.com/practice-test-login/");
	     
	    By by_un=By.xpath("//input[@type='text']");                                           
	    WebElement ele_un=driver.findElement(by_un);
	    ele_un.sendKeys("student");
	    Thread.sleep(2000);

	    By by_pw=By.xpath("//input[@id='password']");
	    WebElement ele_pw=driver.findElement(by_pw);
	    ele_pw.sendKeys("Password123");
	    Thread.sleep(2000);
	    
	    By by_submit=By.xpath("//button[@class='btn']");
	    WebElement ele_submit=driver.findElement(by_submit);
	    ele_submit.click();
	    Thread.sleep(2000);
	    
	    By by_home=By.xpath("//a[text()='Home']");
	    WebElement ele_home=driver.findElement(by_home);
	    ele_home.click();
	    Thread.sleep(2000);
	    
	    By by_practice=By.xpath("//a[text()='Practice']");
	    WebElement ele_practice=driver.findElement(by_practice);
	    ele_practice.click();
	    Thread.sleep(2000);
	    
	    
	    By by_Courses=By.xpath("//a[text()='Courses']");
	    WebElement ele_courses=driver.findElement(by_Courses);
	    ele_courses.click();
	    Thread.sleep(5000);
	    
	    
	    By by_logout=By.xpath("//a[text()='Log out']");
	    WebElement ele_lougot=driver.findElement(by_logout);
	    ele_lougot.click();
	    Thread.sleep(2000);
	   
	    driver.close();
	    
	}
}
