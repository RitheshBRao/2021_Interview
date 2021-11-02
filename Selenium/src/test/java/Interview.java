import com.google.common.primitives.Chars;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.LinkedList;

public class Interview {

    @Test(enabled = false)
    public void testOne() {
        String input = "test@automat ion.rithesh";
        String output = input.replace("@","").replace(".","");
        System.out.println(input);
        System.out.println(output);

        // Fetching fixed item indexes
        int positionofAt = input.indexOf("@");
        int positionofDot = input.indexOf(".");
        System.out.println(positionofAt);

        char[] inputChar = output.toCharArray();
        LinkedList<Character> li = new LinkedList(Chars.asList(inputChar));
        Collections.reverse(li);
        System.out.println(li);

        StringBuffer output1 = new StringBuffer();

        for(Character item:li){
            output1.append(item);
        }

        System.out.println(output1);

        output1.insert(positionofAt, "@");
        output1.insert(positionofDot, ".");
        System.out.println(output1);
    }


    @Test
    public void testTwo() {

        String input = " rithesh";
        String input2 = input.trim();
        System.out.println(input2);
        String input3 = String.join("@","213","sdfdf","sdfdsf");
        System.out.println(input3);
        StringBuffer sb1 = new StringBuffer("Inida");
        sb1.reverse();
        System.out.println(sb1);
        Character sb2 = sb1.charAt(2);
        System.out.println(sb2);

    }
}
