package main;

public class main1 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  Thread.sleep(2000);
	  login.amazon();
	  Thread.sleep(2000);
	  login.accout();
	  login.login1();
	  Thread.sleep(2000);
	  login.countine();
	  
	  Thread.sleep(2000);
	  title.search();
	  title.click();
	  title.mob();
	  
	  Thread.sleep(2000);
	  logout.lg();
   }
}
