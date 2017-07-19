package com.appium1;

import java.io.IOException;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo_07_Scroll extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		System.out.println("Begin 5st Test: Scroll");

		//swipe: action.longPress(ele2).moveTo(x2,580).release().perform();
		//Click on the views item in the menu of API Demos app

		//TouchAction action = new TouchAction(driver);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		try{
			AndroidElement ae1 = driver.findElementByXPath("//*[@text='TextClock']");
			System.out.println("Scrollable: " + ae1.getAttribute("scrollable"));
		}
		catch (Exception ex) {

			System.out.println("before scroll item was not found");
		}

		//Syntax for scrolling to an item in an Android script
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextClock\"));");

		try{
			AndroidElement ae1 = driver.findElementByXPath("//*[@text='TextClock']");
			System.out.println("Item was found: " + ae1.getAttribute("text"));
		}
		catch (Exception ex) {

			System.out.println("item was not found");
		}

	}

}
