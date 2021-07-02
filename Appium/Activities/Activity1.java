package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
    WebDriverWait wait;
    AppiumDriver<MobileElement> driver = null;
	@BeforeTest
	public void setup()
	{
        DesiredCapabilities caps = new DesiredCapabilities();
    	
	    caps.setCapability("deviceName", "Pixel4Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
    	  AppiumDriver<MobileElement> driver = null;
	  try {
	 // Driver Initializing
	 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	   System.out.println("Calculator is open");
	
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
	
        }
	}
	@Test
	public void test()
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/selenium");
	}
}
