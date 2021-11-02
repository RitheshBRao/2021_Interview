import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeSuite
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.planet.com/explorer");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void loginTest() throws InterruptedException {

        driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("uiautomationtrail@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Hello@123456789");
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        WebElement expected = driver.findElement(By.xpath("//h5[@class='MuiTypography-root MuiTypography-h5']"));
        Assert.assertEquals(true, expected.isDisplayed());

    }

    @Test(priority = 1)
    public void searchLocation() throws InterruptedException {

        driver.findElement(By.xpath("//span[text()='Skip']")).click();
        driver.findElement(By.xpath("//div[@title='Search and browse Planet’s imagery catalogue']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search for a Location']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//input[@placeholder='Search for a Location']")).sendKeys(Keys.ENTER);

        List<WebElement> expected = driver.findElements(By.xpath("//h6[contains(text(),'September')]"));
        Assert.assertEquals(true, expected.size() > 0);

    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
//        driver.quit();
    }
}
