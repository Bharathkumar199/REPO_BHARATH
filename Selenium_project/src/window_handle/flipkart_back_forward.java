package window_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart_back_forward 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   WebDriver driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.navigate().to("https://www.google.com/");
	   driver.navigate().to("https://www.flipkart.com/");
	   Thread.sleep(4000);
	   
	   By by_x=By.xpath("//button[text()='✕']");
	   WebElement ele_x=driver.findElement(by_x);
	   Thread.sleep(4000);
	   ele_x.click();
	   
	   
	   
	   
//	   By by_search=By.xpath("//input[@type='text']");
//	   WebElement ele_serach=driver.findElement(by_search);
//	   Thread.sleep(2000);
//	   ele_serach.sendKeys("mobile");
//	   
//	   By by_cli=By.xpath("//button[@type='submit']");
//	   WebElement ele_cli=driver.findElement(by_cli);
//	   Thread.sleep(2000);
//	   ele_cli.click();
	   
	   Actions c= new Actions(driver);
	   System.out.println(c);
  	   c.keyDown(Keys.LEFT_ALT).build().perform();
  	 
  	 
  	 
  	 
//	   driver.navigate().back();
//	   Thread.sleep(2000);
//	   driver.navigate().forward();
  	   driver.close();
	   
   }
}
