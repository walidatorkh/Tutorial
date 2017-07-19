package com.appium1;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo_00_ClickElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Base.Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

	}

}
