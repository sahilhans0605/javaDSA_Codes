package stringAlgorithmsPart1;

import java.util.Scanner;

public class CheckIfStringsAreRotations {
    public static void main(String[] args) {
        String s1 = new Scanner(System.in).next();
        String s2 = new Scanner(System.in).next();
        if (s1.length() != s2.length()) {
            System.out.println("False");
        }
        String doubleString = s1 + s1;
        if (doubleString.contains(s2)) {
            System.out.println("true");
        }else
            System.out.println("False");
    }
}
//abcdabcd