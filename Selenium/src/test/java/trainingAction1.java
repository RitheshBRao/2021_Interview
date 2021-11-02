import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class trainingAction1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/");

        driver.findElement(By.


        WebElement elementProduct = driver.findElement(By.id("product-menu-toggle"));
        WebElement elementAutomate = driver.findElement(By.xpath("//a[@aria-label=\"Automate\"]//child::div[text()=\" Automate \"]"));

        Actions action = new Actions(driver);
//        action.doubleClick()

//        Action actionChain = action.moveToElement(elementProduct).moveToElement(elementAutomate).click().build();
//
//        actionChain.perform();


        action.moveToElement(elementProduct).moveToElement(elementAutomate).click().perform();
//        action.contextClick()
        Thread.sleep(5000);

        driver.quit();

    }
}
