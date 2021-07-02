package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_3 {

	WebDriver driver;
	@BeforeTest
	public void browserOpen()
	{
		
		driver = new FirefoxDriver();
	}

	@Test
	public void imageUrl()
	{
	driver.get("https://alchemy.hguy.co/jobs/");
	WebElement image = driver.findElement(By.xpath("//img[@class = 'attachment-large size-large wp-post-image']"));
	String imageurl = 	image.getAttribute("src");
	System.out.println(imageurl);
	}
	@AfterTest
	public void driverClose()
	{
		driver.close();
		
	}
}
