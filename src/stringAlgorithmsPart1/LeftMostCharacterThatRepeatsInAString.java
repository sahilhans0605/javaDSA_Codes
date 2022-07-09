package stringAlgorithmsPart1;

import java.util.Arrays;
import java.util.Scanner;

public class LeftMostCharacterThatRepeatsInAString {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
//        for (int i = 0; i < s.length() - 1; i++) {
//            if (s.charAt(i + 1) - s.charAt(i) == 0) {
//                System.out.println(s.charAt(i));
//                return;
//            }
//        }
//        NOT THIS WAY QUESTION HAS NOT SAID CONSECUTIVE REPETITION
//        EXAMPLE geeksforgeeks ---> first left most repeating letter is g
//        Way better approach**************************
        int firstIndex[] = new int[256];
        Arrays.fill(firstIndex, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (firstIndex[s.charAt(i)] == -1) {
                firstIndex[s.charAt(i)] = i;
            } else {
                res = Math.min(firstIndex[s.charAt(i)], res);
            }

        }
        if(res!=Integer.MAX_VALUE){
            System.out.println(s.charAt(res));
        }else{
            System.out.println(-1);
        }
    }
}
