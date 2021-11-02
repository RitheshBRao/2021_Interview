import com.google.common.primitives.Chars;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.*;

public class DriverBase {


    @Test
    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "<exe path>")
        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//

        HashMap<Integer, String> var = new LinkedHashMap();
        var.put(1, "Rithesh");
        var.put(2, "Deeksha");
        System.out.println(var.get(1));
        System.out.println(var);

        for (Map.Entry<Integer, String> item : var.entrySet()) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
            var.put(item.getKey(), "nayi");
        }
        System.out.println(var.get(1));
        System.out.println(var);

    }

    @Test
    public void reverCheck(){
        String val3 = "abcab";
        char[] val2 = val3.toCharArray();
        LinkedList val1 = new LinkedList(Chars.asList(val2));

//        Lists.newLinkedList(Chars.asList(string.toCharArray()));
        System.out.println(val1);
        Collections.sort(val1);
        Collections.reverse(val1);


        LinkedList val5 = val1;
        System.out.println(val5);
    }
}
