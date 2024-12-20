import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;

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
    var clearBtn = driver.findElement(AppiumBy.accessibilityId("clear"));
    clearBtn.isDisplayed();
    var btn7 = driver.findElement(AppiumBy.accessibilityId("7"));
    btn7.click();
    var plusBtn = driver.findElement(AppiumBy.accessibilityId("plus"));
    plusBtn.click();
    var btn9 = driver.findElement(AppiumBy.accessibilityId("9"));
    btn9.click();
    var equalsBtn = driver.findElement(AppiumBy.accessibilityId("equals"));
    equalsBtn.click();
    var resultBox = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
    resultBox.click();
    clearBtn.click();
    var btn8 = driver.findElement(AppiumBy.accessibilityId("8"));
    btn8.click();
    var minusBtn = driver.findElement(AppiumBy.accessibilityId("minus"));
    minusBtn.click();
    var btn2 = driver.findElement(AppiumBy.accessibilityId("2"));
    btn2.click();
    equalsBtn.click();
    resultBox.click();
    clearBtn.click();
    var btn5 = driver.findElement(AppiumBy.accessibilityId("5"));
    btn5.click();
    var multiplyBtn = driver.findElement(AppiumBy.accessibilityId("multiply"));
    multiplyBtn.click();
    var btn6 = driver.findElement(AppiumBy.accessibilityId("6"));
    btn6.click();
    equalsBtn.click();
    resultBox.click();
    clearBtn.click();
    btn8.click();
    var btn1 = driver.findElement(AppiumBy.accessibilityId("1"));
    btn1.click();
    var divideBtn = driver.findElement(AppiumBy.accessibilityId("divide"));
    divideBtn.click();
    btn2.click();
    equalsBtn.click();
    resultBox.click();
    clearBtn.click();
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }
}
