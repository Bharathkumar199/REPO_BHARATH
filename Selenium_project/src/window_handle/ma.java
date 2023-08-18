package window_handle;


import java.util.Set;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ma 
{
   public static void main(String[] args) throws InterruptedException 
   {
	     WebDriver driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	     
	     String parentwindow=driver.getWindowHandle();
	     
	     System.out.println("parent window - " + parentwindow);
	     
	    // driver.findElement(By.id("newWindowBtn")).click();
	     By clicknewWindow=By.xpath("//button[@id='newWindowBtn']");
	     Thread.sleep(2000);
	     
	     WebElement clicknewW=driver.findElement(clicknewWindow);
	     try
	     {
	     clicknewW.click();
	     }
	     catch(Exception e)
	     {
	    	 
	    	 Actions c= new Actions(driver);
	    	 c.keyDown(Keys.ARROW_DOWN).build().perform();
	    	 c.keyDown(Keys.ARROW_DOWN).build().perform();
	    	 c.keyUp(Keys.ARROW_DOWN).build().perform();
	    	 Thread.sleep(2000);
	    	 clicknewW.click();
	     }
	     	
	     Set<String> handles=  driver.getWindowHandles();
	     
	     for (String handle : handles) 
	     {
			System.out.println(handle);
			
			if(!parentwindow.equals(handle))
			{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("hello world");
				Thread.sleep(3000);
				driver.close();
			}
	     
	     
	     }
	     driver.switchTo().window(parentwindow);
	     System.out.println(driver.getTitle());
	     Thread.sleep(2000);
	     driver.quit();
  }
}
