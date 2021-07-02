package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_5 {
	WebDriver driver;
	@BeforeTest
	public void browserOpen()
	{
		
		driver = new FirefoxDriver();
	}

	@Test
	public void jobButton()
	{
		driver.get("https://alchemy.hguy.co/jobs/");
		WebElement element = driver.findElement(By.xpath("//a[@href = 'https://alchemy.hguy.co/jobs/jobs/']"));
		element.click();
        Assert.assertEquals(driver.getTitle(),"Jobs – Alchemy Jobs");

		
	}
	@AfterTest
	public void driverClose()
	{
		driver.close();
		
	}
}
