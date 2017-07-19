package com.appium1;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HelloAppiumExample {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Try/Catch for re-start the emulator
		try{    
			//Process p = Runtime.getRuntime().exec("D:/Users/lenovo/workspace/appium/Tutorial/src/com/appium1/startDemo1.bat");
			Runtime.getRuntime().exec("D:/Users/lenovo/workspace/appium/Tutorial/src/com/appium1/startDemo1.bat");
			Thread.sleep(3000);
			// p.waitFor();



		}catch( IOException ex ){
			//Validate the case the file can't be accesed (not enought permissions)
			System.out.println("error when trying to statr appium emulator: ");
			ex.printStackTrace();
		}


		//Appium code
		System.out.println("Start appium code");
		
		//Direct to the apk which going to be tested
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		//Create capabilities object

		//Open emulator by name by create capability object

		DesiredCapabilities cap = new DesiredCapabilities();

		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "demo1");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		System.out.println("Terminate appium code: " +driver.getPlatformName());
	
	}

}
