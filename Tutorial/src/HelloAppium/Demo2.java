package HelloAppium;


	import java.io.IOException;

	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;

	public class Demo2 extends Base {

		public static void main(String[] args) throws IOException, InterruptedException {
			AndroidDriver<AndroidElement> driver = Capabilities();
			System.out.println("Begin 6st Test: swipe");
			
			//swipe: action.longPress(ele2).moveTo(x2,580).release().perform();
			//Click on the views item in the menu of API Demos app
			
			
			driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'Date Widgets')]").click();
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'Inline')]").click();
			AndroidElement ae1 = driver.findElementByXPath("//*[@content-desc='4']");
			ae1.click();
			System.out.println("tap on hour");
			AndroidElement ae2 = driver.findElementByXPath("//*[@content-desc='5']");
			System.out.println("tap on 5");
			AndroidElement ae3 = driver.findElementByXPath("//*[@content-desc='35']");
			System.out.println("tap on 35");
			
			String isSelected = ae3.getAttribute("selected");
			System.out.println("is 35 selected before swipe: "+isSelected);

			//Create instant of TouchAction object for swipe
			TouchAction action = new TouchAction(driver);
			
			//Swipe by long press ---> move ---> release
			action.longPress(ae2).moveTo(ae3).release().perform();
			
			isSelected = ae3.getAttribute("selected");
			System.out.println("is 35 selected after swipe: "+isSelected);
			
			System.out.println("Finish 4st Swipe Test");
		}

	
}
