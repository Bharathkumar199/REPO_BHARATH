package window_handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ma 
{
   public static void main(String[] args) throws InterruptedException 
   {
	     WebDriver driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	     
	     String parentwindow=driver.getWindowHandle();
	     
	     System.out.println(parentwindow);
	     driver.findElement(By.id("newWindowBtn")).click();
	     
	     Set<String> handles=  driver.getWindowHandles();
	     
	     
	     for (String handle : handles) 
	     {
			System.out.println(handle);
		}
	     
	     Thread.sleep(2000);
  }
}
