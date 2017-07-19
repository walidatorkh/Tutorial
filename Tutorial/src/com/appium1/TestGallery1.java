package com.appium1;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestGallery1 {

	public static void main(String[] args) throws IOException, InterruptedException {

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

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Start double tapping testing");
		driver.findElement(By.id("com.android.camera:id/thumbnail")).click();

		TouchAction ta = new TouchAction(driver);
		driver.findElement(By.id("com.android.camera:id/thumbnail_image_frame")).click();
		Thread.sleep(3000);

		ta.tap(driver.findElement(By.id("com.android.gallery:id/image")))
				.tap(driver.findElement(By.id("com.android.gallery:id/image"))).perform();

		Thread.sleep(2000);

		// Thread.sleep(3000);
		System.out.println("Test was terminate");

	}

}
