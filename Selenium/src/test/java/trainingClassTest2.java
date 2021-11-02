import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class trainingClassTest2 {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.MINUTES);
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        WebElement element1 = driver.findElement(By.id("btn2"));
        driver.findElement(By.id("btn2")).click();
        long startTime = System.currentTimeMillis();


        System.out.println("Clicked");

//        Thread.sleep(10000);
//        System.out.println("Wait is over");

        try {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            System.out.println("Inside try block");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
//            wait.until(ExpectedConditions.elementToBeSelected()
            System.out.println("wait condition is over");
            long elapsedTime1 = System.currentTimeMillis() - startTime;
            System.out.println("Time Lapsed1: " + elapsedTime1/1000 + "sec");
            driver.findElement(By.id("txt2")).sendKeys("Nikil");
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
