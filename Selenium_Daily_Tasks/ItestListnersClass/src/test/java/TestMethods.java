import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListnerImplementation.class)
public class TestMethods extends Base{

    @BeforeSuite
    public static void setUp(){
        initDriver();
    }

    @AfterSuite
    public static void tearDown(){
        driver.quit();
    }

    @Test
    public static void method1(){
        System.out.println("Function Started");
        Assert.fail();
    }

}
