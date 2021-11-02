import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//https://www.youtube.com/watch?v=PZXw8GlV5-o
//https://www.youtube.com/watch?v=hRjVVnmmcCc

public class PageLoadTimeoutTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//        driver.findElement(By.id("btn1")).click();
//        driver.findElement(By.id("txt1")).sendKeys("Hie");

    }
}
