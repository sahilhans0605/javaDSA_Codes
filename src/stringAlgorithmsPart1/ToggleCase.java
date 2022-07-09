package stringAlgorithmsPart1;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        for (int i = 0; i < s.length(); i++) {
            String currChar = String.valueOf(s.charAt(i));
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                System.out.print(currChar.toUpperCase());
            } else {
                System.out.print(currChar.toLowerCase());
            }
        }

//        more better way without method

//        String s = new Scanner(System.in).next();
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                System.out.print((char)('A' + currChar - 'a'));
            } else {
                System.out.print((char)('a' + currChar - 'A'));
            }
        }
    }
}
