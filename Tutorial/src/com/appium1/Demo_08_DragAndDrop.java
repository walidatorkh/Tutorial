package com.appium1;

import java.io.IOException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo_08_DragAndDrop extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		System.out.println("Begin 6st Test: Drag and drop");

		//Drag and drop

		TouchAction action = new TouchAction(driver);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		AndroidElement aeFirst = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		AndroidElement aeSecond = driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		AndroidElement aeMessage = driver.findElementById("io.appium.android.apis:id/drag_text");
		action.longPress(aeFirst).moveTo(aeSecond).release().perform();
		
		if (aeMessage.getText().contains("Draggable"))
		{
			System.out.println("Drag and drop successfully");
		}
		else
		{
			System.out.println("Drag and drop failed");
		}
		
		System.out.println("Finish 6st Test: Drag and drop");
	}

}
