package window_handle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pan_card_application 
{
    public static void main(String[] args) throws InterruptedException 
    {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
		driver.get("https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html");
		Thread.sleep(2000);
		String c=driver.getWindowHandle();
		System.out.println(c  +"   -   parent window  ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Home']")).click();
		Set<String>child=driver.getWindowHandles();
		for (String handle : child) 
		{
			System.out.println(handle);
			if(!c.equals(handle))
			{
				driver.switchTo().window(handle);
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(c);
		System.out.println(c  +"   -   parent window  ");
		
		
		
		
	}
}
