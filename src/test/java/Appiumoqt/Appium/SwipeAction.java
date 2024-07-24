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

public class SwipeAction extends BaseTest{
	
	 @Test
	    public void Swipe() throws MalformedURLException, InterruptedException {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Views"))).click();
	    	 wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Gallery"))).click();
	    	 wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("1. Photos"))).click();
	    	 Thread.sleep(2000);
	    	 WebElement FirstImage = driver.findElement(By.xpath("//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[1]"));
	    	 Assert.assertEquals(driver.findElement(By.xpath("//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[1]")).getAttribute("focusable"), "true");	    	 
	    	 SwipeAction(FirstImage, "left");	
	    	 Assert.assertEquals(driver.findElement(By.xpath("//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[1]")).getAttribute("focusable"), "false");
	    	 
//	    	 SwipetoLeft();
//	    	 Thread.sleep(2000);
	}	
}
