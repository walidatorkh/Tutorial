package com.appium1;

import java.net.MalformedURLException;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo_09_MobileBrowser extends BaseChrome{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capabilities();
		
		System.out.println("Start test Mobile browser");
		driver.get("https://www.eply.com");
		System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath(".//*[@id='banner']//a").click();
		
		
		Thread.sleep(4000);
		driver.quit();
		System.out.println("Finish test Mobile browser");
		
	}

}
