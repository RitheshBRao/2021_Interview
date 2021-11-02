import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class trainingAction5 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.get("https://www.google.com/");

        Actions action = new Actions(driver);

        WebElement editBox = driver.findElement(By.name("q"));

        action.sendKeys(editBox,"Testing").sendKeys(Keys.ENTER).perform();

//        driver.findElement(By.name("q")).sendKeys("Testing");
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        Thread.sleep(5000);

        driver.quit();

    }
}
