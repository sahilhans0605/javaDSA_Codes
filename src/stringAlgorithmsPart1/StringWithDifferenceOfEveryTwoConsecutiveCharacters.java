package stringAlgorithmsPart1;

import java.util.Scanner;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        for (int i = 0; i < s.length() - 1; i++) {

            System.out.print(s.charAt(i) + "" + (int) (s.charAt(i + 1) - s.charAt(i)));
        }
        System.out.print(s.charAt(s.length() - 1));
    }
}
