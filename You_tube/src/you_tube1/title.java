package you_tube1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class title extends base_page
{
	static By by_title=By.xpath("//a[@title='RRR: Naatu Naatu Song (TELUGU) NTR, Ram Charan | M M Keeravaani | SS Rajamouli | Telugu Songs 2021']");
	static By by_clcik=By.xpath("//div[@id='segmented-like-button']");
	
	 static WebElement ele_title=driver.findElement(by_title);
	 static WebElement ele_click=driver.findElement(by_clcik);
	 
	 public static void tile()
	 {
		 ele_title.click();
	 }
	 
	 public static void like()
	 {
		  ele_click.click();
	 }
}
