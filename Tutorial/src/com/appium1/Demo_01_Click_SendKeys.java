package com.appium1;

import java.io.IOException;
import java.util.List;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo_01_Click_SendKeys extends Base{

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		System.out.println("Begin 1st Test: Click and send keys using xpath/id/class name");
		
		//System.out.println(driver.getPlatformName());
				
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

		driver.findElementByClassName("android.widget.EditText").sendKeys("dgdgdgdgdggdgd");
		
		//driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
//		AndroidElement myElement = driver.findElementByXPath("//android.widget.Button[@text='OK']");
//		myElement.click();
		
		int count = driver.findElementsByClassName("android.widget.Button").size();
		
		System.out.println("size of elements list is: " + count);
		//Get all buttons into a collection
		List <AndroidElement> aeButtons = driver.findElementsByClassName("android.widget.Button");
		System.out.println("Text of button 1: " + aeButtons.get(1).getText());
		aeButtons.get(1).click();
		System.out.println("Finish first Test: WIFI Settings");
	}

}
