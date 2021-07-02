package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_9 {
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
	@Test
	public void jobListing()
	{
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		 Actions builder = new Actions(driver);
		 WebElement element = driver.findElement(By.xpath("//a[@href = 'edit.php?post_type=job_listing']/div[@class = 'wp-menu-name']"));
		 builder.moveToElement(element).build().perform();
		//driver.findElement(By.xpath("//div[contains(text(),'Job Listings')]")).click();
		//Actions action = new Actions(driver);
		//action.moveToElement(job_listing);
		//WebElement subMenu =driver.findElement(By.xpath("//a[@href ='edit.php?post_type=job_listing']]"));
		//action.click().build().perform();
		
	}
	@AfterTest
	public void driverClose()
	{
		//driver.close();
	}
}
