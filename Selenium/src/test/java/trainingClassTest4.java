//https://developers.perfectomobile.com/display/TT/Page+Load+Timeouts+in+Selenium
//https://gist.github.com/TamaraTrefilova/ac33670921bb669bb762c2c02c0e88bd


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class trainingClassTest4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

//        driver.findElement(By.id("btn1")).click();
//        System.out.println("Clicked");
//        driver.findElement(By.id("txt1")).sendKeys("Nikil");
//        System.out.println("Passed");

        Thread.sleep(5000);
        driver.quit();

    }
}
