package package_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class Login_page extends Base_page
{
	
	static By by_Username=By.xpath("//input[@id='email']");
	static By by_password=By.xpath("//input[@id='pass']");
	static By by_login=By.xpath("//button[@name='login']");
	
	
	static WebElement ele_mail=driver.findElement(by_Username);
	static WebElement ele_pass=driver.findElement(by_password);
	static WebElement ele_button=driver.findElement(by_login);
	
	
	public static void un() throws InterruptedException
	{
		Thread.sleep(2000);
		ele_mail.sendKeys("9581509211");
//		Thread.sleep(2000);
	}
	
	public static void pw() throws InterruptedException
	{
		Thread.sleep(2000);
		ele_pass.sendKeys("vanijoyce");
//		Thread.sleep(2000);
	}
	
	public static void login() throws InterruptedException
	{
		Thread.sleep(2000);
		ele_button.click();
//		Thread.sleep(2000);
	}
}
