package Basic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class W3_schools 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://profile.w3schools.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   By by_UN=By.xpath("//input[@id='modalusername']");
	   WebElement ele_UN=driver.findElement(by_UN);
	   ele_UN.sendKeys("bompallibharath@gmail.com");
	   
	   
	   By by_Pass=By.xpath("//input[@id='current-password']");
	   WebElement ele_Pass=driver.findElement(by_Pass);
	   ele_Pass.sendKeys("Bharath*1419");
	 
	   
	   By by_Login=By.xpath("//span[text()='Log in']");
	   WebElement ele_Login=driver.findElement(by_Login);
	   ele_Login.click();
	   
	   
	   driver.switchTo().frame("classic-menu");
	   
	   
	   By by_profile=By.xpath("//a[text()='Profile']");
	   WebElement ele_profile=driver.findElement(by_profile);
	   ele_profile.click();
	   
	   Thread.sleep(5000);
	   
	   driver.switchTo().frame("classic-menu");
	   By by_pt1=By.xpath("//a[@title='Home']/i");
	   Thread.sleep(5000);
	   WebElement ele_pt1=driver.findElement(by_pt1);
	   ele_pt1.click();
	   
	   By by_face=By.xpath("(//a[@title='W3Schools on Facebook'])[3]");
	   WebElement ele_face=driver.findElement(by_face);
	   Thread.sleep(2000);
	   ele_face.click();
	   
	   
	   
	}
}
