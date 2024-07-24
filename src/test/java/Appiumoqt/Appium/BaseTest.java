package Appiumoqt.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	//@Beforeclass testng that initialize what to execute first, once done it will go back to parent class and execute the code there then once done 
	//will execute the afterclass
	@BeforeClass 
	public void configureAppium() throws MalformedURLException, URISyntaxException
	{
		
		// Automate start appium server
				service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\USER\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();		
				service.start();
				
				
				//install the app automatically
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName("Trexaiiemulator");
				options.setCapability("app", "C:\\Users\\USER\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
				
				driver =new AndroidDriver (new URI("http://127.0.0.1:4723").toURL(), options);
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // not use maybe if we use the syntax wait.until(ExpectedConditions.elementToBeClickable
				
			
		
	}
	
	public void ScrolltoEndAction()
		{
		
			boolean canScrollMore;
			do
		{
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
   			    "left", 100, "top", 100, "width", 200, "height", 200,
   			    "direction", "down",
   			    "percent", 0.75
   		));
   	 	}while(canScrollMore);
		
		}
	
	
	
	public void SwipeAction(WebElement ele, String direction )
	{
		 //hold press
   	 ( (JavascriptExecutor)driver).executeScript("mobile: swipeGesture",
    			ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
   	 
    			"direction", direction,
    			"percent", 0.75
    			));
	
	}

	
	
	public void longPressAction (WebElement ele)
		{
		
			( (JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
    			ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(), "duration", 2000));
		
		}
	
	
	@AfterClass
	public void teardown()
	{
		
//		driver.quit();
//		service.stop();
	}
	
}
