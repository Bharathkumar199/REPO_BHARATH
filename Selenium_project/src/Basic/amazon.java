package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	 Thread.sleep(2000);
	 
	 By by_mob=By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]");
	 WebElement ele_mob=driver.findElement(by_mob);
	 ele_mob.click();
	 Thread.sleep(5000);
	
	 By by_cart=By.xpath("//span[@id='wishListMainButton']");
	 WebElement ele_cart=driver.findElement(by_cart);
	 ele_cart.click();
	 
	 By by_create=By.xpath("(//input[@class='a-button-input a-declarative'])[4]");
	 WebElement ele_create=driver.findElement(by_create);
	 ele_create.click();
	 
	 
   }
}
