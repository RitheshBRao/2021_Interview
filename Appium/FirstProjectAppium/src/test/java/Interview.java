import com.google.common.primitives.Chars;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Interview {

    public static void main(String[] args) {

        String input = "123a56c78eesdf";

        char[] inputCharArray = input.toCharArray();
        System.out.println(inputCharArray);

        List<Character> arrayWithoutVowels = new LinkedList<Character>();

        for (Character item : inputCharArray) {
            if (!item.equals('a') && !item.equals('e') && !item.equals('e') && !item.equals('o') && !item.equals('u')) {
                arrayWithoutVowels.add(item);
            }
        }

        System.out.println(arrayWithoutVowels);
        Collections.reverse(arrayWithoutVowels);
        System.out.println(arrayWithoutVowels);

        int counter = 0;
        for (int i = 0; i < inputCharArray.length; i++) {
            if (inputCharArray[i] != 'a' && inputCharArray[i] != 'e' && inputCharArray[i] != 'e' && inputCharArray[i] != 'o' && inputCharArray[i] != 'u') {
                inputCharArray[i] = arrayWithoutVowels.get(counter);
                counter++;
            }
        }

        System.out.println(inputCharArray);

    }
}
