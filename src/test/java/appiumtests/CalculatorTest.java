package appiumtests;

import java.beans.DesignMode;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTest {
	static //WebDriver driver;
	AppiumDriver driver;

	public static void main(String[] args) {
		try {
			//openCalculator();
			openMobileWebApp();
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
		WebElement two = driver.findElement(By.id("com.asus.calculator:id/digit2"));	
		WebElement plus = driver.findElement(By.id("com.asus.calculator:id/plus"));
		WebElement three = driver.findElement(By.id("com.asus.calculator:id/digit3"));
		WebElement equals = driver.findElement(By.id("com.asus.calculator:id/equal"));
		two.click();
		plus.click();
		three.click();
		equals.click();	
	}
	public static void openMobileWebApp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ASUS_ZENFONE_MAX_M2");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.get("https://www.flipkart.com/");
		System.out.println("Application Started............");
	
	}

}
