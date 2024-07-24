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

public class LongPress extends BaseTest{
	
	 @Test
	    public void LongPress() throws MalformedURLException, InterruptedException {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Views"))).click();
	    	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']"))).click();
	    	 wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("1. Custom Adapter"))).click();
	        
//Longpress syntax ((JavascriptExecutor) = driver.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
	    	 WebElement ele= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));	    	 
	    	 longPressAction(ele);
	    	 String MenuText = driver.findElement(By.id("android:id/title")).getText();
	    	 Assert.assertEquals(MenuText, "Sample menu");
	    	 Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
	    	
	    	
	}
}
