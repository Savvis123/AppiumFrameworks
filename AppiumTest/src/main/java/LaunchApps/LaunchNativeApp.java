package LaunchApps;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class LaunchNativeApp {

	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities cap;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "5203e9f85a1bc3ff");
		cap.setCapability("appPackage", "com.google.android.dialer");
		cap.setCapability("appActivity", ".DialtactsActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
		Assert.assertNotNull(driver);
}
}
