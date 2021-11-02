//Sort a string without altering the position of vowels

import java.util.Collections;
import java.util.LinkedList;

public class StringInterviewQuestion1 {

    private static void output(String input) {
        char[] inputCharArray = input.toCharArray();
        System.out.println(inputCharArray);

        LinkedList<Character> withoutVowels = new LinkedList<Character>();

        for (Character item : inputCharArray) {
            if (item != 'a' && item != 'e' && item != 'i' && item != 'o' && item != 'u' && item != 'I') {
                withoutVowels.add(item);
            }
        }

        Collections.reverse(withoutVowels);
        System.out.println(withoutVowels);

        int ptr = 0;
        for (int i = 0; i < inputCharArray.length; i++) {
            if (inputCharArray[i] != 'a' && inputCharArray[i] != 'e' && inputCharArray[i] != 'i' &&
                    inputCharArray[i] != 'o' && inputCharArray[i] != 'u' && inputCharArray[i] != 'I') {
                System.out.println("---------------------->");
                inputCharArray[i] = withoutVowels.get(ptr++);
            }
        }
        System.out.println(inputCharArray);

    }

    public static void main(String[] args) {
        String input = "123a45io67";
        System.out.println(input);
        output(input);
    }

}
