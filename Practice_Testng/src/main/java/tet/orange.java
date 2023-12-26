package tet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class orange 
{
	static WebDriver driver;
     @Test
	public void orange() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(3000);
		
		
	}
   
     @Test
     public void Login() 
     {
    	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9581509211");
    	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("vanijoyce");
    	 driver.findElement(By.xpath("//button[@type='submit']")).click();
     }
    
     
}
