package com.appium1;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base_WhitRestartEmulator {

	public static AndroidDriver<AndroidElement> Capabilities() throws IOException, InterruptedException {

		try {
			// Runtime.getRuntime().exec("taskkill /F /IM
			// qemu-system-i386.exe");
			// Process p = Runtime.getRuntime().exec("taskkill /F /IM
			// qemu-system-i386.exe");
			// Runtime.getRuntime().exec("D:/data/AppiumDesktop/appiumServer.bat");

			// End previous Emulator
			Runtime.getRuntime().exec("taskkill /F /IM qemu-system-i386.exe");
			Thread.sleep(1000);

			String workingDir = System.getProperty("user.dir");
			// Start the emulation
			System.out.println("Start appium Setup: launch emulator and Open app and return AndroidDriver. ");
			Runtime.getRuntime().exec(workingDir + "\\src\\com\\appium1\\startDemo1.bat");

		} catch (IOException ex) {
			// Validate the case the file can't be access (not enough
			// permissions)
			System.out.println("error when trying to start appium emulator: ");
			ex.printStackTrace();
		}

		// appium setup

		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		// Create capabilities object

		// Open emulator by name

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "demo1");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		// Load tested application: ApiDemos-debug.apk
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		// Initialize Android driver
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		// Setting General wait if element is not exist in first attempt
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Terminate appium setup return driver to class: " + driver.getPlatformName());
		System.out.println("===================================================");

		return driver;

	}

}
