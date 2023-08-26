package Basic;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class Facebook 
{
public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//WebDriverWait d=new WebDriverWait(driver,Duration.ofSeconds(8000));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	
	By by_Username=By.xpath("//input[@id='email']");
	WebElement ele_mail=driver.findElement(by_Username);
	ele_mail.sendKeys("9581509211");
	//Thread.sleep(2000);
	
	By by_password=By.xpath("//input[@id='pass']");
	WebElement ele_pass=driver.findElement(by_password);
	ele_pass.sendKeys("vanijoyce");
	//Thread.sleep(2000);
	
	By by_login=By.xpath("//button[@name='login']");
	WebElement ele_button=driver.findElement(by_login);
	ele_button.click();
	//Thread.sleep(3000);
	
	By by_profile1=By.xpath("(//a[@href='https://www.facebook.com/bharathkumar.cfcgvjhv'])[1]");
	WebElement ele_profile=driver.findElement(by_profile1);
	ele_profile.click();
	//Thread.sleep(3000);
	
	By by_about=By.xpath("//a[@href='https://www.facebook.com/bharathkumar.cfcgvjhv/about']");
	WebElement ele_about=driver.findElement(by_about);
	ele_about.click();
	//Thread.sleep(3000);
	
	By by_profile=By.xpath("//div[@class='x78zum5 x1n2onr6']");
	WebElement ele_Icon=driver.findElement(by_profile);
	ele_Icon.click();
	//Thread.sleep(3000);
	
	By by_logout=By.xpath("//span[.='Log out']");
	WebElement ele_Icon1=driver.findElement(by_logout);
	ele_Icon1.click();
	//Thread.sleep(2000);
	
	
	driver.close();
	
 }
}
