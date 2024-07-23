package Appiumoqt.Appium;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import java.time.Duration;

public class WifiSettingsName extends BaseTest {

    @Test
    public void AppiumTest() throws MalformedURLException, URISyntaxException, InterruptedException {
        // Locators appium : Xpath, id, accessibilityID, classname, androidUIAutomator
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Preference"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/checkbox"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.RelativeLayout)[2]"))).click();
        String AlertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(AlertTitle, "WiFi settings");
        
        
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.className("android.widget.EditText"))).sendKeys("Trexaii WIFI");// if using classname use AppiumBy recommended
        wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1"))).click();
        //driver.findelements(AppiumBy.className("android.widget.Button")).get(1),click(); // if there's two or more classname
        
        
    }
}