// https://www.geeksforgeeks.org/sort-a-string-without-altering-the-position-of-vowels/
//Sort a string without altering the position of vowels

import java.io.*;
import java.lang.*;
import java.util.*;

class StringInterviewQuestion {

    // Function to sort the string
// leaving the vowels unchanged
    static void sortStr(String str) {
        char S[] = str.toCharArray();

        // Length of string S
        int N = S.length;

        ArrayList<Character> temp = new ArrayList<Character>();

        // Traverse the string S
        for (int i = 0; i < N; i++) {
            if (S[i] != 'a' && S[i] != 'e' &&
                    S[i] != 'i' && S[i] != 'o' &&
                    S[i] != 'u')
                temp.add(S[i]);
        }
        System.out.println(temp);

        // Sort the string temp
        if (temp.size() != 0)
            Collections.sort(temp);

        // Pointer to traverse the
        // sorted string of consonants
        int ptr = 0;

        // Traverse the string S
        for (int i = 0; i < N; i++) {
            if (S[i] != 'a' && S[i] != 'e' &&
                    S[i] != 'i' && S[i] != 'o' &&
                    S[i] != 'u')
                S[i] = temp.get(ptr++);
        }
        System.out.println(new String(S));
    }

    // Driver Code
    public static void main(String[] args) {
        String S = "Rithesh B";
        System.out.println(S);
        sortStr(S);
    }
}
