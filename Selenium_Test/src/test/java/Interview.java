import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

public class Interview {

    WebDriver driver;

    @BeforeSuite
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void homePageTest() {
        WebElement homePlaceHolder = driver.findElement(By.xpath("//a[text()=\'Home\']"));
        Assert.assertEquals(true, homePlaceHolder.isDisplayed());

    }

    @Test(priority = 1)
    public void selectINRDropdown() throws InterruptedException {
        WebElement currencyDropdown = driver.findElement(By.id("currency"));
        currencyDropdown.click();
        WebElement optionINR = driver.findElement(By.xpath("//a[text()=\' INR\']"));
        optionINR.click();
    }

    @Test(priority = 2)
    public void loginAndVerifyTest() throws InterruptedException {
        WebElement loginButton = driver.findElement(By.xpath("//a[text()=\'Login\' and @class=\'theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect\']"));
        loginButton.click();
        WebElement loginField = driver.findElement(By.xpath("//input[@name='email' and @type='email']"));
        loginField.sendKeys("user@phptravels.com");
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password' and @type='password']"));
        passwordField.sendKeys("demouser");
        WebElement loginMainButton = driver.findElement(By.xpath("//span[text()=\'Login\']"));
        loginMainButton.click();
        WebElement homePlaceHolder = driver.findElement(By.xpath("//a[text()=\'Home\']"));
        homePlaceHolder.click();
//        Assert.assertEquals(true, homePlaceHolder.isDisplayed());
        WebElement isINRSelected = driver.findElement(By.xpath("//button[@id='currency' and contains(text(), 'INR')]"));
        Assert.assertEquals(true, isINRSelected.isDisplayed());
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }


}
