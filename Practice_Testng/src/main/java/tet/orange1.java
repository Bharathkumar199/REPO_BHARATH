package tet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orange1 
{
	
	@Test
     public void ma1()
     {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("HYR Tutorials",Keys.ENTER);
		String expectedTitle="HYR Tutorials - Google Search";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
        driver.quit();
     }
}
