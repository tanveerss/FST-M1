package TestNG_Framework;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_1 {
	
	WebDriver driver;
	@BeforeTest
	public void browserOpen()
	{
		
		driver = new FirefoxDriver();
	}

	@Test
	public void getTittle()
	{
	driver.get("https://alchemy.hguy.co/jobs/");
	String tittle = driver.getTitle();
	Assert.assertEquals(tittle,"Alchemy Jobs – Job Board Application");
		
	}
	@AfterTest
	public void driverClose()
	{
		driver.close();
		
	}
}
