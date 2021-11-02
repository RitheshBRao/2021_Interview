import java.util.LinkedList;

public class InterviewGlobal {

    public static void main(String[] args) {
        System.out.println("Hi");
        String input = "abca";
        String input1 = input.trim();
        System.out.println(input1);
        String[] inputArray = input1.split(" ");
        System.out.println("Words Count: " + inputArray.length);

        char[] charArray = input1.toCharArray();
        LinkedList<Character> ls1 = new LinkedList<Character>();

        for(Character item:charArray){
            if(!ls1.contains(item)){
                ls1.add(item);
            }
        }

        System.out.println(ls1);

//        String out = new String(ls1);
    }

}
