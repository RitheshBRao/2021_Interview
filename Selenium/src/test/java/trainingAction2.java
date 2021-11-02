import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class trainingAction2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement elementDoubleClick = driver.findElement(By.xpath("//button[contains(text(),\"Double-Click Me To\")]"));
        WebElement elementRightClick = driver.findElement(By.xpath("//span[contains(text(),\"right click me\")]"));
        WebElement elementPaste = driver.findElement(By.xpath("//span[contains(text(),\"Paste\")]"));
//        WebElement elementAutomate = driver.findElement(By.xpath("//a[@aria-label=\"Automate\"]//child::div[text()=\" Automate \"]"));

        Actions action = new Actions(driver);

//        action.doubleClick(elementDoubleClick).perform();
        action.contextClick(elementRightClick).moveToElement(elementPaste).click().perform();
//        action.contextClick(elementRightClick).perform();

        Thread.sleep(5000);

        driver.switchTo().alert().accept();
        Thread.sleep(5000);

        driver.quit();

    }
}
