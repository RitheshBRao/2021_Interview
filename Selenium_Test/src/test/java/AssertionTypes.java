import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTypes {

    @Test
    public void setup() {
//        SoftAssert sa = new SoftAssert();
//        System.out.println("0");
//        sa.assertTrue(false);
//
//        System.out.println("1");
        try {
            Assert.assertTrue(false);
        } catch (AssertionError e) {
            System.out.println("Expcetion Block");
        }

//        sa.assertTrue(true);
//        System.out.println("2");
    }

    @Test
    public void setup1() {
        SoftAssert sa = new SoftAssert();
        System.out.println("3");
        Assert.assertTrue(true);
        System.out.println("4");
        Assert.assertTrue(false);
        System.out.println("5");
        sa.assertTrue(false);
        System.out.println("6");
    }

    @Test
    public void test2() {

        try {

//            Assert.ass

            System.out.println("Assertion passed in Test 1");

            Assert.assertFalse(1 < 0);

            System.out.println("Assertion passed in Test 2");

            Assert.assertEquals("Sample", "Sample");

            System.out.println("Assertion Passed in Test 3");

        } catch (AssertionError ae) {

            System.out.println("Oh man Its failed");

        }
        Assert.assertTrue(6 > 3);

    }

    @Test
    public void test3() {
        Assert.assertNull(false);
    }

}
