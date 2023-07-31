package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange 
{
   public static void main(String[] args) throws InterruptedException 
   {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 Thread.sleep(2000);
	 
	 By by_un=By.xpath("//input[@name='username']");
	 WebElement ele_un=driver.findElement(by_un);
	 ele_un.sendKeys("Admin");
	 Thread.sleep(2000);

	 By by_pw=By.xpath("//input[@name='password']");
	 WebElement ele_pw=driver.findElement(by_pw);
	 ele_pw.sendKeys("admin123");
	 Thread.sleep(2000);                                              
	 
	 By by_login=By.xpath("	//button[@type='submit']");
	 WebElement ele_login=driver.findElement(by_login);
	 ele_login.click();
	 Thread.sleep(2000);
	 
	 By by_admin=By.xpath("//span[.='Admin']");
	 WebElement ele_admin=driver.findElement(by_admin);
	 ele_admin.click();
	 Thread.sleep(2000);
	 
//	 By by_My=By.xpath("//span[.='My Info']");
//	 WebElement ele_My=driver.findElement(by_My);
//	 ele_My.click();
//	 Thread.sleep(2000);
//	 
//	 By by_name=By.xpath("//input[@name='firstName']");
//	 WebElement ele_name=driver.findElement(by_name);
//	 String c=ele_name.getAttribute("text");
//	 ele_name.click();
//	 Thread.sleep(2000);
	 
	 By by_un1=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	 WebElement ele_un1=driver.findElement(by_un1);
	 ele_un1.sendKeys("bharath");
	 Thread.sleep(2000);
	 
	 By by_dd1=By.xpath("(//div[@class='oxd-select-text--after'])[1]");
	 WebElement ele_dd1=driver.findElement(by_dd1);
	 ele_dd1.click();
	 Thread.sleep(2000);
	 
	 By by_dd=By.xpath("(//div[.='ESS'])[1]");
	 WebElement ele_dd=driver.findElement(by_dd);
	 ele_dd.click();
	 Thread.sleep(2000);
	 
	 By by_hint=By.xpath("//input[@placeholder='Type for hints...']");
	 WebElement ele_hint=driver.findElement(by_hint);
	 ele_hint.sendKeys("xyz  abc");
	 Thread.sleep(2000);
	 
	 By by_dd2=By.xpath("(//div[@class='oxd-select-text--after'])[2]");
	 WebElement ele_dd2=driver.findElement(by_dd2);
	 ele_dd2.click();
	 Thread.sleep(2000);
	 
	 By by_enabled=By.xpath("(//div[.='Enabled'])[1]");
	 WebElement ele_enabled=driver.findElement(by_enabled);
	 ele_enabled.click();
	 Thread.sleep(2000);
	 
	 By by_sub=By.xpath("//button[@type='submit']");
	 WebElement ele_sub=driver.findElement(by_sub);
	 ele_sub.click();
	 Thread.sleep(2000);
	 
	 By by_search=By.xpath("//button[@type='submit']");
	 WebElement ele_search=driver.findElement(by_search);
	 ele_search.click();
	 Thread.sleep(5000);
	 
	 By by_pro=By.xpath("//span[@class='oxd-userdropdown-tab']");
	 WebElement ele_pro=driver.findElement(by_pro);
	 ele_pro.click();
	 Thread.sleep(2000);
	 
	 By by_lo=By.xpath("//a[.='Logout']");
	 WebElement ele_lo=driver.findElement(by_lo);
	 ele_lo.click();
	 Thread.sleep(2000);
	 
	 driver.close();
	 
   }
}
