package window_handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	 WebDriver driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.amazon.in/ref=nav_logo");
	     
	     String parentwindow=driver.getWindowHandle();
	     
	     System.out.println("parent window - " + parentwindow);
	     
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("redmi mobiles");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
	     Thread.sleep(2000);
	     Set<String> handles=  driver.getWindowHandles();
	     
	     for (String handle : handles) 
	     {
			System.out.println(handle);
			
			if(!parentwindow.equals(handle))
			{
				driver.switchTo().window(handle);
				driver.close();
			}
	     	     }
	     driver.switchTo().window(parentwindow);
	     System.out.println("parent window - " + parentwindow );
	     Thread.sleep(2000);
	}
}
