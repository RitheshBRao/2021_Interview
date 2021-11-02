import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class trainingAction3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement elementSource = driver.findElement(By.xpath("//li[@data-id=\"2\" and @id=\"fourth\"][1]//child::a"));
        WebElement elementDestination = driver.findElement(By.xpath("//ol[@id=\"amt7\"]//li[@class=\"placeholder\"]"));

        Actions action = new Actions(driver);

//        action.dragAndDrop(elementSource,elementDestination).perform();

        action.clickAndHold(elementSource).moveToElement(elementDestination).pause(java.time.Duration.ofSeconds(10)).release().perform();

        //        Action actionChain = action.moveToElement(elementProduct).moveToElement(elementAutomate).click().build();
//
//        actionChain.perform();

//        action.moveToElement(elementProduct).moveToElement(elementAutomate).click().perform();
        Thread.sleep(5000);

        driver.quit();

    }
}
