package stringAlgorithmsPart1;

import java.util.Scanner;

public class StringCompression {

    static void compression1(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (!(s.charAt(i) == s.charAt(i + 1))) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.print(s.charAt(s.length() - 1));
    }

    static void compression2(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == s.charAt(i + 1))) {
                count++;
            } else {
                if (count != 0) {
                    System.out.print(s.charAt(i) + "" + (count + 1));
                } else {
                    System.out.print(s.charAt(i));
                }
                count = 0;
            }
        }
        System.out.print(s.charAt(s.length() - 1) + "" + (count + 1));
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        compression1(s);
        System.out.println();
        compression2(s);
    }
}
