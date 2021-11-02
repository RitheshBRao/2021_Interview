import com.google.common.primitives.Chars;

import java.util.Collections;
import java.util.LinkedList;

public class Interview {

    public static void main(String[] args) {

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

}
