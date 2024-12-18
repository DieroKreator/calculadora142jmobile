import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTest {

  private AndroidDriver driver;

  private URL getUrl() {
        try {
            return new URL(
                    "https://oauth-difarmo-6859d:43bdf5b4-9473-4911-aea3-e46fcdddaa26@ondemand.us-west-1.saucelabs.com:443/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
  }

  @BeforeEach
  public void setUp() {
    var options = new BaseOptions()
      .amend("platformName", "Android")
      .amend("appium:platformVersion", "9.0")
      .amend("appium:deviceName", "Samsung Galaxy S9 FHD GoogleAPI Emulator")
      .amend("appium:deviceOrientation", "portrait")
      .amend("appium:app", "storage:filename=Calculator_8.4 (503542421)_APKPure.apk")
      .amend("appium:appPackage", "com.google.android.calculator")
      .amend("appium:appActivity", "com.android.calculator2.Calculator")
      .amend("appium:automationName", "UiAutomator2")
      .amend("browserName", "")
      .amend("appium:ensureWebviewsHavePages", true)
      .amend("appium:nativeWebScreenshot", true)
      .amend("appium:newCommandTimeout", 3600)
      .amend("appium:connectHardwareKeyboard", true);

    driver = new AndroidDriver(this.getUrl(), options);
  }

  @Test
  public void sampleTest() {
    var el8 = driver.findElement(AppiumBy.accessibilityId("No result"));
    el8.click();
    var el9 = driver.findElement(AppiumBy.accessibilityId("clear"));
    el9.click();
    var el10 = driver.findElement(AppiumBy.accessibilityId("7"));
    el10.click();
    var el11 = driver.findElement(AppiumBy.accessibilityId("plus"));
    el11.click();
    var el12 = driver.findElement(AppiumBy.accessibilityId("9"));
    el12.click();
    var el13 = driver.findElement(AppiumBy.accessibilityId("equals"));
    el13.click();
    var el14 = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
    el14.click();
    var el15 = driver.findElement(AppiumBy.accessibilityId("clear"));
    el15.click();
    var el16 = driver.findElement(AppiumBy.accessibilityId("8"));
    el16.click();
    var el17 = driver.findElement(AppiumBy.accessibilityId("minus"));
    el17.click();
    var el18 = driver.findElement(AppiumBy.accessibilityId("2"));
    el18.click();
    var el19 = driver.findElement(AppiumBy.accessibilityId("equals"));
    el19.click();
    var el20 = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
    el20.click();
    var el21 = driver.findElement(AppiumBy.accessibilityId("clear"));
    el21.click();
    var el22 = driver.findElement(AppiumBy.accessibilityId("5"));
    el22.click();
    var el23 = driver.findElement(AppiumBy.accessibilityId("multiply"));
    el23.click();
    var el24 = driver.findElement(AppiumBy.accessibilityId("6"));
    el24.click();
    var el25 = driver.findElement(AppiumBy.accessibilityId("equals"));
    el25.click();
    var el26 = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
    el26.click();
    var el27 = driver.findElement(AppiumBy.accessibilityId("clear"));
    el27.click();
    var el28 = driver.findElement(AppiumBy.accessibilityId("8"));
    el28.click();
    var el29 = driver.findElement(AppiumBy.accessibilityId("1"));
    el29.click();
    var el30 = driver.findElement(AppiumBy.accessibilityId("divide"));
    el30.click();
    var el31 = driver.findElement(AppiumBy.accessibilityId("2"));
    el31.click();
    var el32 = driver.findElement(AppiumBy.accessibilityId("equals"));
    el32.click();
    var el33 = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
    el33.click();
    var el34 = driver.findElement(AppiumBy.accessibilityId("clear"));
    el34.click();
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }
}
