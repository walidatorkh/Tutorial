package HelloAppium;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> Capabilities() throws IOException, InterruptedException {


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
