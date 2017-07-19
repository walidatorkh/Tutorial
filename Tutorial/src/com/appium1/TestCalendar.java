package com.appium1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalendar {

	WebDriver driver;

	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		// 1. Set BROWSER_NAME desired capability. It's Android in our case here.
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		// 2. Set android deviceName desired capability. Set your device name. 
		capabilities.setCapability("deviceName", "demo1"); 
		// 3. Set android VERSION desired capability. Set your mobile device's OS version. 
		capabilities.setCapability(CapabilityType.VERSION, "4.4.2");
		// 4. Set android platformName desired capability. It's Android in our case here. 
		capabilities.setCapability("platformName", "Android");
		// 5. Set android appPackage desired capability. It is 
		// com.android.calculator2 for calculator application.
		// 6. Set your application's appPackage if you are using any other app. 
		capabilities.setCapability("appPackage", "com.android.calendar"); 
		// 7. Set android appActivity desired capability. It is 
		// com.android.calculator2.Calculator for calculator application. 
		// Set your application's appPackage if you are using any other app. 
		capabilities.setCapability("appActivity", "com.android.calendar.AllInOneActivity");

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test 
	public void Sum() {
		
		System.out.println("Test1");


	}


	@AfterTest 
	public void End()
	{ 

		driver.quit();
	}

}
