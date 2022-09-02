package recursionClassEight;

import java.util.Scanner;

public class PrintAllSubsequencePepcoding {

    static void printSubsequence(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char currChar = str.charAt(0);
        String restOfQueue = str.substring(1);
        printSubsequence(restOfQueue, ans + "");//if answer doesn't match on online judges
//        do put below call above and vice versa
        printSubsequence(restOfQueue, ans + currChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abc";
        printSubsequence(s, "");
    }
}
//-----------------------------------Method 2----------------------------------
//package recursionClassEight;
//
//public class PrintPowerSetOrSubsequences {
//
//    static void printSubsequence(String s, int i, String newString) {
//        if (i == s.length()) {
//            System.out.println(newString);
//            return;
//        }
//        printSubsequence(s, i + 1, newString);
//        printSubsequence(s, i + 1, newString + s.charAt(i));
//    }
//
//    public static void main(String[] args) {
//        printSubsequence("abc", 0, "");
//    }
//}