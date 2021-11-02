import java.util.LinkedHashMap;
import java.util.LinkedList;

public class InterviewClass {

    public static void main(String[] args) {
        LinkedList<Object> list=new LinkedList<Object>();

        //Adding elements to the Linked list
        list.add("Steve");
        list.add(3);
        list.add(7);

        //Adding an element to the first position
        list.addFirst("Negan");

        //Adding an element to the last position
        list.addLast("Rick");

        //Adding an element to the 3rd position
        list.add(2, "Glenn");
        LinkedHashMap<Integer,Object> lh = new LinkedHashMap();
        lh.put(1, list);

        System.out.println(lh);
    }

}
