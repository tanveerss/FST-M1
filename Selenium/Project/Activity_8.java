package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_8 {
	WebDriver driver;
	@BeforeTest
	public void browserOpen()
	{
		
		driver = new FirefoxDriver();
	}

	@Test
	public void login()
	{
	driver.get("https://alchemy.hguy.co/jobs/wp-admin/");
	 driver.findElement(By.id("user_login")).sendKeys("root");
	 driver.findElement(By.xpath("	//input[@id = 'user_pass']")).sendKeys("pa$$w0rd");
	 driver.findElement(By.xpath("	//input[@id = 'wp-submit']")).click();
	}
	
	@AfterTest
	public void driverClose()
	{
		driver.close();
	}
}
