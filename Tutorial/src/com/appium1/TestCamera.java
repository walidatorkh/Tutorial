package com.appium1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;


public class TestCamera {

	WebDriver driver;
	TouchAction ta;

	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		// 1. Set BROWSER_NAME desired capability. It's Android in our case
		// here.
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		// 2. Set android deviceName desired capability. Set your device name.
		capabilities.setCapability("deviceName", "demo1");
		// 3. Set android VERSION desired capability. Set your mobile device's
		// OS version.
		capabilities.setCapability(CapabilityType.VERSION, "4.4.2");
		// 4. Set android platformName desired capability. It's Android in our
		// case here.
		capabilities.setCapability("platformName", "Android");
		// 5. Set android appPackage desired capability. It is
		// com.android.calculator2 for calculator application.
		// 6. Set your application's appPackage if you are using any other app.
		capabilities.setCapability("appPackage", "com.android.camera");
		// 7. Set android appActivity desired capability. It is
		// com.android.calculator2.Calculator for calculator application.
		// Set your application's appPackage if you are using any other app.
		capabilities.setCapability("appActivity", "com.android.camera.Camera");

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void Sum() throws InterruptedException {

		System.out.println("Test: Doubel Tap");
		driver.findElement(By.id("com.android.camera:id/thumbnail")).click();
		ta = new TouchAction((PerformsTouchActions) driver);
		
		ta.tap(driver.findElement(By.id("com.android.camera:id/thumbnail_image_frame"))).tap(driver.findElement(By.id("com.android.camera:id/thumbnail_image_frame"))).perform();
		Thread.sleep(4000);
	}

	@AfterTest
	public void End() {

		driver.quit();
	}

}
