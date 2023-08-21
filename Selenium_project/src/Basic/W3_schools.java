package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class W3_schools 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://profile.w3schools.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   
	   By by_UN=By.xpath("//input[@id='modalusername']");
	   WebElement ele_UN=driver.findElement(by_UN);
	   ele_UN.sendKeys("bompallibharath@gmail.com");
	   Thread.sleep(2000);
	   
	   By by_Pass=By.xpath("//input[@id='current-password']");
	   WebElement ele_Pass=driver.findElement(by_Pass);
	   ele_Pass.sendKeys("Bharath*1419");
	   Thread.sleep(3000);
	   
	   By by_Login=By.xpath("//span[text()='Log in']");
	   WebElement ele_Login=driver.findElement(by_Login);
	   ele_Login.click();
	   Thread.sleep(3000);
	   
	   driver.switchTo().frame("classic-menu");
	   
	   Thread.sleep(2000);
	   By by_profile=By.xpath("//a[text()='Profile']");
	   WebElement ele_profile=driver.findElement(by_profile);
	   ele_profile.click();
	   Thread.sleep(3000);
	   
	   
	   
	   driver.switchTo().defaultContent();
	   Thread.sleep(2000);
	   By by_pt=By.xpath("//a[text()='W3schools']");
	   WebElement ele_pt=driver.findElement(by_pt);
	   Thread.sleep(2000);
	   ele_pt.click();
	   
	   

   }
}
