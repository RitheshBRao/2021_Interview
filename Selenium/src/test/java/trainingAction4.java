import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class trainingAction4 {
//    https://www.youtube.com/watch?v=3J1mE3Iu6Bs

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.get("http://www.uitestpractice.com/Students/Actions");

        WebElement elementOne = driver.findElement(By.name("one"));
        WebElement elementSix = driver.findElement(By.name("six"));
        WebElement elementEleven = driver.findElement(By.name("eleven"));
        WebElement elementTwo = driver.findElement(By.name("two"));


        Actions action = new Actions(driver);
//        action.sendKeys()
        action.keyDown(Keys.CONTROL).click(elementOne).click(elementSix).click(elementEleven).keyUp(Keys.CONTROL).perform();
//        action.tick()
        elementTwo.click();

        Thread.sleep(10000);

        driver.quit();

    }
}
