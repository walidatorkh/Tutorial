package com.appium1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCalc {

	WebDriver driver;

	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		// 1. Set BROWSER_NAME desired capability. It's Android in our case here.
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		// 2. Set android deviceName desired capability. Set your device name. 
		capabilities.setCapability("deviceName", "demo1"); 
		// 3. Set android VERSION desired capability. Set your mobile device's OS version. 
		capabilities.setCapability(CapabilityType.VERSION, "7.1.1");
		// 4. Set android platformName desired capability. It's Android in our case here. 
		capabilities.setCapability("platformName", "Android");
		// 5. Set android appPackage desired capability. It is 
		// com.android.calculator2 for calculator application.
		// 6. Set your application's appPackage if you are using any other app. 
		capabilities.setCapability("appPackage", "com.android.calculator2"); 
		// 7. Set android appActivity desired capability. It is 
		// com.android.calculator2.Calculator for calculator application. 
		// Set your application's appPackage if you are using any other app. 
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	
	
	@DataProvider(name = "inputs")
	   public static Object[][] sumNumbers() {
	      return new Object[][] {{2, 3, 5}, {6, 4, 10}, {1, 3, 4}, {9, 0, 10}, {3, 1, 4}};
	   }


	@Test(dataProvider = "inputs")
	public void SumDataPovider(Integer inputNumber1,Integer inputNumber2, Integer result) {
	
		//Click on input a digit in calculator
		driver.findElement(By.id("com.android.calculator2:id/digit_"+inputNumber1+"")).click();
		// Click on + button. 
		driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
		// Click on input b digit in calculator. 
		driver.findElement(By.id("com.android.calculator2:id/digit_"+inputNumber2+"")).click();
		// Click on = button. 
		driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		// Get result from result text box. 
		String iActualResult = driver.findElement(By.id("com.android.calculator2:id/result")).getText(); 
		System.out.println("Number sum result is : " + iActualResult);
		
		Assert.assertEquals(iActualResult, result.toString(), "Wrong results");
		
	}
	
	
	
	@Test(priority=1,enabled = false, testName="Test1") 
	public void Sum() {
		//n1=3;
		//System.out.println("n1="+n1);
		//driver.findElements(By.xpath("//android.widget.Button")).get(0).click();
		// Click on number 2 button. 
		//driver.findElement(By.id("com.android.calculator2:id/digit_"+n1+"")).click();
		driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
		// Click on + button. 
		driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
		// Click on number 5 button. 
		driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
		// Click on = button. 
		driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		// Get result from result text box. 
		String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText(); 
		System.out.println("Number sum result is : " + result);
		//if (result!="7")
		Assert.assertEquals(result, "7", "Wrong results");
		
	}
	
	
	@AfterTest 
	public void End() throws InterruptedException
	{ 
		Thread.sleep(5000);
		driver.quit();
	}

}
