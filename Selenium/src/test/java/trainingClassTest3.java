import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class trainingClassTest3 {

    public static void main(String[] args) throws InterruptedException {

//        https://devqa.io/webdriver-explicit-implicit-fluent-wait/


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        WebElement element1 = driver.findElement(By.id("btn2"));
        driver.findElement(By.id("btn2")).click();
        long startTime = System.currentTimeMillis();


        System.out.println("Clicked");

//        Thread.sleep(10000);
//        System.out.println("Wait is over");

        try {

            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(50, TimeUnit.SECONDS)
                    .pollingEvery(10, TimeUnit.SECONDS)
                    .ignoring(NoSuchElementException.class);

//            WebDriverWait wait = new WebDriverWait(driver, 12);
            System.out.println("Inside try block");
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
            System.out.println("wait condition is over");
            long elapsedTime1 = System.currentTimeMillis() - startTime;
            System.out.println("Time Lapsed1: " + elapsedTime1 / 1000 + "sec");
            element.sendKeys("Nikil");
            System.out.println("Values Passed");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        long elapsedTime = System.currentTimeMillis() - startTime;
        long elapsedSeconds = elapsedTime / 1000;
        long secondsDisplay = elapsedSeconds % 60;
        long elapsedMinutes = elapsedSeconds / 60;

        System.out.println("Time Lapsed: " + secondsDisplay + "sec");

        Thread.sleep(3000);

        driver.quit();
    }
}
