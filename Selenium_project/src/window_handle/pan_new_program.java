package window_handle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pan_new_program 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		Thread.sleep(5000);
		Set<String> d=driver.getWindowHandles();

		System.out.println(d  +  " handles    ");

		List<String> list = new ArrayList(d);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.=' FLIGHTS ']")).click();
		Thread.sleep(5000);
		Set<String> e=driver.getWindowHandles();


		System.out.println(e  +" 2 handle  ");

		
		List<String> differentValues = new ArrayList<>();

		for(String value:d)
		{
			if(!e.contains(value))
			{
				differentValues.add(value);
			}
		}

		for (String value : e) 
		{
			if (!d.contains(value)) 
			{
				differentValues.add(value);
			}
		}

		System.out.println("Different values: " + differentValues);
		driver.close();
	}
}


