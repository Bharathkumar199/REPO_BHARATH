package find_images;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class img 
{
   public static void main(String[] args) 
   {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://www.flipkart.com");
	  List<WebElement> ele=driver.findElements(By.xpath("//table"));
	  int count = ele.size();
	  System.out.println(count);
	  driver.close();
   }
}
