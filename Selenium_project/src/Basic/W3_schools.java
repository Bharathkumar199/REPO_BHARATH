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
	   ele_Pass.sendKeys("Bharath@1419");
	   Thread.sleep(3000);
	   
	   By by_Login=By.xpath("//span[text()='Log in']");
	   WebElement ele_Login=driver.findElement(by_Login);
	   ele_Login.click();
	   Thread.sleep(10000);
	   
	  //By by_home=By.xpath("//i[@class='fa fa-logo ws-hover-text-green']");
	   By by_home = By.xpath("//button[.='Browse tutorials']");
	   Thread.sleep(3000);
	   WebElement ele_home=driver.findElement(by_home);
	   Thread.sleep(3000);
	   
//	   By by_java=By.xpath("//a[text()='Java Tutorial']");
//	   WebElement ele_java=driver.findElement(by_java);
//	   ele_java.click();
//	   Thread.sleep(2000);
   }
}
