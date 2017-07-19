package com.appium1;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Demo_02_DriverMethods extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		System.out.println("Begin 7st Test: Extra methods for mobile driver object");


		//TouchAction action = new TouchAction(driver);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		System.out.println("===================================================");
		System.out.println("Current Activity: " + driver.currentActivity());
		//Get context: Native, Hybrid, Web
		System.out.println("Get Context: "+ driver.getContext());
		System.out.println("Get Orientation: " + driver.getOrientation());
		System.out.println("Is mobile device locked ? : "+ driver.isLocked());
		System.out.println("Click on the Back Button in the mobile device.");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("Click on the Home Button in the mobile device.");
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.HOME);
		
		
		
		System.out.println("===================================================");
		
	System.out.println("Finish  7st Test: Extra methods for mobile driver object");
	}

}
