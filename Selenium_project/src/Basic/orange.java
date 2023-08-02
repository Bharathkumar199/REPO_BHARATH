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
	 Thread.sleep(2000);
	 
	 By by_pim=By.xpath("//span[.='PIM']");
	 WebElement ele_pim=driver.findElement(by_pim);
	 ele_pim.click();
	 Thread.sleep(2000);
	 
	 By by_AE=By.xpath("//a[.='Add Employee']");
	 WebElement ele_AE=driver.findElement(by_AE);
	 ele_AE.click();
	 Thread.sleep(2000);
	 
	 By by_FN=By.xpath("//input[@name='firstName']");
	 WebElement ele_FN=driver.findElement(by_FN);
	 ele_FN.sendKeys("bharath");
	 Thread.sleep(2000);
	 
	 By by_MN=By.xpath("//input[@name='middleName']");
	 WebElement ele_MN=driver.findElement(by_MN);
	 ele_MN.sendKeys("kumar");
	 Thread.sleep(2000);
	 
	 By by_LN=By.xpath("//input[@name='lastName']");
	 WebElement ele_LN=driver.findElement(by_LN);
	 ele_LN.sendKeys("B");
	 Thread.sleep(2000);
	 
	 By by_ID=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	 WebElement ele_ID=driver.findElement(by_ID);
	 ele_ID.sendKeys("1234");
	 Thread.sleep(2000);
	 
	 By by_save=By.xpath("//button[@type='submit']");
	 WebElement ele_save=driver.findElement(by_save);
	 ele_save.click();
	 Thread.sleep(2000);
	 
	 By by_time=By.xpath("//span[.='Time']");
	 WebElement ele_time=driver.findElement(by_time);
	 ele_time.click();
	 Thread.sleep(2000);
	 
	 By by_name=By.xpath("//input[@placeholder='Type for hints...']");
	 WebElement ele_name=driver.findElement(by_name);
	 ele_name.sendKeys("SWAPNA  PARLAPU");
	 Thread.sleep(2000);
	 
	 By by_su1=By.xpath("//button[@type='submit']");
	 WebElement ele_su1=driver.findElement(by_su1);
	 ele_su1.click();
	 Thread.sleep(2000);
	 
	 
	 By by_pro=By.xpath("//img[@class='oxd-userdropdown-img']");
	 WebElement ele_pro=driver.findElement(by_pro);
	 ele_pro.click();
	 Thread.sleep(2000);
	 
	 By by_lo1=By.xpath("(//a[@class='oxd-userdropdown-link' and  //a[.='Logout']])[4]");
	 Thread.sleep(2000);
	 WebElement ele_lo1=driver.findElement(by_lo1);
	 ele_lo1.click();
	 Thread.sleep(2000);
	 
	// driver.close();
	 
   }
}
