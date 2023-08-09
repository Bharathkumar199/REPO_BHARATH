package you_tube1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class title extends base_page
{
	static By by_title=By.xpath("//a[@title='RRR: Naatu Naatu Song (TELUGU) NTR, Ram Charan | M M Keeravaani | SS Rajamouli | Telugu Songs 2021']");
	static By by_clcik=By.xpath("//div[@id='segmented-like-button']");
	
	 static WebElement tit()
	 {
		 return driver.findElement(by_title);
	 }
	 
	 static WebElement clic()
	 {
	      return driver.findElement(by_clcik);
	 }
	 
	 public static void tile()
	 {
		 tit().click();
	 }
	 
	 public static void like()
	 {
		  clic().click();
	 }
}
