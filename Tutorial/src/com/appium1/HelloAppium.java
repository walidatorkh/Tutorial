package com.appium1;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HelloAppium {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {


	
		System.out.println("==========Start appium Test==========");
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		//Create capabilities object
		

		DesiredCapabilities cap = new DesiredCapabilities();
		
		//Access emulator by name
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");

		//Open or Install tested application: API demos and open it.
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		//Create the Android Driver instance
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		System.out.println("Terminate appium code: " +driver.getPlatformName());
		System.out.println("==========Finish appium Test==========");
		
	


		//Initilize Androied driver

		//driver.

	}

}
