package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon 
{
   public static void main(String[] args) throws InterruptedException 
   {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_0cc31a74ccce6b8bd234c48133f7e00f4427f2ae9bcf6f83e12e2a41&mfadid=adm");
	 driver.manage().window().maximize();
	 
	 Thread.sleep(2000);
	 By by_sign=By.xpath("//a[@id='nav-link-accountList']");
	 WebElement ele_sign=driver.findElement(by_sign);
	 ele_sign.click();
	 Thread.sleep(2000);
	 
	 By by_UN=By.xpath("//input[@id='ap_email']");
	 WebElement ele_UN=driver.findElement(by_UN);
	 ele_UN.sendKeys("9573917465");
	 Thread.sleep(2000);
	
	 By by_count=By.xpath("//span[@id='continue']");
	 WebElement ele_count=driver.findElement(by_count);
	 ele_count.click();
	 Thread.sleep(2000);
	 
	 By by_PW=By.xpath("//input[@id='ap_password']");
	 WebElement ele_PW=driver.findElement(by_PW);
	 ele_PW.sendKeys("bharath@1419");
	 Thread.sleep(2000);
	 
	 By by_submit=By.xpath("//input[@id='signInSubmit']");
	 WebElement ele_submit=driver.findElement(by_submit);
	 ele_submit.click();
	 Thread.sleep(2000);
	 
	 By by_search=By.xpath("//input[@id='twotabsearchtextbox']");
	 WebElement ele_search=driver.findElement(by_search);
	 ele_search.sendKeys("redmi mobiles");
	 Thread.sleep(2000);
	 
	 By by_click=By.xpath("//input[@id='nav-search-submit-button']");
	 WebElement ele_click=driver.findElement(by_click);
	 ele_click.click();
	 Thread.sleep(4000);
	 
	 By by_mob=By.xpath("(//span[contains(text(),'A2 (Aqua Blue, 2GB RAM, 32GB Storage) | Powerful Octa Core G36 Processor | Upto 7GB RAM | Large 16.5 cm HD+ Display with Massive 5000mAh Battery | 2 Years Warranty [Limited time Offer]')])[2]");
	 WebElement ele_mob=driver.findElement(by_mob);
	 ele_mob.click();
	 Thread.sleep(4000);
	 
	 By by_cart=By.xpath("//input[@type='button']");
	 WebElement ele_cart=driver.findElement(by_cart);
	 ele_cart.click();
	 Thread.sleep(2000);
	 
   }
}
