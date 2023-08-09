package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main1 
{
   public static void main(String[] args) throws InterruptedException 
   {
      Login_page.facebook();
	  Login_page.un();
	  Login_page.pw();
	  Login_page.login();
	  
	  Thread.sleep(2000);
	  profile.profile1();
	  Thread.sleep(2000);
	  profile.about1();
	  
	  Thread.sleep(2000);
	  logout.profile2();
	  Thread.sleep(2000);
	  logout.logout1();
   }
}
