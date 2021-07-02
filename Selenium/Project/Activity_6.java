package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_6 {
	WebDriver driver;
	@BeforeTest
	public void browserOpen()
	{
		
		driver = new FirefoxDriver();
	}

	@Test
	public void applyJob() throws InterruptedException
	{
		driver.get("https://alchemy.hguy.co/jobs/");
		WebElement element = driver.findElement(By.xpath("//a[@href = 'https://alchemy.hguy.co/jobs/jobs/']"));
		element.click();
        Assert.assertEquals(driver.getTitle(),"Jobs – Alchemy Jobs");
        WebElement SearchKey = driver.findElement(By.id("search_keywords"));
        SearchKey.sendKeys("BANKING");
        WebDriverWait wait = new WebDriverWait(driver, 2000);
        WebElement SearchButton = driver.findElement(By.xpath("//div[@class='search_submit']/input[@type = 'submit']"));
        SearchButton.click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//h3[text()='Banking402']")).click();
        driver.findElement(By.partialLinkText("Banking402")).click();
        driver.findElement(By.xpath("//input[@class = 'application_button button']")).click();
      String email =   driver.findElement(By.linkText("JobID721@gmail.com")).getText();
        System.out.println(email);
	}
	@AfterTest
	public void driverClose()
	{
	driver.close();
		
	}
}
