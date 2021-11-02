import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class InterviewOne {

    public static void main(String[] args) {

        String input = "1A23a56c78eesdf";

        char[] inputCharArray = input.toCharArray();
        System.out.println(inputCharArray);

        List<Character> arrayWithoutVowels = new LinkedList<Character>();
        List<Character> VowelsList = new LinkedList<Character>(Arrays.asList('a', 'e', 'o', 'u', 'i', 'A', 'E', 'I', 'O', 'U'));

        for (Character item : inputCharArray) {
            if (!VowelsList.contains(item))
                arrayWithoutVowels.add(item);
        }

        Collections.reverse(arrayWithoutVowels);
        System.out.println(arrayWithoutVowels);

        int counter = 0;
        for(int i = 0; i < inputCharArray.length; i++){
            if (!VowelsList.contains(inputCharArray[i])) {
                inputCharArray[i] = arrayWithoutVowels.get(counter);
                counter++;
            }
        }

        System.out.println(inputCharArray);
    }
}
