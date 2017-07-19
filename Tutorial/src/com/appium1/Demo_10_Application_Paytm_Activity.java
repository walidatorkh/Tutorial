package com.appium1;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.remote.MobilePlatform;

public class Demo_10_Application_Paytm_Activity extends Base {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Start of task");
		File appDir = new File("src");
		File fs = new File(appDir, "net.one97.paytm-5.8.1@APK4Fun.com.apk");
		
		new DesiredCapabilities();
		DesiredCapabilities cap = DesiredCapabilities.android();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "demo1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		cap.setCapability("appPackage","net.one97.paytm");
		//cap.setCapability("appActivity", ".AJRJarvisSplash");
		cap.setCapability("appActivity", ".wallet.newdesign.activity.PaySendActivity");
		cap.setCapability("clearSystemFiles", true);
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.currentActivity());
		



		System.out.println("End of task");
	}
}
