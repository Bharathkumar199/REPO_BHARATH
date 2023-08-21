package window_handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irtc 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	Thread.sleep(2000);
	
	String parent=driver.getWindowHandle();
	
	System.out.println("parentwindow - " + parent);
	
	By by_bus=By.xpath("//a[text()=' BUSES ']");
	WebElement ele_bus=driver.findElement(by_bus);
	Thread.sleep(2000);
	ele_bus.click();
	
	Set<String> handle=driver.getWindowHandles();
	
	for (String handles : handle) 
		
	{
		System.out.println(handles);
		if(!parent.equals(handles))
		{
			driver.switchTo().window(handles);
			Thread.sleep(2000);
		}
	}
	 driver.switchTo().window(parent);
     System.out.println("parent window - " + parent);
     Thread.sleep(2000);

     for (String handles : handle) 
 		
 	{
 		System.out.println(handles);
 		if(!parent.equals(handles))
 		{
 			driver.switchTo().window(handles);
 			Thread.sleep(2000);

 		}
 	}
     
    
//    By by_cli=By.xpath("//span[text()='Bus Tickets']");
// 	WebElement ele_cli=driver.findElement(by_cli);
// 	Thread.sleep(2000);
// 	ele_cli.click();
     
	
}
}