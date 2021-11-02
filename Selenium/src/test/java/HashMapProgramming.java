import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapProgramming {
    public static void main(String[] args) {
//        System.out.println("Hi");

        String input1 = "abcde a bbb";
        String input = input1.replace(" ","");
        char[] inputCharArray = input.toCharArray();

        HashMap<Character, Integer> output = new LinkedHashMap();

        for (Character charItem : inputCharArray) {
            if (!output.containsKey(charItem)) {
                output.put(charItem, 1);
            } else {
                output.put(charItem, output.get(charItem) + 1);
            }
        }

        System.out.println(output);

        for (Map.Entry<Character, Integer> item : output.entrySet()) {

            if (item.getValue() > 1) {
                System.out.println(item.getValue());
                System.out.println(item.getKey());
            }
        }

    }
}
