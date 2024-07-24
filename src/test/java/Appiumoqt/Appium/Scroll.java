package Appiumoqt.Appium;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Scroll extends BaseTest{
	
	 @Test
	    public void ScrollDemo() throws MalformedURLException, InterruptedException {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Views"))).click();
//	    	 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));   // used if you have goal where to scroll
	    	
	    	 
	    	 //other syntax for scroll if udon't idea where to scroll
	    	 ScrolltoEndAction();
	    	 Thread.sleep(3000);
	}
}
