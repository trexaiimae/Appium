package Appiumoqt.Appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumBasic {

	@Test	
	public void AppiumTest() throws MalformedURLException, URISyntaxException
	{
		
		//AndroidDriver
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Trexaiiemulator");
		options.setCapability("app", "C:\\Users\\USER\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		
		
		
		
		
		AndroidDriver driver =new AndroidDriver (new URI("http://127.0.0.1:4723").toURL(), options);
		
	}
	

}
