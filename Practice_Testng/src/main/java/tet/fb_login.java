package tet;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fb_login 
{

	@Test
	public void fb()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
        By by_Username=By.xpath("//input[@id='email']");
		WebElement ele=driver.findElement(by_Username);
		ele.sendKeys("HYR Tutorials");
        By by_log=By.xpath("//button[@type='submit']");
		WebElement ele1=driver.findElement(by_log);
		ele1.click();
		String actualTitle =driver.getTitle(); 
		String expectedTitle ="Log in to Facebook";
	    Assert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		String actualUrl =driver.getCurrentUrl();
		String expectedurl="https://www.facebook.com/";
		Assert.assertEquals(actualUrl, expectedurl, "URL is mismatched");

		driver.quit();
	}
}



