package com.appium1;

import java.io.IOException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo_04_LongPress extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		System.out.println("Begin 3st Test: Long click");
		
		//Click on the views item in the menu of API Demos app
		//findElementByAndoridUIAutomator: ("attribute(\"value\")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//Tap
		AndroidElement aeExpandList = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		
		TouchAction ta = new TouchAction(driver);
		ta.tap(aeExpandList).perform();
	
		driver.findElementByXPath("//android.widget.TextView[contains(@text,'Custom Adapter')]").click();
		
		TouchAction action = new TouchAction(driver);
		action.longPress(driver.findElementByXPath("//android.widget.TextView[contains(@text,'People Names')]")).perform();
		System.out.println(driver.findElementById("android:id/title").getText());
		
		AndroidElement ae1 = driver.findElementByAndroidUIAutomator("text(\"Sample action\")");
		ae1.click();
		
		//Sample action
		System.out.println("Finish 3st Test");
	}

}
