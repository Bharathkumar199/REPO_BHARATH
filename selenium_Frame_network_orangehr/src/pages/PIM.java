package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PIM extends base_class
{
	static By by_pim=By.xpath("//span[.='PIM']");
	static By by_AE=By.xpath("//a[.='Add Employee']");
	static By by_FN=By.xpath("//input[@name='firstName']");
	static By by_MN=By.xpath("//input[@name='middleName']");
	static By by_LN=By.xpath("//input[@name='lastName']");
	static By by_ID=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	static By by_save=By.xpath("//button[.=' Save ']");

	static WebElement ele_pim()
	{
		return driver.findElement(by_pim);
	}

	static WebElement ele_AE()
	{
		return driver.findElement(by_AE);
	}

	static WebElement ele_FN()
	{
		return driver.findElement(by_FN);
	}

	static WebElement ele_MN()
	{
		return driver.findElement(by_MN);
	}

	static WebElement ele_LN()
	{
		return driver.findElement(by_LN);
	}

	static WebElement ele_ID()
	{
		return driver.findElement(by_ID);
	}

	static WebElement ele_save()
	{
		return driver.findElement(by_save);
	}



	public static void pim()
	{
		ele_pim().click();
	}

	public static void AE()
	{
		ele_AE().click();
	}

	public static void FN(String firstname)
	{
		ele_FN().click();
		ele_FN().sendKeys("bharath");
	}

	public static void mn()
	{
		ele_MN().click();
		ele_MN().sendKeys("kumar");
	}

	public static void ln()
	{
		ele_LN().click();
		ele_LN().sendKeys("B");
	}

	public static void ID()
	{
		ele_ID().click();
		ele_ID().sendKeys("1234");
	}

	public static void save()
	{
		ele_save().click();
	}



}




