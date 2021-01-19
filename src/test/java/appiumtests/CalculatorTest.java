package appiumtests;

import java.beans.DesignMode;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	static //WebDriver driver;
	AppiumDriver driver;

	public static void main(String[] args) {
		try {
			openCalculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}
	
	public static void openCalculator() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "ASUS_ZENFONE_MAX_M2");
		cap.setCapability("udid", "JBAAGF06S250D5D");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9.0");
		cap.setCapability("appPackage", "com.asus.calculator");
		cap.setCapability("appActivity", "com.asus.calculator.Calculator");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Application Started............");
		
	}

}
