package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class you_tube 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.youtube.com/");
	  
	  By by_id=By.xpath("//input[@id='search']");
	  WebElement ele_id=driver.findElement(by_id);
	  Thread.sleep(2000);
	  ele_id.sendKeys("natu natu song");
	  Thread.sleep(2000);
	  
	  By by_search=By.xpath("//button[@class='style-scope ytd-searchbox']");
	  WebElement ele_search=driver.findElement(by_search);
	  ele_search.click();
	  Thread.sleep(2000);
	  
	  By by_title=By.xpath("(//a[@href='/watch?v=_vktceH8ZA0&pp=ygUObmF0dSBuYXR1IHNvbmc%3D'])[2]");
	  WebElement ele_title=driver.findElement(by_title);
	  ele_title.click();
	  Thread.sleep(2000);
	  
	  By by_clcik=By.xpath("//div[@id='segmented-like-button']");
	  WebElement ele_click=driver.findElement(by_clcik);
	  ele_click.click();
	  Thread.sleep(2000);
	  
	  
   }
}
