package HelloAppium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HelloAppium {
	
	public static void main(String[] args) throws MalformedURLExceptionxception, MalformedURLException {
		// TODO Auto-generated method stub
			
		
		System.out.println("=====begin test here============");
		File file = new File("src");
		File fileApk = new File(file, "ApiDemos-debug.apk");
		
		
		
		System.out.println("=====capabilities============");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "demo1");
		cap.setCapability(MobileCapabilityType.APP, fileApk.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),cap); 
		
		System.out.println("Get Platform name: " + driver.getPlatformName());
		
		driver.findElementByXPath("//android.widget.TextView[(@text='Preference')]").click();
		
		
//		System.out.println("Begin 3st Test: Long click");
//		
//		//Click on the views item in the menu of API Demos app
//		//findElementByAndoridUIAutomator: ("attribute(\"value\")")
//		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//		//Tap
//		AndroidElement aeExpandList = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
//		
//		TouchAction ta = new TouchAction(driver);
//		ta.tap(aeExpandList).perform();
//		driver.findElementByXPath("//android.widget.TextView[contains(@text,'Custom Adapter')]").click();
//		//02+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+3+366666666666666666666666666666666666666++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++999999999999999999999999999999999999999999999999999999999999999999000000000000000
//		TouchAction action = new TouchAction(driver);
//		action.longPress(driver.findElementByXPath("//android.widget.TextView[contains(@text,'People Names')]")).perform();
//		System.out.println(driver.findElementById("android:id/title").getText());
//		
//		AndroidElement ae1 = driver.findElementByAndroidUIAutomator("text(\"Sample action\")");
//		ae1.click();
//		
//		//Sample action
//		System.out.println("Finish 3st Test");
//		
//		
//		
//		System.out.println("======Finish Test Case======");
		
	}

}
