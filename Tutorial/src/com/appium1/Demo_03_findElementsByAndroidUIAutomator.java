package com.appium1;

import java.io.IOException;
import java.util.List;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo_03_findElementsByAndroidUIAutomator extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		System.out.println("Begin 4st Test: findElementsByAndroidUIAutomator");
		
		//Click on the views item in the menu of API Demos app
		//findElementByAndoridUIAutomator: ("attribute(\"value\")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Buttons\")").click();
		
		//findElemetsByAndoridUIAutomator: driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
		List<AndroidElement> aeClickableElementList = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)");
		System.out.println("Number of element with clickable true: " + aeClickableElementList.size());
		
		//assertNotNull(aeClickableElementList.size());
		
		
		System.out.println("Finish 4st Test");
	}

}
