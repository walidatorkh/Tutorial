package com.appium1;

import java.io.IOException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo_000_GetDriverFromExtendedClass extends Base{

	public static void main(String[] args) throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		//Print driver properties
		System.out.println(driver.getPlatformName());
	}

}
