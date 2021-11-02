import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class trainingClassTest {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Actions");

        File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File DestFile = new File("D:\\test123.png");


        FileUtils.copyFile(screenshotfile, DestFile);


        Thread.sleep(5000);

//        Assert.dfgdgdfgdfg(Expected , actual)

        driver.quit();


    }
}
