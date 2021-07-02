package TestNG_Framework;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_7 {
	WebDriver driver;
	@BeforeTest
	public void browserOpen()
	{
		
		driver = new FirefoxDriver();
	}

	@Test
	public void jobPosting()
	{
	driver.get("https://alchemy.hguy.co/jobs/");
	driver.findElement(By.xpath("//a[@href ='https://alchemy.hguy.co/jobs/post-a-job/']")).click();
	driver.findElement(By.id("create_account_email")).sendKeys("tanveersingh1656@gmail.com");
	driver.findElement(By.id("job_title")).sendKeys("API+Selenium Automation");
	driver.findElement(By.id("job_location")).sendKeys("INDIA");
	WebElement job_type = driver.findElement(By.id("job_type"));
	Select s = new Select(job_type);
	s.selectByIndex(2);
	driver.switchTo().frame("job_description_ifr");
	driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("ABCCCCCCCCCCC");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//input[@id= 'application']")).sendKeys("http://www.aapi.com");
	driver.findElement(By.id("company_name")).sendKeys("TS");
	driver.findElement(By.xpath("//input[@value= 'Preview']")).click();
	driver.findElement(By.xpath("//input[@id = 'job_preview_submit_button']")).click();
	driver.findElement(By.xpath("//a[@href = 'https://alchemy.hguy.co/jobs/jobs/']")).click();
	
	
	
	

	
	
	
	}
	@AfterTest
	public void driverClose()
	{
		driver.close();
		
	}
}
