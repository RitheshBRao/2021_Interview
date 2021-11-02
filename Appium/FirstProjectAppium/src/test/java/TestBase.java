import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

    @Test
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName","emulator-5554");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.asus.calculator");
        dc.setCapability("appActivity",".Calculator");

        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        AndroidElement elementTap = (AndroidElement) driver.findElementByAccessibilityId("Tap");
        elementTap.click();

        WebElement elementToggle = driver.findElementByAccessibilityId("switch");
        elementToggle.click();

        System.out.println("Rect dimentions: = "+elementToggle.getRect().getDimension());
        System.out.println("Rect: = "+elementToggle.getRect().getPoint());
        System.out.println("Location: = "+elementToggle.getLocation());
        System.out.println("Size: = "+elementToggle.getSize());

//        System.out.println("co-ordinates: = "+elementToggle.getCoordinates());
//        System.out.println("center: = "+elementToggle.getCenter());
////        System.out.println("center: = "+toggle.getCenter());
//        System.out.println("locator: = "+(elementToggle.getLocation().x+elementToggle.getSize().width/2));
//        System.out.println("locator: = "+(elementToggle.getLocation().y+elementToggle.getSize().height/2));

    }

}
