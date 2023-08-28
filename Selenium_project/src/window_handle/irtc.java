package window_handle;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class irtc 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String parent=driver.getWindowHandle();

		System.out.println("parentwindow - " + parent);

		By by_bus=By.xpath("//a[text()=' BUSES ']");
		WebElement ele_bus=driver.findElement(by_bus);
		Thread.sleep(2000);
		ele_bus.click();


		Set<String> handle=driver.getWindowHandles();

		for (String handles : handle) 

		{
			System.out.println(handles);
			if(!parent.equals(handles))
			{
				driver.switchTo().window(handles);
				By by_hotel=By.xpath("//div[@class='Nav-icons IRCTCHotels']");
				WebElement ele_hotel=driver.findElement(by_hotel);
				Thread.sleep(2000);
				ele_hotel.click();
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(parent);
		System.out.println("parent window - " + parent+"*********");
		//		Thread.sleep(2000);


		By by_flight=By.xpath("//a[.=' FLIGHTS ']");
		WebElement ele_flight=driver.findElement(by_flight);
		//		Thread.sleep(2000);
		ele_flight.click();

		By by_pop=By.xpath("//button[.='Later']");
		System.out.println(driver.getTitle());
		Set<String>c=driver.getWindowHandles();
		String[] Geeks = c.toArray(new String[c.size()]);
		driver.switchTo().window(Geeks[3]);
		System.out.println(driver.getTitle()+"  flight");
		//		Thread.sleep(6000);

		WebElement ele_pop=driver.findElement(by_pop);
		ele_pop.click();

		By by_login=By.xpath("//a[.='Login']");
		WebElement ele_login=driver.findElement(by_login);
		//		Thread.sleep(2000);
		ele_login.click();

		By by_eun=By.xpath("//input[@id='loginuseridUser']");
		WebElement ele_eun=driver.findElement(by_eun);
		//		Thread.sleep(2000);
		ele_eun.sendKeys("bharath");

		By by_x=By.xpath("(//i[@class='fa fa-close'])[2]");
		WebElement ele_x=driver.findElement(by_x);
		//		Thread.sleep(2000);
		ele_x.click();
	    System.out.println(driver.getTitle());
		driver.close();

        
		
//		Set<String> c1=driver.getWindowHandles();
//		String arr[]=c1.toArray(new String[c1.size()]);
//		driver.switchTo().window(Geeks[2]);
//		By by_na=By.xpath("//input[@id='loginuseridUser']");
//		WebElement ele_na=driver.findElement(by_na);
//		Thread.sleep(6000);
//		ele_na.sendKeys("bharath");
//		driver.close();		


	}



}
