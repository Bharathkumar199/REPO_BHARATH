package window_handle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uidai_handle 
{
    public static void main(String[] args) throws InterruptedException 
    {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uidai.gov.in/en/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[.='×']")).click();
		String c=driver.getWindowHandle();
		driver.findElement(By.xpath("(//a[.='Aadhaar Myth Busters'])[2]")).click();
		Thread.sleep(2000);
		Set<String> d=driver.getWindowHandles();
		for (String value : d) 
		{
			System.out.println(value);
			if(!c.equals(value))
			{
			driver.switchTo().window(value);
			driver.close();
			}
		}
		driver.switchTo().window(c);
		System.out.println(c);

		
	}
}
