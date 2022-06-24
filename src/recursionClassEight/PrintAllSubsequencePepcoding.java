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
        String s = "a";
        printSubsequence(s, "");
    }
}
