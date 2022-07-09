package stringAlgorithmsPart1;

import java.util.Scanner;

public class CheckIfAStringIsSubsequenceOfAnotherString {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        String pattern = new Scanner(System.in).next();
        StringBuilder sb = new StringBuilder(s);
//        for (int i = 0; i < pattern.length(); i++) {
//            char currChar = pattern.charAt(i);
//            int flag = 0;
//            for (int j = 0; j < sb.length(); j++) {
//                if (sb.charAt(j) == currChar) {
//                    sb = new StringBuilder(sb.substring(j + 1));
//                    flag = 1;
//                }
//            }
//
//            if (i == sb.length() - 1) {
//                System.out.println("Subsequence");
//                return;
//            }
//
//            if (flag == 0) {
//                System.out.println("Not a subsequence");
//                return;
//            }
//        }
//         MORE OPTIMISED AND A WAY BETTER APPROACH--->O(N)time and O(N)space
        char[] s1 = s.toCharArray();
        char[] s2 = pattern.toCharArray();
        int j = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == s2[j]) {
                j++;
            }
        }
        if (j == s2.length) {
            System.out.println("Subsequence");
        } else {
            System.out.println("Not a subsequence");
        }
    }
}
