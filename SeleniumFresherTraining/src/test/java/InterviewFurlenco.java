import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class InterviewFurlenco {

    //    Set<Object> output;
    Set<Object> output = new LinkedHashSet<>();
    int counter = 0;

    public void recursionMethod(StringBuffer input1) {

//        Set<Object> output = new LinkedHashSet<>();

        for (int i = 0; i < input1.length(); i++) {
            for (int j = i; j < input1.length() + 1; j++) {
//                System.out.println(i);
//                System.out.println(j);
//                System.out.println(input1.substring(i,j));
                output.add(input1.substring(i, j));
            }
        }

        input1.reverse();
        counter++;

        if (counter == 2){
            return;
        }
        recursionMethod(input1);

        System.out.println(output);

    }

    public static void main(String[] args) {
        String input = "abc";

        StringBuffer input1 = new StringBuffer(input);

        InterviewFurlenco iObj = new InterviewFurlenco();
        iObj.recursionMethod(input1);
//        input1.reverse();
//        iObj.recursionMethod(input1);

//        System.out.println(input1.substring(2,input1.length()));


//        for(int k=0;k<input1.length();k++){
//        for(int i=0;i<input1.length();i++){
//            for(int j=i;j<input1.length()+1;j++){
////                System.out.println(i);
////                System.out.println(j);
////                System.out.println(input1.substring(i,j));
//                output.add(input1.substring(i,j));
//            }
//        }
//
//        System.out.println(output);


//        System.out.println(input1);

//        for(int i=0;i<input1.length();i++){
//            for(int j=i;j<input1.length()+1;j++){
////                System.out.println(i);
////                System.out.println(j);
////                System.out.println(input1.substring(i,j));
//                output.add(input1.substring(i,j));
//            }
//        }


    }


}

//a,b,c,ab,bc,ca,abc,cba,