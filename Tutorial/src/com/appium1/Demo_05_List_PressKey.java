package com.appium1;

import java.io.IOException;
import java.util.List;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Demo_05_List_PressKey extends Base{

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		System.out.println("Begin 1st Advance Test: Click and send keys using xpath/id/class name");
		
	
		//xpath id className, androidUIautomator
		
		/**
		 * xpath syntax
		 * object.findElementByXpath(//tagName[@attribute='value']).Method();
		 * 
		 */
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		//driver.findElementByXPath("//android.widget.CheckBox[@index=0]").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		//driver.findElementByXPath("//android.widget.EditText[@index=0]").sendKeys("hello");
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hagai_WifiSetting1");
		//driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		int count = driver.findElementsByClassName("android.widget.Button").size();
		System.out.println("size of elements list is: " + count);
		List <AndroidElement> aeButtons = driver.findElementsByClassName("android.widget.Button");
		aeButtons.get(1).click();
		Thread.sleep(2000);
		System.out.println("Go back using AndroidKeyCode");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.TextView[@text='5. Preferences from code']").click();
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(4000);
		driver.pressKeyCode(AndroidKeyCode.HOME);
		//driver.findElementByXPath("//android.widget.TextView[@text=[@text='4. Default values']").click();
		
		System.out.println("Finish first Test: WIFI Settings");
	}

}
