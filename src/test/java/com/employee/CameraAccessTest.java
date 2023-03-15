package com.employee;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.browserstack.config.Platform;

import java.net.MalformedURLException;
import java.net.URL;

public class CameraAccessTest {

	@Test
	private void empId() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserstack.user", "jagadeesh_Bc7WMr");
		caps.setCapability("browserstack.key", "RAhWbcP7fxDPHvSqLT7t");
        caps.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
    	
	    caps.setCapability("device", "iPhone XS");
        caps.setCapability("os_version", "12");
		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "browserstack-build-1");
		caps.setCapability("name", "first_test");
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("browserstack.local", "false");

		
		WebDriver driver = new RemoteWebDriver(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
		Thread.sleep(15000);

		driver.findElement(By.id("Text Button")).click();
	       Thread.sleep(5000);
	        driver.findElement(By.id("Text Input")).sendKeys("hello@browserstack.com");;
	        Thread.sleep(5000);
	 
		driver.quit();
	}

	@Test
	private void empId2() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserstack.user", "jagadeesh_Bc7WMr");
    	caps.setCapability("browserstack.key", "RAhWbcP7fxDPHvSqLT7t");
    	
    	// Set URL of the application under test
    	caps.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
    	
    	// Specify device and os_version for testing
	    caps.setCapability("device", "iPhone 6S");
        caps.setCapability("os_version", "12");
    
        
    	// Set other BrowserStack capabilities
    	caps.setCapability("project", "First Java Project");
    	caps.setCapability("build", "browserstack-build-1");
    	caps.setCapability("name", "first_test");
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("browserstack.interactiveDebugging", "true");

		
		WebDriver driver = new RemoteWebDriver(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
		Thread.sleep(15000);

		driver.findElement(By.id("Text Button")).click();
	       Thread.sleep(5000);
	        driver.findElement(By.id("Text Input")).sendKeys("hello@browserstack.com");;
	        Thread.sleep(5000);
	         
		driver.quit();
	}

}
