import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class TestListnerImplementation extends Base implements ITestListener {

    public void onTestFailure(ITestResult result) {

        System.out.println("Test Failed");
        TakesScreenshot pic = (TakesScreenshot)driver;
        File file = pic.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("D:/Projects/CEG/temp/OCT/6/test.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
