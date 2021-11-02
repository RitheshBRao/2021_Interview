import java.util.LinkedList;

public class InterviewXoriant {

    public static void main(String[] args) {
        String input = "john doeanhj";
        char[] inputArray = input.toCharArray();

        LinkedList<Character> inputList = new LinkedList<Character>();
        LinkedList<Character> duplicateList = new LinkedList<Character>();

        for (Character item : inputArray) {

            if (!inputList.contains(item)) {
                inputList.add(item);
            } else {
                duplicateList.add(item);
            }

        }

        System.out.println(duplicateList);
        System.out.println(inputList);
    }

}
