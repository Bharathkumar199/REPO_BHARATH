package main1;

import java.util.Set;

public class delete_tab extends base_page
{

	public static void delete()
	{
		Set<String>c=driver.getWindowHandles();
		String arr[] = c.toArray(new String[c.size()]);
		driver.switchTo().window(arr[2]);
		driver.close();
		System.out.println(driver.getTitle()+"  flight");

        driver.switchTo().window(profile_bus.parent);
	}
	
	
	
	
}
