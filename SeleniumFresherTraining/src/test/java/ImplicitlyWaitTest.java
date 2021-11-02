import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


//https://www.youtube.com/watch?v=OOMer-N5WY4
//https://www.hyrtutorials.com/p/waits-demo.html

public class ImplicitlyWaitTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("txt1")).sendKeys("Hie");

    }

}
